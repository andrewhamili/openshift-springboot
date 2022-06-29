FROM openjdk:8
EXPOSE 8080
ADD target/openshift-demo-1.0.0.jar
ENTRYPOINT ["java", "-jar","/openshift-demo-1.0.0.jar"]