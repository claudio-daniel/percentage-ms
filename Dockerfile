FROM openjdk:22
COPY target/percentage.ms-0.0.1-SNAPSHOT.jar percentage.ms-0.0.1-SNAPSHOT.jar
EXPOSE 9009
ENTRYPOINT ["java","-jar","/percentage.ms-0.0.1-SNAPSHOT.jar"]