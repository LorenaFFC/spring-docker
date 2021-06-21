FROM openjdk
COPY ./target/Application-0.0.1-SNAPSHOT.jar Application-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","Application-0.0.1-SNAPSHOT.jar"]