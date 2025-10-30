# Multi-stage build for Spring Boot application

# Stage 1: Build the application
FROM maven:3.9-eclipse-temurin-21-alpine AS build
WORKDIR /app

# Copy pom.xml and download dependencies
COPY pom.xml .
RUN mvn dependency:go-offline -B

# Copy source code and build
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Create the runtime image
FROM eclipse-temurin:21-jre-alpine
WORKDIR /app

# Add a non-root user
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring

# Copy the jar from build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
