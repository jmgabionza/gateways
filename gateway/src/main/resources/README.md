This application was built using the following:
   - Java 1.8
   - Maven
   - Spring Boot
   - Jackson
   - H2 in-memory database


WorkFlow:
	1. HTTP POST request is received in the GatewayController
	2. Serialize JSON request to Java Object
	3. Hand to appropriate Service layer
	4. Appropriate Database actions

Main Class:
App.java

Creating a build:
	1. unzip the project to desired location
	2. open command prompt and go to the directory where the project was unzipped.
	3. run the maven command: mvn clean install
	4. jar file should be located under the `target` folder

Running the build:
	java -jar gateway.jar

