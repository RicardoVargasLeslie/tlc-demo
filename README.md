# tlc-demo


# start zookeeper.start bat file like below

zookeeper-server-start.bat C:\kafka\config\zookeeper.properties

# start kafka server

kafka-server-start.bat C:\kafka\config\server.properties

# Create Topic:

kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 -topic tlc

# Produce a message

kafka-console-producer.bat --broker-list localhost:9092 --topic tlc

# Consume a message

kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic tlc

