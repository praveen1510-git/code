FROM eclipse-temurin:17
COPY target/tech.jar tech.jar
CMD [ "java", "-jar", "tech.jar" ]
