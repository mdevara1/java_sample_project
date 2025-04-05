FROM openjdk:21-jdk-slim
EXPOSE 8082
ADD target/serviceB-0.0.1-SNAPSHOT.jar serviceb.jar
ENTRYPOINT ["java","-jar","/serviceb.jar"]
