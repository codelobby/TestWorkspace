package Mokito;

import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.*;

public class MokitoBasics {

    //Minimize repetitive mock
    private LinkedList mokitoLinkedList = mock(LinkedList.class);

    @Test
    public void shouldMokitoVerify(){
        List mokitoList = mock(List.class);
        //using mock object
        mokitoList.add("ben");
        mokitoList.clear();
        //verification
        verify(mokitoList).add("ben");
        verify(mokitoList).clear();
    }

    @Test
    public void shouldMokitoStub(){
        //You can mock concrete classes, not only interfaces
        //LinkedList mokitoLinkedList = mock(LinkedList.class);
        //Stubbing
        when(mokitoLinkedList.get(3156)).thenReturn("Your Postcode is 3156");
        when(mokitoLinkedList.get(1)).thenThrow(new RuntimeException());
        //Print Test
        System.out.println(mokitoLinkedList.get(3156));
    }

    @Test
    public void shouldMokitoArgMatcher(){
        //Stubbing using built-in anyInt() argument matcher
        when(mokitoLinkedList.get(anyInt())).thenReturn("Element");
        System.out.println(mokitoLinkedList.get(979));

    }

}
