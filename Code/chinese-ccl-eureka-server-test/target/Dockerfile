FROM frolvlad/alpine-oraclejdk8
VOLUME /tmp
ADD test1.jar app.jar
EXPOSE 8002
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
