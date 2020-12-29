# TeleControl Demo



## Use Case



![example](/docs/example.PNG)





# Overview



The objective of doing this demo is to familiarize yourself with all the technologies that we are addressing in the project at the moment.

### Micro-Gateway(WSo2) 

**WSO2 Enterprise Integrator 7.1.0** is a powerful configuration-driven approach to integration, which allows developers to build integration solutions graphically.

This is a hybrid platform that enables API-centric integration and supports various integration architecture styles: microservices architecture, cloud-native architecture, or a centralized ESB architecture. This integration platform offers a graphical/configuration-driven approach to developing integrations for any of the architectural styles.

[Quick Start Guide WSO2 Micro Integrator](https://ei.docs.wso2.com/en/latest/micro-integrator/overview/quick-start-guide/)

![](/docs/wso2.PNG)

### Micro-Service(Spring-Boot)

**Spring Boot** is an open source Java-based framework used to create a micro Service. It is developed by Pivotal Team and is used to build stand-alone and production ready **spring** applications.

[Spring Boot ](https://spring.io/projects/spring-boot)



### Message Broker(Kafka)

**Apache Kafka** is an open-source stream-processing software platform developed by the Apache Software Foundation, written in Scala and Java. The project aims to provide a unified, high-throughput, low-latency platform for handling real-time data feeds.

[Apache Kafka](https://kafka.apache.org/quickstart)

[![kafka](/docs/kafka.PNG)]()

###  Comands for Kafka

#### start zookeeper.start

`zookeeper-server-start.bat C:\kafka\config\zookeeper.properties`

#### start kafka server

`kafka-server-start.bat C:\kafka\config\server.properties`

#### Create Topic:

`kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic tlc`

#### Produce a message

`kafka-console-producer.bat --broker-list localhost:9092 --topic tlc`

#### Consume a message

`kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic tlc`



### DataBase(MongoDB)

**MongoDB** is a cross-platform document-oriented database program. Classified as a **NoSQL** database program, MongoDB uses JSON-like documents with optional schemas. 

[MongoDB - Quck Start](https://www.mongodb.com/what-is-mongodb)

![mongo](/docs/mongo.png)

####  Comands for Mongo

in  **CMD** run **mongod** to fire up the `MongoDb` instance.

### Containers(Docker-Kubernetes)

**Docker** is a set of platform as a service products that use OS-level virtualization to deliver software in packages called containers. Containers are isolated from one another and bundle their own software, libraries and configuration files; they can communicate with each other through well-defined channels.

**Kubernetes** is an open-source container-orchestration system for automating computer application deployment, scaling, and management.

[Docker](https://docs.docker.com/get-started/)

[Kubernetes](https://kubernetes.io/docs/setup/)

![](/docs/kubernetes-figure3.jpg)



### Articles to read

[Domain Driven Design Martin Fowler](https://martinfowler.com/bliki/DomainDrivenDesign.html)

[Domain Language](https://www.domainlanguage.com/ddd/)

[Tech Beacon DDD](https://techbeacon.com/app-dev-testing/get-your-feet-wet-domain-driven-design-3-guiding-principles)

[Resources on Github](https://github.com/kgoralski/personal-wiki-and-learning-resources/blob/master/domain-driven-design.md)



