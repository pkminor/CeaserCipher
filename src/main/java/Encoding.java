public class Encoding {
    private String cryptText;
    private int key;

    public Encoding encrypt(String inputText){
        return this;
    }

    public String getCryptText(){
        return "";
    }

    public int getKey(){
        return this.key;
    }

    public void setKey(int key){
        this.key=key;
    }
}
