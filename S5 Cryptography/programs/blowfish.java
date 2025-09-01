import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import java.crypto.KeyGenerator;
import java.swing.JOptionPane;
import java.util.Base64;

public class Blowfish {
public static void main(String[] args) throws Exception {
KeyGenerator keyGenerator= keyGenerator.getInstance("Blowfish");
KeyGenerator.init(128);
Cipher cipher = Cipher.getInstance("Blowfish");
String inputText=JOptionPane.showInputDialog(“Input the message”);
cipher.init(Cipher.ENCRYPT_MODE,SecretKey);
byte[] encryptedBytes=cipher.doFinal(inputText.getBytes());
String encryptedText=Base64.getEncoder().encodeToString(encryptedBytes);
cipher.init(Cipher.DECRYPT_MODE,SecretKey);
byte[] decryptedBytes= cipher.doFinal(encryptedBytes);
JOptionPane.showMessageDialog(JOption.getRootFrame(),
”Original Text: ”+inputText+”\n”+”Encrypted Text: ”+ new string (encryptedText)
+”\n”+” Decrypted Text: ”+”new string(decryptedBytes)”;
}
}

