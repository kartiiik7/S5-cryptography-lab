import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec; 
class RC4Encryption{
    public static byte[]rc4(byte[]key,byte[]data)throws Exception{ 
        SecretKeySpec keySpec=new SecretKeySpec(key,"RC4");
        Cipher cipher=Cipher.getInstance("RC4"); cipher.init(Cipher.ENCRYPT_MODE,keySpec); return cipher.doFinal(data);
    }
    public static byte[]rc4Decrypt(byte[]key,byte[]encryptedData)throws Exception{ 
        SecretKeySpec keySpec=new SecretKeySpec(key,"RC4");
        Cipher cipher=Cipher.getInstance("RC4");
        cipher.init (Cipher.DECRYPT_MODE,keySpec); 
        return cipher.doFinal(encryptedData);
    }
    public static void main(String[] args){ 
        try{
            String key="secretpassword";
            String data="heythereiamshadirvan"; byte[]encryptedData=rc4(key.getBytes(),data.getBytes()); System.out.println("Encrypted Data: "+new String(encryptedData)); byte[]decryptedData=rc4Decrypt(key.getBytes(),encryptedData); System.out.println("Decrypted Data: "+new String(decryptedData));
        }
        catch(Exception e){ 
            e.printStackTrace();
        }
    }
}