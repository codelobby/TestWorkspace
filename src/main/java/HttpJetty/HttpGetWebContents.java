package HttpJetty;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HttpGetWebContents {
    public static void main(String[] args) {

        String contents;

        HttpClient httpclient = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet("http://localhost:4567");
        try {
            HttpResponse response = httpclient.execute(request);
            BufferedReader rd = new BufferedReader
                    (new InputStreamReader(response.getEntity().getContent()));

            while ((contents =rd.readLine()) != null){
                System.out.println(contents);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
