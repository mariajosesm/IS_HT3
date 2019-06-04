FROM openjdk:8-jre-alpine
EXPOSE 2020
ADD IS_HT3-1.0-SNAPSHOT.jar IS_HT3.jar
ENTRYPOINT ["java","-jar","IS_HT3.jar"]

