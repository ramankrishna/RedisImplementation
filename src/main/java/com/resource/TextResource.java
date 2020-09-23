package com.resource;

import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;



@Path("/v1/api/text/")
public class TextResource {

    @Autowired
    private TextResourceImpl textResourceImpl;

    @GET
    @Path("/{id}")
    public String getText(@PathParam("id") String id){

        return textResourceImpl.getText(id);
    }

    @POST
    @Path("/{id}")
    public String saveText(@PathParam("id") String id , @QueryParam("text") String text){
        return textResourceImpl.saveText(id,text);
    }




}