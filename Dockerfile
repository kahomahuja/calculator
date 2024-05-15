FROM openjdk:17
EXPOSE 8080
ADD target/ScientificCalculator-1.0-SNAPSHOT.jar calculator.jar
ENTRYPOINT ["java","-jar","/calculator.jar"]
