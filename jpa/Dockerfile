FROM jelastic/maven:3.9.5-openjdk-21 AS MAVEN_BUILD
MAINTAINER Hasan Kadir Demircan

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/

RUN mvn package -Dmaven.test.skip=true

FROM openjdk:21-jdk-slim

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/jpa-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "jpa-0.0.1-SNAPSHOT.jar", "--spring.profiles.active=dev"]