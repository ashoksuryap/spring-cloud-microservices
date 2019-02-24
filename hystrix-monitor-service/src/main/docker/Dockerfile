FROM java:8
MAINTAINER Ashok Peravali

ADD hystrix-monitor-service-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-Xmx200m", "-jar", "/app.jar"]

EXPOSE 9000