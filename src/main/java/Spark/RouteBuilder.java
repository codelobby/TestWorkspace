package Spark;

import spark.Request;
import spark.Response;
import spark.Route;

public class RouteBuilder {

    private final String path;

    public RouteBuilder(String path) {
        this.path = path;
    }
    public static RouteBuilder route(String path) {
        return new RouteBuilder(path);
    }

    public Route withHandler(final RouteHandler routeHandler) {
        return new Route(path) {
            @Override
            public Object handle(Request request, Response response) {
                return routeHandler.process(request,response);
            }
        };
    }
}
