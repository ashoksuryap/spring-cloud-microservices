FROM java:8
VOLUME /tmp
ADD review-service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8050
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]