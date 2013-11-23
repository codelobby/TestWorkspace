package Mokito;

import org.junit.Test;

import java.util.LinkedList;

import static org.mockito.Mockito.*;

public class MokitoVerifyCont {

    @Test
    public void shouldMokitoVerifyInvocations(){
        LinkedList mokitoVerifyInvocations = mock(LinkedList.class);
        mokitoVerifyInvocations.add(1);
        mokitoVerifyInvocations.add(2);
        mokitoVerifyInvocations.add(2);
        mokitoVerifyInvocations.add(3);
        mokitoVerifyInvocations.add(3);
        mokitoVerifyInvocations.add(3);

        //Exact number of invocations verification
        verify(mokitoVerifyInvocations, times(1)).add(1);
        verify(mokitoVerifyInvocations, times(3)).add(3);
        //Verify never added
        verify(mokitoVerifyInvocations, never()).add(99);
    }
}
