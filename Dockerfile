FROM eclipse-temurin:17
COPY target/myjavaapp.jar myjavaapp.jar
CMD [ "java", "-jar", "myjavaapp.jar" ]

 
