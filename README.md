# sprint-initial-jpa-mysql-groovy-starter

# environment
* Java 1.8.0_77
* Groovy 2.4.6
* Gradle 2.12
* Spring-boot 1.3.3.RELEASE
* MySQL 5.7.12

# spring starter dependencies
* data-jpa
* groovy-templates
* web

※ [FYI](https://github.com/ogasawaraShinnosuke/spring-boot-initial-jpa-mysql-groovy-starter/blob/master/build.gradle)

# started
To run [import.sql](https://github.com/ogasawaraShinnosuke/spring-boot-initial-jpa-mysql-groovy-starter/blob/master/src/main/resources/static/import.sql). to mysql-console.

``` sh
cd sprint-initial-jpa-mysql-groovy-starter
gradle build
java -jar build/libs/substrate-0.0.1-SNAPSHOT.jar
```

After jar-file is started, run [insert.sql](https://github.com/ogasawaraShinnosuke/spring-boot-initial-jpa-mysql-groovy-starter/blob/master/src/main/resources/static/insert.sql).

`curl localhost:8080/users/1`
