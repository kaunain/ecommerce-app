FROM openjdk
VOLUME /tmp
EXPOSE 8761
ADD target/eureka-service-0.0.1-SNAPSHOT.jar eureka-service-0.0.1-SNAPSHOT.jar 
ENTRYPOINT ["java","-jar","/eureka-service-0.0.1-SNAPSHOT.jar"]

