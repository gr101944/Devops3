#!/bin/bash
cp /usr/share/tomcat7/webapps/target/BankSample-1.0.war /usr/share/tomcat7/webapps/BankSample.war
service httpd restart > /var/log/restartapache.out 2>&1