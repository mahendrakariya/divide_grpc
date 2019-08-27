import com.gojek.test.divide.Numbers;
import com.gojek.test.divide.Resp;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
import java.util.logging.Logger;

import static com.gojek.test.divide.DivideGrpc.getDoDivideMethod;

class DivideServer {

    private Server server;
    private static final Logger logger = Logger.getLogger(DivideServer.class.getName());

    private void start() throws IOException {
        /* The port on which the server should run */
        int port = 50052;
        server = ServerBuilder.forPort(port)
                .addService(new DivideImpl())
                .build()
                .start();

        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may have been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                DivideServer.this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    private void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    /**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }


    public static void main(String[] args) throws IOException, InterruptedException {
        final DivideServer server = new DivideServer();
        server.start();
        server.blockUntilShutdown();
    }

    static class DivideImpl extends com.gojek.test.divide.DivideGrpc.DivideImplBase {
        @Override
        public void doDivide(Numbers request, StreamObserver<Resp> responseObserver) {
            Resp reply = Resp.newBuilder().setQ(request.getA()/request.getB()).build();
            responseObserver.onNext(reply);
            responseObserver.onCompleted();
        }
    }

}
