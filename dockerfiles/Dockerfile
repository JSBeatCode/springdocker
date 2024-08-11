# Base image로 OpenJDK 8을 사용
FROM openjdk:8-jre-slim

# Set the working directory to /app
WORKDIR /app

# Copy the Maven build artifact (JAR file) into the container's working directory
COPY target/springdocker-0.0.1-SNAPSHOT.jar myapp.jar

# Expose port 8080 to the host
EXPOSE 8080

# Entrypoint command to run the application
ENTRYPOINT ["java", "-jar", "myapp.jar"]