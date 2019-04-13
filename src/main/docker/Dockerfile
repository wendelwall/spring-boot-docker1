FROM java:8
VOLUME /tmp
ADD spring-boot-docker-2.0.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8089
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]