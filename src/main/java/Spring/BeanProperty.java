package Spring;

public class BeanProperty {

    String message;

    public void setMessage(String message){
        this.message = message;
    }

    public void printMessage(){
        System.out.println(message);
    }
}
