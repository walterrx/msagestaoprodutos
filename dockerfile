FROM openjdk:23-slim-bullseye
COPY target/msagestaoprodutos-0.0.1-SNAPSHOT.jar msagestaoprodutos.jar
ENTRYPOINT ["java","-jar","/msagestaoprodutos.jar"]