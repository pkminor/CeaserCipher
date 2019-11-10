import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Encoding encode = new Encoding();
        Decoder decode = new Decoder();

        System.out.println("Enter your encryption key: ");
        Scanner scan = new Scanner(System.in);

        Integer user_key = scan.nextInt();
        encode.setKey(user_key);
        decode.setKey(user_key);

        System.out.println("Enter plain text to encrypt: ");
        String plainText = scan.next();

        System.out.println("==============================================");
        System.out.println("Plain Text: "+plainText);
        System.out.println("Key: "+user_key);

        String cipherText= encode.encrypt(plainText).getCipherText();

        System.out.println("Cipher Text: "+cipherText);
        System.out.println("Decrypted Text: "+decode.decryptText(cipherText).getPlainText());

    }
}
