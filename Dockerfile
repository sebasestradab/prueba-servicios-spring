FROM amazoncorretto:17-alpine-jdk

COPY build/libs/demo-0.0.1-SNAPSHOT.jar /app-v1.jar

ENTRYPOINT ["java", "-jar", "/app-v1.jar"]