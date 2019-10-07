from openjdk:8-jdk-alpine
Volume /tmp
ADD target/cuentas-0.0.1-SNAPSHOT.jar cuentas.jar
EXPOSE 8520
ENTRYPOINT ["java", "jar", "/cuentas.jar"]