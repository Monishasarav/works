FROM eclipse-temurin:17
COPY target/works.jar works.jar
CMD ["java","-jar","works.jar"]
