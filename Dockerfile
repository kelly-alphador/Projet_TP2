FROM eclipse-temurin:8-jre-alpine
WORKDIR /app
COPY target/formes-geometriques.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]