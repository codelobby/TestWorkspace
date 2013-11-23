package Mokito;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

public class MokitoSpy {

    @Test
    public void shouldMokitoSpy(){
    List mokitoList = new LinkedList();

    List spy = spy(mokitoList);
    when(spy.size()).thenReturn(100);
    spy.add(1);
    spy.add(3);

    //prints "one" - the first element of a list
    System.out.println(spy.get(0));

    //Size() method was stubbed - 100 is printed
    System.out.println(spy.size());

    doReturn("stubbing").when(spy).get(1);

    System.out.println(spy.get(1));
    }
}
