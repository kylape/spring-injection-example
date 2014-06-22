/*
 * To the extent possible under law, Red Hat, Inc. has dedicated all copyright 
 * to this software to the public domain worldwide, pursuant to the CC0 Public 
 * Domain Dedication. This software is distributed without any warranty.  See 
 * <http://creativecommons.org/publicdomain/zero/1.0/>.
 */

package com.redhat.gss.jaxws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.jboss.logging.Logger;
import javax.annotation.PostConstruct;

@javax.jws.WebService(endpointInterface="com.redhat.gss.jaxws.Hello")
public class HelloWS implements Hello {
  private Logger log = Logger.getLogger(this.getClass().getName());

  @Autowired
  private HelloDelegate delegate;

  public String hello(String name) throws Exception {
    log.warn("Hash code: " + Integer.toHexString(hashCode()));
    if(delegate == null)
      throw new IllegalStateException("Delegate not injected");

    String greeting = delegate.greet(name);
    log.info(greeting);
    return greeting;
  }
}
