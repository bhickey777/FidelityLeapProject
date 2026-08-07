# Initial Docker file from Sprint1
# FROM eclipse-temurin:21-jre-alpine
# WORKDIR /app
# COPY target/team-skeleton-0.1.0.jar app.jar
# ENTRYPOINT ["java", "-jar", "app.jar"]

FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR .starter/
COPY ./starter/pom.xml .
COPY ./starter/src ./src
RUN mvn -B clean package -DskipTests

FROM eclipse-temurin:21-jre-alpine
WORKDIR ./starter/app
RUN addgroup -S appgroup && adduser -S appuser -G appgroup
COPY --from=build ./starter/src/target/team-skeleton-0.1.0.jar app.jar
USER appuser
ENTRYPOINT ["java", "-jar", "app.jar"]