#!/usr/bin/env bash

mvn clean verify -Denvironment=QA -Dwebdriver.driver=chrome
mvn serenity:aggregate -Dwebdriver.driver=chrome


echo done
