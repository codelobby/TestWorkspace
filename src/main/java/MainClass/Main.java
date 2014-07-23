package MainClass;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.start();
        main.interfaceMethod(new PolyMain());
        main.nestedClassMethod(new NestedClassMain.NestedClass());

    }

    private void interfaceMethod(InterfaceClass interfaceClass) {
        interfaceClass.printMe();
    }

    private void nestedClassMethod(NestedClassMain.NestedClass nestedClass) {
        nestedClass.nesterClassMethod();
    }

    private void start() {
        //ThreadSleep threadSleep = new ThreadSleep();
        //threadSleep.run();
        //System.out.println(threadSleep.getClass());
        //System.out.println(handleNullValues());
    }

    private String handleNullValues() {
        String policyNumber = null;
        return policyNumber == null || policyNumber.contains("/") ? "Value is null" : policyNumber;
    }

}
