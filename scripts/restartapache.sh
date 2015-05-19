#!/bin/bash
cp /usr/share/tomcat7/webapps/target/BankSample-1.0.war /usr/share/tomcat7/webapps
service httpd restart > /var/log/restartapache.out 2>&1