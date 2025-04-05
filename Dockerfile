FROM openjdk:latest
EXPOSE 8080
ADD target/demo.jar demo.jar
ENTRYPOINT ["-java", "jar", "demo.jar"]
#this is just a comment I want to add I will edit the expose port later just to check git commands