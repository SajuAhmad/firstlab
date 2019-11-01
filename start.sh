#!/bin/bash

# wait for 15 seconds until mysql is up
./wait-for-it.sh -t 30 database:3306

if [ $? -eq 0 ]
then
  java -jar spring-batch.jar
fi
