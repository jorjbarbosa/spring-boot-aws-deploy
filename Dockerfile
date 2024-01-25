FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/app-1.0.0.jar app-1.0.0.jar
EXPOSE 8080
CMD ["java", "-jar", "app-1.0.0.jar"]