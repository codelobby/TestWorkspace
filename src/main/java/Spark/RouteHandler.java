package Spark;

import spark.Request;
import spark.Response;

public interface RouteHandler {
    public Object process(Request request, Response response);
}
