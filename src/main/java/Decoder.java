import java.util.HashMap;
import java.util.Map;

public class Decoder {
    private String plainText;
    private int key;
    private Map<String,Integer> CharMapInt;
    private Map<Integer, String> IntMapChar;

    public Decoder(){
        this.CharMapInt =  new HashMap<>();
        this.IntMapChar =  new HashMap<>();

        int i=0;
        for(char c='A'; c<='Z'; c++){
            this.CharMapInt.put(String.valueOf(c),i);
            this.IntMapChar.put(i,String.valueOf(c));
            i++;
        }
    }

    public String getPlainText(){return this.plainText==null? String.valueOf(""): this.plainText ;}

    public void setKey(int key){ this.key=key; }
    public int getKey(){ return this.key; }

    public Decoder decryptText(String cipherText){

        this.plainText = IntMapChar.get((CharMapInt.get(cipherText)+(26-this.key))%26);
        return this;
    }
}
