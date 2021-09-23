# hello-docker
Learning docker and CI / CD


COMMANDS: 
# generate .jar file into /target folder
mvn clean package 

# execute jar file 
java -jar hello-world.jar

# create service link for the jar file 
sudo ln -s /home/dario/Desktop/hello-docker/demo-0.0.1-SNAPSHOT.jar /etc/init.d/hello-world

# list all services 
systemctl --type=service 


DOCKER COMMANDS:
docker ps 
docker run hello-world 
sudo docker run -d -p 3000:80 tutum/hello-world  (-d detach mode)


# for the Dockerfile
FROM openjdk:11
COPY target/docker-message-server-1.0.0.jar message-server-1.0.0.jar
ENTRYPOINT ["java","-jar","/message-server-1.0.0.jar"]

docker build --tag=message-server:latest . 
docker image ls 
docker run -d -p 8887:8888 message-server:latest 
