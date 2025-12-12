#FROM maven:3.8-openjdk-17-slim AS builder
#WORKDIR /app
#COPY pom.xml .
#
#RUN mvn dependency:go-offline -B
#COPY src ./src
#RUN mvn clean package -DskipTests
#FROM amazoncorretto:21-alpine
#WORKDIR /app
#COPY --from=builder /app/target/*.jar app.jar
#EXPOSE 8081
#ENTRYPOINT ["java", "-jar", "app.jar"]

FROM amazoncorretto:21-alpine

# Set working directory
WORKDIR /app
1
# Copy Maven build output (JAR file) into container
COPY target/*.jar app.jar

# Expose application port (adjust if needed)
EXPOSE 8081

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]