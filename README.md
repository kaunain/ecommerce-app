# ecommerce-app
eCommerce complete Web Application with nextjs and spring boot micro service

## Steps to run this project

Use below steps to run this project

- ``` git clone https://github.com/kaunain/ecommerce-app.git ```
- create free or paid user on [Mongo DB](https://cloud.mongodb.com/)
- generate user/password for mongo DB
- cd project dir
- run for eureka service ``` ./mvnw spring-boot:run ```
- run for product service ``` ./mvnw spring-boot:run -Dspring-boot.run.arguments="--user=<mongo user> --pass=<mongo password> --cluster=<mongo cluster>" ```

## Technology Used

We are using below Technologies

- spring-boot microservice
- mongodb
- swagger
- eureka discovery services

## Eureka Discovery Service

|Key  |Value|
|-----|-----|
|port | 8761|
|name |eureka| 

## Product MicroService

|Key  |Value|
|-----|-----|
|port | 8081|
|name |product| 


## Calling A Microservice 

We can call or communicate microservice in different ways

### Using RestTemplate

Steps as given below

1. Add below code in App Main Class
  
    ``` Java
    import org.springframework.web.client.RestTemplate;

 	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
    ```
2. Add below code

``` Java
    @Autowired
    private RestTemplate restTemplate;

    String uri = "http://localhost:8082/teacher/1";
    
    ResponseEntity<Teacher> teacher = restTemplate.getForEntity(uri, Teacher.class);
    System.out.println(teacher.getBody());
```