FROM openjdk:11
ADD libs/sample-hello-v1.jar hello-app.jar
ENTRYPOINT ["java", "-jar","hello-app.jar"]
EXPOSE 8080