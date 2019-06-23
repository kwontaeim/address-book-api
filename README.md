# Address Book Rest API

A test implementation of a REST API using Spring Boot, Java 8.


## How to run the application

This is a Spring Boot project built with Maven 4 and Java 8. So, after you clone it, you can follow [Spring Boot instructions](https://docs.spring.io/spring-boot/docs/current/reference/html/using-boot-running-your-application.html) and run the address book application with one of the following 3 ways:

* Type `mvn spring-boot:run` in your console, to use the Maven plugin.
* Build the project with `mvn install` and then run it as a packaged application with `java -jar target/address-book-api-1.0-SNAPSHOT.jar`.
* Load the project on your favourite IDE and run it from there. For Eclipse, this would be `mvn install eclipse:eclipse` to build the project, Import -> Existing Projects into Workspace and finally Run as Java Application on the Application.java file.



## What to expect to see

When you run the application a Address Book API will be exposed under the URI `http://localhost:8080/addresses?surname={surname}`. You can type this URI on your favourite browser to see the customers that are already registered. If the customer that you would like to search by surname exists, you can also see the 'hyper link' that calls another api to get the full customer's detail. 
