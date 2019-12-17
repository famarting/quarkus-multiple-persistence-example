
compile-h2:
	mvn clean compile install -Ph2 -Dquarkus.profile=h2

compile-mongo:
	mvn clean compile install -Pmongo -Dquarkus.profile=mongo -DskipTests

package-h2:
	cd book-microservice
	mvn package -Ph2 -Dquarkus.profile=h2
	cd ..

package-mongo:
	cd book-microservice
	mvn package -Pmongo -Dquarkus.profile=mongo -DskipTests
	cd ..

run:
	java -jar book-microservice/target/book-microservice-1.0.0-SNAPSHOT-runner.jar

run-mongo:
#-e MONGO_INITDB_ROOT_USERNAME=admin -e MONGO_INITDB_ROOT_PASSWORD=admin
	docker run -it -p 27017:27017 mongo:4.0-xenial
