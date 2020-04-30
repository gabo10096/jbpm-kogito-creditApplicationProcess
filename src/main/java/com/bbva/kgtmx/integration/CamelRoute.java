package com.bbva.kgtmx.integration;

//import com.bbva.kgtmx.model.CreditApplication;

import org.apache.camel.builder.RouteBuilder;
//import org.apache.camel.http.common.HttpOperationFailedException;
//import org.apache.camel.model.dataformat.JsonLibrary;

public class CamelRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        // TODO Auto-generated method stub
        /*
        
        onException(HttpOperationFailedException.class)
            .setBody(simple("null"))
            .continued(true);
        
        from("direct:start")
            .setHeader("CamelHttpMethod", constant("GET"))
            .toD("http:petstore.swagger.io/v2/user/${body}")
            .unmarshal().json(JsonLibrary.Jackson, CreditApplication.class);   

        */
    }
}