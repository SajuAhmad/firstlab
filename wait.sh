#!/bin/bash

echo "Check DB!"
while ! mysqladmin ping -h database -u ${MYSQL_USER} -p${MYSQL_PASSWORD}; do
    echo "Wait ..."
    sleep 1
done
echo "DB ready!"
