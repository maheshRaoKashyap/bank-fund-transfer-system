FROM eclipse-temurin:17-jdk

WORKDIR /app

COPY target/*.jar app.jar
RUN chmod +x mvnw

RUN ./mvnw clean package -DskipTests

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]