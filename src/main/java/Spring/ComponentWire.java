package Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentWire {
    private AutowireClass message;

    @Autowired
    public void setMessage(AutowireClass message){
        this.message  = message;
    }

    public void getMessage(){
        System.out.println("Your Message : " + message.getRandomInt());
    }
}