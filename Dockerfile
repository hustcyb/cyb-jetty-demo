FROM jetty
VOLUME /temp
ARG WAR_FILE
ADD ${WAR_FILE} /var/lib/jetty/webapps/ROOT.war