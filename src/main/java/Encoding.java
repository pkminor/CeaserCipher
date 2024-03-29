import javafx.print.Collation;

import java.util.*;
import java.util.stream.Collectors;

public class Encoding {

    private String cipherText;
    private int key;
    private Map<String,Integer> CharMapInt;
    private Map<Integer, String> IntMapChar;

    public Encoding(){

        this.key=1;
        this.CharMapInt =  new HashMap<>();
        this.IntMapChar =  new HashMap<>();

        int i=0;
        for(char c=' '; c<='~'; c++){
            this.CharMapInt.put(String.valueOf(c),i);
            this.IntMapChar.put(i,String.valueOf(c));
            i++;
        }

    }

    public Encoding encrypt(String plainText){

        //normalization
         if(plainText=="") plainText="A";
         plainText=plainText.toUpperCase();

         //single char mapping
         //int charInt = this.CharMapInt.get(plainText);
         //int shifted = (charInt+this.key) % 26;
         //this.cipherText = this.IntMapChar.get(shifted);

         List<String> strList= new ArrayList<>(Arrays.asList(plainText.split("")));
         List<String> cipherList= strList.stream()
                 .map(c->this.IntMapChar.get( (this.CharMapInt.get((CharMapInt.containsKey(c))? c:"A") + this.key)%95))
                 .collect(Collectors.toList());

         this.cipherText=String.join("", cipherList );

         return this;
    }

    public String getCipherText(){ return (this.cipherText !=null)? this.cipherText : "";     }
    public int getKey(){ return this.key;  }
    public void setKey(int key){ this.key=key; }
}
