package config;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class App {
    public static void main(String[] args) {
        try {
            EncryptDecrypt ed = new EncryptDecrypt();
            //encrypt
            String encrypted = ed.encrypt("kiki123");
            System.out.println(encrypted);
            //decrypt
            String decrypted = ed.decrypt(encrypted);
            System.out.println(decrypted);
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }    
}
