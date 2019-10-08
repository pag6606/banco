FROM openjdk:8-alpine
VOLUME /tmp
ADD target/cuentas-0.0.1-SNAPSHOT.jar cuentas.jar
EXPOSE 8520
ENTRYPOINT ["java", "-jar", "/cuentas.jar"]