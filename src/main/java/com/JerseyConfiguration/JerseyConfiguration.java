package com.JerseyConfiguration;

import com.resource.TextResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

/**
 * This is Jersey Configuration , Add the resource classes here
 */
@Component
@ApplicationPath("/")
public class JerseyConfiguration extends ResourceConfig {

    @Autowired
    public JerseyConfiguration(){

        register(TextResource.class);


    }

}
