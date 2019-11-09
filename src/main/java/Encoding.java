import java.util.HashMap;
import java.util.Map;

public class Encoding {

    private String cipherText;
    private int key;
    private Map<String,Integer> CharMapInt;
    private Map<Integer, String> IntMapChar;

    public Encoding(){
        this.CharMapInt =  new HashMap<String, Integer>();
        this.IntMapChar =  new HashMap<Integer, String>();

        int i=1;
        for(char c='A'; c<='Z'; c++){
            this.CharMapInt.put(String.valueOf(c),i);
            this.IntMapChar.put(i,String.valueOf(c));
            i++;
        }


    }

    public Encoding encrypt(String plainText){
         //ensure key is initialized
         if(Integer.valueOf(this.key)==null) this.key=1;
         if(plainText=="") plainText="A";

         int charInt = this.CharMapInt.get(plainText);
         int shifted = (charInt+this.key) % 26;
         this.cipherText = this.IntMapChar.get(shifted);
         return this;
    }

    public String getCipherText(){
        return (this.cipherText !=null)? this.cipherText : "";
    }

    public int getKey(){ return this.key;  }
    public void setKey(int key){ this.key=key; }
}
