package config;

import java.util.logging.Level;
import java.util.logging.Logger;

public class App {
    public static void main(String[] args) {
        try {
            EncryptDecrypt ed = new EncryptDecrypt("RwBBPPEFygamUuNo");
            //encrypt
            String encrypted = ed.encrypt("kiki123");
            System.out.println(encrypted);
            //decrypt
            String decrypted = ed.decrypt(encrypted);
            System.out.println(decrypted);
            //System.out.println(ed.key());
        } catch (Exception ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        }
    }    
}
