h2:
	mvn clean compile install package -Ph2

mongo:
	mvn clean compile install package -Pmongo -DskipTests

run:
	java -jar book-microservice/target/book-microservice-1.0.0-SNAPSHOT-runner.jar

run-mongo:
#-e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=admin
	docker run -it -p 27017:27017 mongo:4.0-xenial
