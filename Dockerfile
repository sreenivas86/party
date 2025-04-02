# Use the official Tomcat base image with JDK 17
FROM tomcat:9.0-jdk17

# Copy the WAR file from the target directory to the Tomcat webapps directory as ROOT.war
COPY target/*.war /usr/local/tomcat/webapps/ROOT.war

# Expose the default Tomcat port
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]