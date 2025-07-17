# simple-springBoot
Simple Spring Boot App for Capgemini Spring MIG:
1. Simple Rest API
2. Integration with H2 database

Also look at [simple-quarkus](https://github.com/PieterDup98/simple-quarkus) as that repo does exactly the same, but is build with Quarkus.

## Good to know:

Run Spring Boot in development mode (if spring-boot-devtools is on the classpath.)
```shell
mvn spring-boot:dev
```

Run jar with
```shell
java -jar .\target\simple-springBoot-1.0-SNAPSHOT.jar
```

## API examples

### Insert products
```shell
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 1","price":10.0}'
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 2","price":20.0}'
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 3","price":30.0}'
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 4","price":40.0}'
curl -X POST http://localhost:8081/products -H "Content-Type: application/json" -d '{"name":"Product 5","price":50.0}'
```

### View all products
```shell
curl http://localhost:8081/products
```

### Delete a product
```shell
curl -X DELETE http://localhost:8081/products/1
```
