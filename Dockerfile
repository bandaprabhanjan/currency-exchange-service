FROM java:8
EXPOSE 8084:8080
ADD /target/currency-exchange-service.jar currency-exchange-service.jar
ENTRYPOINT ["java","-jar","currency-exchange-service.jar"]