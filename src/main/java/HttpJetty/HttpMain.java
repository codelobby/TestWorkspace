package HttpJetty;

import org.eclipse.jetty.server.Server;

public class HttpMain {

    public static void main(String[] args){
        try {
            Server server = new Server(8080);
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    }


