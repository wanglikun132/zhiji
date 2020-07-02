FROM java:8
MAINTAINER wanglikun <738534839@qq.com>
VOLUME /tmp
ADD zhiji-0.0.1-SNAPSHOT.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]