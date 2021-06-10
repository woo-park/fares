FROM frolvlad/alpine-java:jdk8-slim
VOLUME /tmp
ADD  target/fares-1.0.jar fares.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/fares.jar"]
