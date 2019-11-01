FROM openjdk:8
COPY target/firstlab-0.0.1.jar spring-batch.jar

# script files related to check if the datastore is “ready”
ADD wait-for-it.sh wait-for-it.sh
ADD start.sh start.sh

EXPOSE 8085

CMD ["./start.sh"]
