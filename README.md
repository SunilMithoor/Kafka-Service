Kafka setup

Windows

Step 1: Download Apache Kafka

Step 2: Extract the Kafka Archive

Step 3.1: Configure Environment Variables

KAFKA_HOME    C:\kafka

edit path variable as: %KAFKA_HOME%\bin

Step 3.2: Edit Config files

zookeeper.properties

dataDir=/tmp/zookeeper ---> dataDir=C:/kafka/zookeeper

server.properties

log.dirs=/tmp/kafka-logs  ---> log.dirs=C:/kafka/kafka-logs

Step 4: Start ZooKeeper

.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Step 5: Start a Kafka Broker

.\bin\windows\kafka-server-start.bat .\config\server.properties

Step 6: Checking Kafka Services


open cmd as admin

jps
