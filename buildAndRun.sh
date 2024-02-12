#!/bin/sh
mvn clean package && docker build -t org.example/platformoon-servlet .
docker rm -f platformoon-servlet || true && docker run -d -p 8080:8080 -p 4848:4848 --name platformoon-servlet org.example/platformoon-servlet 
