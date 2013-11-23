package Spark;

import spark.Filter;
import spark.Request;
import spark.Response;

import static spark.Spark.before;
import static spark.Spark.staticFileLocation;

public class SparkMain {

    public static void main(String[] args) {

        //  setPort(5678); <- Uncomment this if you wan't spark to listen on a port different than 4567.

        staticFileLocation("/webapp");

        before(new Filter() {
            @Override
            public void handle(Request request, Response response) {
            }
        });
    }
}
