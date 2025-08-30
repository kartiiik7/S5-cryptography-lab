import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.util.Base64;
public class Des{
    public static void main(String[] args) throws Exception {
    	String originalText = “Hello World”;
        String keyString = “01234567”;
        DESKeySpec desKeySpec = new DESKeySpec(keyString.getBytes());
        SecretKey secretKey =SecretKeyFactory.getInstance(“DES”).generateSecret(desKeySpec);
        Cipher cipher = Cipher.getInstance(“DES/ECB/PKCS5Padding”);
        Cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encryptedBytes = cipher.doFinal(originalText.getBytes());
        String encryptedText =Base64.getEncoder().encodeToString(encryptedBytes);
       	System.out.println(“Original Text: “ + originalText);
       	System.out.println(“Encrypted Text: “ + encryptedText);
    }
}