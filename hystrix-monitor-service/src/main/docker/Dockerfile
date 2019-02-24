FROM java:8
VOLUME /tmp
ADD hystrix-monitor-service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 9000
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]