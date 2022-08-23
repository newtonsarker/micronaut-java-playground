FROM amazoncorretto:11.0.16
LABEL org.opencontainers.image.title="Micronaut Java Playground"

RUN mkdir -p /home/logs
RUN mkdir -p /home/source
COPY . /home/source

WORKDIR /home/source
RUN ./gradlew clean build

WORKDIR /home
RUN cp /home/source/build/libs/micronaut-java-playground-0.1-all.jar /home
RUN rm -rf /home/source

ENTRYPOINT ["java", "-jar", "/home/micronaut-java-playground-0.1-all.jar"]