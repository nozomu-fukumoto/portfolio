FROM maven:3-eclipse-temurin-17 AS build
COPY . .
RUN mvn clean package -Dmaven.test.skip=true
FROM eclipse-temurin:17-alpine
COPY --from=build /target/fn-0.0.1-SNAPSHOT.jar fn.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "fn.jar"]