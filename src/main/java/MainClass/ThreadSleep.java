package MainClass;

public class ThreadSleep implements Runnable {

    @Override
    public void run() {

        try{
            Thread.sleep(5000);
            System.out.println("Waited 5 seconds");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
