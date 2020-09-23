package com.JerseyConfiguration;

import com.resource.TextResource;
import com.resource.TextResourceImpl;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/")
public class JerseyConfiguration extends ResourceConfig {

    @Autowired
    public JerseyConfiguration(){

        register(TextResource.class);


    }

}
