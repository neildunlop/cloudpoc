This module is a spring cloud config server.
It is configured to run on port 8080 and pull configuration settings held in a github repository.

Start it with mvn spring-boot:run

Navigate to:

http://localhost:8080/foo/default - to see the configuration of foo.properties.
http://localhost:8080/foo/development - to see the configuration foo.properties overwritten by foo-development.properties.

Spring applications can be configured to contact this service at startup.
The properties can be changed via github or via an API service.

See: http://qiita.com/making@github/items/704d8e254e03c5cce546 for more details.

