import org.junit.Test;

import static org.junit.Assert.*;

public class DecoderTest {

    @Test
    public void decoder_createObject_boolean(){
        Decoder decode = new Decoder();
        assertEquals(true, decode instanceof Decoder);
    }

    @Test
    public void getPlainText_fetchPlainText_String(){
        Decoder decode = new Decoder();
        assertEquals(true, decode.getPlainText() instanceof String);
    }

    @Test
    public void decoder_decryptText_DecoderObject(){
        Decoder decode = new Decoder();
        assertEquals(true,decode.equals(decode.decrypt("Z")) );
    }

    @Test
    public void decoder_decryptSingleChar_String(){
        Decoder decode = new Decoder();
        decode.setKey(1);
        assertEquals("A",decode.decrypt("B").getPlainText() );
    }

    @Test
    public void decoder_decryptManyChar_String(){
        Decoder decode = new Decoder();
        decode.setKey(1);
        assertEquals("ABC",decode.decrypt("BCD").getPlainText() );
    }
}