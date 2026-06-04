# STEP 1: build jar
FROM maven:3.9.9-eclipse-temurin-17 AS build

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

# STEP 2: run app
FROM eclipse-temurin:17-jdk

WORKDIR /app
COPY --from=build /app/target/hospital-backend-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]