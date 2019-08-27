build:
	gradle clean build jar
docker-build:
	docker build -t divide_grpc .
docker-run:
	docker run -p 3004:50052 divide_grpc
