## Requirements
- **Maven** for compiling
- **Java 17**

## Running application
### Compiling
```
$ mvn package
```

### API
Web application on port 8080 
```
$ java -jar target/<jar file>
```

### Web application
Consumer of messages from RabbitMQ
```
$ java -jar target/<jar file> --consumer
```
