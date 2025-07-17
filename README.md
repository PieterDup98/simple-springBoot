# simple-springBoot
Simple Spring Boot App for Spring MIG Demo

## Interesting findings:

mvn spring-boot:dev runs Quarkus in development mode (if spring-boot-devtools is on the classpath.)

run java with jave -jar .\target\simple-springBoot-1.0-SNAPSHOT.jar

## Insert products
```shell
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 1","price":10.0}'
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 2","price":20.0}'
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 3","price":30.0}'
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 4","price":40.0}'
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 5","price":50.0}'
```

## View all products
```shell
curl http://localhost:8081/products
```

## Delete a product
```shell
curl -X DELETE http://localhost:8081/products/1
```