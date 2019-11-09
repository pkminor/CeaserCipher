import org.junit.Test;

import static org.junit.Assert.*;

public class EncodingTest {

    @Test
    public void encoding_createObject_boolean() throws Exception{
        Encoding encoder = new Encoding();
        assertEquals(true, encoder instanceof Encoding);
    }

    @Test
    public void getCryptText_fetchCryptText_String(){
        Encoding encoder = new Encoding();
        assertEquals(true,encoder.getCryptText() instanceof String);
    }

    @Test
    public void getKey_fetchKey_Integer(){
        Encoding encoder = new Encoding();
        assertEquals(true,encoder.getKey() instanceof Integer);
    }


}