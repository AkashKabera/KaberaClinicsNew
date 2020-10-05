#!/usr/bin/env bash

mvn clean verify -Denvironment=QA -Dwebdriver.remote.url=http://localhost:4444/wd/hub -Dwebdriver.remote.driver=chrome
mvn serenity:aggregate -Dwebdriver.driver=chrome


echo done
