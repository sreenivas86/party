
FROM tomcat

# Copy the WAR file from the target directory to the Tomcat webapps directory as ROOT.war
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war



