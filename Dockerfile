FROM eclipse-temurin:17-jre

LABEL maintainer="riteshking"

WORKDIR /app

COPY target/H2ProjectCrud-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
