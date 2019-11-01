#!/bin/bash

echo "creating bridge network..."
docker network create --driver bridge --subnet 192.168.0.0/24 --gateway 192.168.0.1 mybr0
echo "bridge network created..."
echo "-----------------------------------------------------------"

echo "creating mysql container..."
docker run --network mybr0 --ip 192.168.0.2 --name database -p 3306:3306 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=firstlab -e MYSQL_USER=test -e MYSQL_PASSWORD=test -d mysql
echo "mysql container created..."
echo "-----------------------------------------------------------"

echo "creating docker image from jar file..."
docker build . -t spring-batch
echo "docker image from jar file created..."
echo "-----------------------------------------------------------"

echo "creating web server container..."
docker run --network mybr0 --ip 192.168.0.3 -p 8085:8085 --name web-app -d spring-batch
echo "web server container created..."



