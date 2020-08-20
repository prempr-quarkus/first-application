# first-application

my first quarkus application

## Creation

Use the maven artifact to create default application 
```bash
mvn io.quarkus:quarkus-maven-plugin:1.7.0.Final:create
```

##Execute

```mvn
./mvnw quarkus:dev

```
## Generate config file 

```mvn
./mvnw quarkus:generate-config -Dfile=application.properties
```
## property value when executes
```bash
java -Dquarkus.datasource.password=youshallnotpass -jar target/myapp-runner.jar
```

## Native build time
```bash
./mvnw package -Pnative -Dquarkus.profile=prod-aws
./target/my-app-1.0-runner
```