# Reference service image. Build from the repository root:
#   docker build -f sut/Dockerfile -t reference-service .
#   docker run --rm -p 7070:7070 reference-service
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /src
COPY pom.xml .
COPY .mvn .mvn
COPY config config
COPY sut sut
COPY framework/pom.xml framework/pom.xml
COPY tests/pom.xml tests/pom.xml
COPY tools/pom.xml tools/pom.xml
RUN mvn -B -ntp -q -pl sut -am -DskipTests -Dspotless.check.skip=true -Dcheckstyle.skip=true package

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /src/sut/target/reference-service.jar app.jar
EXPOSE 7070
USER 10001
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
