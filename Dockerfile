FROM openjdk:21-jdk-slim
EXPOSE 8081
ADD Jenkins_demo/target/Jenkins_demo-0.0.1-SNAPSHOT.jar servicea.jar
ENTRYPOINT ["java","-jar","/servicea.jar"]