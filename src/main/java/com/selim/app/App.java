package com.selim.app;

//https://docs.aws.amazon.com/lambda/latest/dg/java-handler-io-type-pojo.html
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class App implements RequestHandler<String, String> {
    public String handleRequest(final String event, final Context context) {
        System.out.println(event);
        return "{ \"message\": \"hello world\" }";
    }
}
