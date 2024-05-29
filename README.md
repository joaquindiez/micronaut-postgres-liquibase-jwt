
## Setup PostgrestDB

Start postgress in Docker

```
mkdir -p ~/data/postgres_demo_db
docker run -d -t -i \
    -v ~/data/postgres_demo_db:/bitnami/postgresql \
	  -e POSTGRES_DB=demoDb -e POSTGRESQL_USERNAME=postgres -e POSTGRESQL_PASSWORD=changeme \
    --name demoDb \
    -p 5432:5432 \
    bitnami/postgresql:latest

```


## Build and run App

```
   ./gradlew build
```

```
  ./gradlew run  -t
```


## Test endpoint


Test Health EndPoint


```
  curl http://locahost:8080/health
```

Test Demo EndPoint


```
  curl http://locahost:8080/demo
```


Test Beans EndPoint


```
  curl http://locahost:8080/beans
```


Test Routes EndPoint


```
  curl http://locahost:8080/routes
```
