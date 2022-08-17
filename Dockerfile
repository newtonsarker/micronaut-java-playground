FROM amazoncorretto:11.0.16
LABEL org.opencontainers.image.title="Micronaut Java Playground"

RUN mkdir -p /home/application/source
COPY . /home/application/source

WORKDIR /home/application/source
RUN ./gradlew clean build

WORKDIR /home/application
RUN cp /home/application/source/build/libs/micronaut-java-playground-0.1-all.jar /home/application
RUN rm -rf /home/application/source

ENTRYPOINT ["java", "-jar", "/home/application/micronaut-java-playground-0.1-all.jar"]