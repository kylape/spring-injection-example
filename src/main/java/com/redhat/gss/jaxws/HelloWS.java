/*
 * To the extent possible under law, Red Hat, Inc. has dedicated all copyright 
 * to this software to the public domain worldwide, pursuant to the CC0 Public 
 * Domain Dedication. This software is distributed without any warranty.  See 
 * <http://creativecommons.org/publicdomain/zero/1.0/>.
 */

package com.redhat.gss.jaxws;

import org.jboss.logging.Logger;

@javax.jws.WebService(endpointInterface="com.redhat.gss.jaxws.Hello")
public class HelloWS implements Hello {
  private Logger log = Logger.getLogger(this.getClass().getName());

  public String hello(String name) throws Exception {
    String greeting = "Hello, " + name;
    log.info(greeting);
    return greeting;
  }
}
