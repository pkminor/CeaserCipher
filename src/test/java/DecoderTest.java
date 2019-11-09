import org.junit.Test;

import static org.junit.Assert.*;

public class DecoderTest {

    @Test
    public void decoder_createObject_boolean(){
        Decoder decode = new Decoder();
        assertEquals(true, decode instanceof Decoder);
    }

}