FROM openjdk

WORKDIR /app

COPY  target/dockerize_javaprogram1-1.0-SNAPSHOT.jar .
ENTRYPOINT["java","jar","javaprogram1-1.0-SNAPSHOT.jar"]

RUN javac Sample.java

CMD ["java", "Sample"]
