FROM openjdk:8-alpine
VOLUME /tmp
ADD target/cuentas-1.0.0.jar  cuentas-1.0.0.jar
EXPOSE 8520
ENTRYPOINT ["java", "-jar", "/cuentas-1.0.0.jar"]