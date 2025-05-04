FROM openjdk:21-jdk-slim
EXPOSE 8081
ADD target/Jenkins_demo-0.0.1-SNAPSHOT.jar jenkins_demo.jar
ENTRYPOINT ["java","-jar","/jenkins_demo.jar"]