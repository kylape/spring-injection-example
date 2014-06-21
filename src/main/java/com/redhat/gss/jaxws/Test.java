/*
 * To the extent possible under law, Red Hat, Inc. has dedicated all copyright 
 * to this software to the public domain worldwide, pursuant to the CC0 Public 
 * Domain Dedication. This software is distributed without any warranty.  See 
 * <http://creativecommons.org/publicdomain/zero/1.0/>.
 */

package com.redhat.gss.jaxws;

import javax.xml.ws.Service;
import java.net.URL;
import javax.xml.namespace.QName;

import org.jboss.logging.Logger;

public class Test {

  private static Logger log = Logger.getLogger(Test.class);

  public static void main(String[] args) throws Exception {
    URL wsdl = new URL("http://localhost:8080/helloWorldSpringInjection/hello?wsdl");
    QName qname = new QName("http://jaxws.gss.redhat.com/", "HelloWSService");
    Service service = Service.create(wsdl, qname);
    Hello port = service.getPort(Hello.class);
    log.info("Invoking endpoint...");
    String ret = port.hello("Kyle");
    log.info(ret);
  }
}
