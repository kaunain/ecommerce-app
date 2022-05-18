# ecommerce-app
eCommerce complete Web Application with nextjs and spring boot micro service


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