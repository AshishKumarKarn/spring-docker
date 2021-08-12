This is a sample application to demo how to run spring boot on

Commands to run this project

1. `mvn clean install`
   ####To Rebuild the docker image if there is any change
2. `docker build -f Dockerfile -t ashishkarn/spring-docker .`
3. `docker run -p 8881:8080 --name spring ashishkarn/spring-docker`
   ####Check localhost:8881/v1/greeting
4. `docker container ls`
5. `docker stop spring`
6. `docker rm spring`

   ####Running Through Kubernetes

1. `kubectl create deployment spring-docker --image ashishkarn/spring-docker`
2. `kubectl get po`
3. `kubectl scale deployment/spring-docker --replicas 5`
4. `kubectl get po -w`
5. `kubectl expose deployment/spring-docker --port 8080 --name spring-docker --type NodePort`
6. `kubectl get services` 
   ####check port here and hit localhost:[port]/v1/greeting  -> 
   ####refresh multiple times to see load balancing
7. `kubectl delete deployment/spring-docker`
    