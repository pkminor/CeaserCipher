import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public void encoding_createObject_boolean() throws Exception{
        Encoding encoder = new Encoding();
        assertEquals(true, encoder instanceof Encoding);
    }

    @Test
    public void getCipherText_fetchCryptText_String(){
        Encoding encoder = new Encoding();
        assertEquals(true,encoder.getCipherText() instanceof String);
    }

    @Test
    public void getKey_fetchKey_int(){
        Encoding encoder = new Encoding();
        encoder.setKey(1);
        assertEquals(1,encoder.getKey());
    }

    @Test
    public void encrypt_encryptText_EncodingObject(){
        Encoding encoder = new Encoding();
        assertEquals(true,encoder.encrypt("").equals(encoder));
    }

    @Test
    public void setKey_initializePropertyKey_int(){
        Encoding encoder = new Encoding();
        encoder.setKey(1);
        assertEquals(1, encoder.getKey());

    }

    @Test
    public void encrypt_encryptSingleChar_String(){
        Encoding encoder = new Encoding();
        encoder.setKey(1);
        String cipher = encoder.encrypt("A").getCipherText();
        assertEquals("B",cipher);
    }

    @Test
    public void encrypt_encryptManyChar_String(){
        Encoding encoder = new Encoding();
        encoder.setKey(1);
        String cipher = encoder.encrypt("ABC").getCipherText();
        assertEquals("BCD",cipher);
    }

}