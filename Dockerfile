FROM registry.baota.io/java:8-alpine

WORKDIR /
COPY target/SmartCar-0.0.1-SNAPSHOT.jar /app.jar
ENV SPRING_PROFILES_ACTIVE dev
ENTRYPOINT [ "sh", "-c", "java -Djava.security.egd=file:/dev/./urandom -jar /app.jar --spring.profiles.active=$SPRING_PROFILES_ACTIVE"]
EXPOSE 8080
