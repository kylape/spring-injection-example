#Simple JBossWS-CXF web service with Spring

This shows how to set up a simple `jbossws-cxf.xml` file to be picked up by JBossWS to configure CXF via a Spring beans file.  

##Instructions

- Spring will need to be installed in a module named `org.springframework.spring`.
- Start JBoss
- `mvn clean install jboss-as:deploy exec:exec` to build, deploy, and test
