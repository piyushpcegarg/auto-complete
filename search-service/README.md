## This is backend service for auto complete feature

Technology used

1. Spring Boot
2. H2

Run below command to generate docker image for backend service from root folder.

Below command fetches all the libraries so it will take 5-10 mins for first time .

```
cd search-service
./gradlew bootBuildImage
```

Above command builts image 'docker.io/library/search-service:1.0.0'

Verify whether image has successfully built by below command:

```
docker images | grep search-service
```

Now to run this service execute below command:

```
docker run -d -p 8080:8080 --name search-service search-service:1.0.0
```

To verify service is working properly execute below url in browser

```
http://localhost:8080/search?name=rr
```

API should return below response

```
[{"id":6,"name":"Terrell"},{"id":20,"name":"Darrin"},{"id":21,"name":"Larraine"},{"id":24,"name":"Sherrill"},{"id":29,"name":"Warren"},{"id":31,"name":"Garret"}]
```
