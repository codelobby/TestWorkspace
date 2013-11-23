package MainClass;

public class Main {
    public static void main(String[] args){
        Main main = new Main();
        main.threads();

    }

    private void threads() {
        ThreadSleep threadSleep = new ThreadSleep();
        threadSleep.run();
        System.out.println(threadSleep.getClass());
    }

}
