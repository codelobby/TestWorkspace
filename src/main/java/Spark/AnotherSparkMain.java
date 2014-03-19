package Spark;

import spark.Request;
import spark.Response;
import spark.Route;

import static Spark.RouteBuilder.route;
import static spark.Spark.get;

public class AnotherSparkMain {

    public static void main(String[] args) {

        startServer();
    }

    private static void startServer() {
        get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello World Homepage!";
            }
        });

        get(route("/helloWorld").withHandler(new HomePageHandler()));
    }

}
