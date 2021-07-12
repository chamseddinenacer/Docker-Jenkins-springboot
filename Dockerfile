FROM openjdk:16.0.1
ADD target/DockerExemple-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]