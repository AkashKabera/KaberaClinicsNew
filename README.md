# run tests in docker image in phantomjs

docker pull heerdev/selenium:6 
docker build -t heerdev/selenium:6 .
docker run -it heerdev/selenium:6  /bin/bash
git clone 

https://e51846014a067cf33ece8b621529339e6947467d@github.com/CACSPC/operr-v3-cucumber
cd operr-v3-cucumber

mvn clean verify -Dwebdriver.driver=phantonjs
# Selenium Docker Integration link
http://www.testautomationguru.com/selenium-docker-integration-through-jenkinsfile-part-3-executing-tests-inside-docker-container/


## Run following command when server is restarted
reference https://github.com/SeleniumHQ/docker-selenium
$ sudo docker network create grid
$ sudo docker run -d -p 4444:4444 --net grid --name selenium-hub selenium/hub:3.141.59-vanadium
$ sudo docker run -d --net grid -e HUB_HOST=selenium-hub -v /dev/shm:/dev/shm selenium/node-chrome:3.141.59-vanadium
$ sudo docker run -d --net grid -e HUB_HOST=selenium-hub -v /dev/shm:/dev/shm selenium/node-firefox:3.141.59-vanadium

#special case to run tests with upload files/images etc
sudo docker cp  /var/lib/jenkins/workspace/operr-v3-cucumber/test/resources ab1c03fdcf7d:/tmp
