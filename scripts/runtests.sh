#!/bin/bash

cd ../test/seleniumtest
mvn clean test -fae -Dproperty.name=$1 -Dtest=nz.ac.wgtn.veracity.drivers.alfresco.tests.*.*Tests
