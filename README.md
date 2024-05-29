
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

  ./gradlew build

  ./gradlew run  -t
