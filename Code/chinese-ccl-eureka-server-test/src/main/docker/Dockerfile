FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD cloud-demo-eureka-server-1.3.5.RELEASE.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]