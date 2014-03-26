package Spark;

import spark.Request;
import spark.Response;

public class HomePageHandler implements RouteHandler {

    String helloWorldMessage = "Hello World!";

    @Override
    public Object process(Request request, Response response) {
        return helloWorldMessage;
    }
}
