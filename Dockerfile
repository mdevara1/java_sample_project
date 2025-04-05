FROM openjdk:21-jdk-slim
EXPOSE 8080
#just a comment that i like to see if it can be reverted
ADD target/serviceB-0.0.1-SNAPSHOT.jar serviceb.jar
ENTRYPOINT ["java","-jar","/serviceb.jar"]
