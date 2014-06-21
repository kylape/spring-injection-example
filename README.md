#Simple JBossWS-CXF web service with Spring

This shows how to set up a simple `jbossws-cxf.xml` file to be picked up by JBossWS to configure CXF via a Spring beans file.  

##Instructions

- Make sure to set the `jboss-home` property in pom.xml
- `mvn install jboss-as:deploy` to build and deploy
- `mvn exec:exec` to run standalone client
- Spring will need to be installed in a module named `org.springframework.spring`.
