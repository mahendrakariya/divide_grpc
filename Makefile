USERNAME=mahendrakariya
IMAGE=divide_grpc
VERSION=0.0.1

build:
	gradle clean build jar

docker-build: build
	docker build -t $(USERNAME)/$(IMAGE):$(VERSION) .

docker-run: docker-build
	docker run -p 3004:50052 --network host $(USERNAME)/$(IMAGE):$(VERSION)

docker-push: docker-build
	docker push $(USERNAME)/$(IMAGE):$(VERSION)

