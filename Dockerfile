FROM eclipse-temurin:17
COPY target/Aws3.jar  Aws33.jar
CMD [ "java", "-jar", "Aws33.jar" ]