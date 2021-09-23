FROM openjdk:11
MAINTAINER baeldung.com
COPY target/demo-0.0.1-SNAPSHOT.jar demo-0.0.1.jar
ENTRYPOINT ["java","-jar","demo-0.0.1.jar"]
