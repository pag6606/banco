FROM openjdk:8-alpine
VOLUME /tmp
ADD target/cuentas-1.0.1.jar  cuentas-1.0.1.jar
EXPOSE 8520
ENTRYPOINT ["java", "-jar", "/cuentas-1.0.1.jar"]