FROM jetty
VOLUME /temp
ARG WAR_FILE
ARG CONFIG_DIR
ADD ${WAR_FILE} /var/lib/jetty/webapps/ROOT.war
ADD ${CONFIG_DIR} /var/lib/jetty/resources