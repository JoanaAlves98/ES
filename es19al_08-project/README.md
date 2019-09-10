# Adventure Builder [![Build Status](https://travis-ci.com/tecnico-softeng/es19al_08-project.svg?token=xDPBAaQ2epnFt9PRstYY&branch=develop)](https://travis-ci.com/tecnico-softeng/es19al_08-project)[![codecov](https://codecov.io/gh/tecnico-softeng/es19al_08-project/branch/develop/graph/badge.svg?token=QEVL3rtRT7)](https://codecov.io/gh/tecnico-softeng/es19al_08-project)


To run tests execute: mvn clean install

To see the coverage reports, go to <module name>/target/site/jacoco/index.html.

### Rastreabilidade do trabalho

Ordene a tabela por ordem crescente da data de término.

|   Issue id | Owner (ist number)      | Owner (github username) | PRs id (with link)                                                      |            Date    |  
| ---------- | ----------------------- | ----------------------- | ----------------------------------------------------------------------- |------------------- |
|165         | 86507                   | rita-p                  |https://github.com/tecnico-softeng/es19al_08-project/pull/170            | 7/5/2019           |
|154         | 86507                   | rita-p                  |https://github.com/tecnico-softeng/es19al_08-project/pull/184            | 7/5/2019           |
|167         | 83469                   | frediramos              |https://github.com/tecnico-softeng/es19al_08-project/pull/186            | 8/5/2019           |
|155         | 83469                   | frediramos              |https://github.com/tecnico-softeng/es19al_08-project/pull/188            | 8/5/2019           |
|173         | 83469                   | frediramos              |https://github.com/tecnico-softeng/es19al_08-project/pull/197            | 9/5/2019           |
|172         | 83469                   | frediramos              |https://github.com/tecnico-softeng/es19al_08-project/pull/198            | 9/5/2019           |
|174         | 83469                   | frediramos              |https://github.com/tecnico-softeng/es19al_08-project/pull/200            | 10/5/2019          |
|158		 | 83431 				   | andreiaslopes			 |https://github.com/tecnico-softeng/es19al_08-project/pull/201            | 10/5/2019			|
|179         | 86507                   | rita-p                  |https://github.com/tecnico-softeng/es19al_08-project/pull/199            | 9/5/2019           |
|182         | 86507                   | rita-p                  |https://github.com/tecnico-softeng/es19al_08-project/pull/190            | 9/5/2019           |
|181         | 86507                   | rita-p                  |https://github.com/tecnico-softeng/es19al_08-project/pull/195            | 10/5/2019          |
|180         | 86439                   | JoanaAlves98            |https://github.com/tecnico-softeng/es19al_08-project/pull/194            | 9/5/2019           |
|178         | 86439                   | JoanaAlves98            |https://github.com/tecnico-softeng/es19al_08-project/pull/193            | 9/5/2019           |
|171         | 86439                   | JoanaAlves98            |https://github.com/tecnico-softeng/es19al_08-project/pull/196            | 9/5/2019           |
|159         | 86439                   | JoanaAlves98            |https://github.com/tecnico-softeng/es19al_08-project/pull/185            | 8/5/2019           |
|162         | 86439                   | JoanaAlves98            |https://github.com/tecnico-softeng/es19al_08-project/pull/166            | 6/5/2019           |
|175         | 86439                   | JoanaAlves98            |https://github.com/tecnico-softeng/es19al_08-project/pull/204            | 10/5/2019           |
|177         | 86439                   | JoanaAlves98            |https://github.com/tecnico-softeng/es19al_08-project/pull/206            | 10/5/2019           |
|176         | 86507                   | rita-p                  |https://github.com/tecnico-softeng/es19al_08-project/pull/205            | 10/5/2019          |
|168         | 86475                   | maria.forjo             |https://github.com/tecnico-softeng/es19al_08-project/pull/187            | 9/5/2019          |
|156         | 86475                   | maria.forjo             |https://github.com/tecnico-softeng/es19al_08-project/pull/203            | 10/5/2019          |






### Infrastructure

This project includes the persistent layer, as offered by the FénixFramework.
This part of the project requires to create databases in mysql as defined in `resources/fenix-framework.properties` of each module.

See the lab about the FénixFramework for further details.

#### Docker (Alternative to installing Mysql in your machine)

To use a containerized version of mysql, follow these stesp:

```
docker-compose -f local.dev.yml up -d
docker exec -it mysql sh
```

Once logged into the container, enter the mysql interactive console

```
mysql --password
```

And create the 6 databases for the project as specified in
the `resources/fenix-framework.properties`.

To launch a server execute in the module's top directory: mvn clean spring-boot:run

To launch all servers execute in bin directory: startservers

To stop all servers execute: bin/shutdownservers

To run jmeter (nogui) execute in project's top directory: mvn -Pjmeter verify. Results are in target/jmeter/results/, open the .jtl file in jmeter, by associating the appropriate listeners to WorkBench and opening the results file in listener context
