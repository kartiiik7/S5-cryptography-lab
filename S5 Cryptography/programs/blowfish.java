import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec; 
import java.util.Scanner;
public class blowfish {
    public static byte[] encrypt(byte[] plaintext, byte[] key) throws Exception { 
        Cipher cipher = Cipher.getInstance("Blowfish"); cipher.init(Cipher.ENCRYPT_MODE, new SecretKeySpec(key, "Blowfish")); return cipher.doFinal(plaintext);
    }
    public static byte[] decrypt(byte[] ciphertext, byte[] key) throws Exception{ 
        Cipher cipher = Cipher.getInstance("Blowfish");
        cipher.init(Cipher.DECRYPT_MODE, new SecretKeySpec(key, "Blowfish")); 
        return cipher.doFinal(ciphertext);
    }
    public static void main(String[] args) throws Exception { 
        byte[] key = "my_secret_key".getBytes();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plain text: "); byte[] plaintext = sc.nextLine().getBytes(); byte[] ciphertext = encrypt(plaintext, key);
        System.out.println("Ciphertext: " + new String(ciphertext)); byte[] decrypted = decrypt(ciphertext, key); System.out.println("Decrypted: " + new String(decrypted));
    }
}
