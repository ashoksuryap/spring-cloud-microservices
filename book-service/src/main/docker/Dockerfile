FROM java:8
VOLUME /tmp
ADD book-service-0.0.1-SNAPSHOT.jar app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8070
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -jar /app.jar" ]