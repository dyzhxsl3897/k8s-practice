# Practice Kubenates

## Project Structure
1. service1<br>
service1 is a springboot restful backend service. There is a controller in it which returns a user by a given username.
2. service2<br>
service2 is another springboot restful backend service. There is a controller in it which returns a book by a given book name.

## Kubenates Configuration
1. Create two deployments for each of the backend service
2. Create two services for each deployments
3. Create an ingress to expose 80 port, and manage the url forwarding strategy, to use the corresponding service

## Commands to turn on kubenates
1. kubectl create -f backend-service1-deployment.yaml
2. kubectl create -f backend-service2-deployment.yaml
3. kubectl create -f backend-service1-service.yaml
4. kubectl create -f backend-service2-service.yaml
5. kubectl create -f backend-service-ingress.yaml