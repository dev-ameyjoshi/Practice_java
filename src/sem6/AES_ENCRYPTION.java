package sem6;


// Java program to demonstrate the creation
// of Encryption and Decryption with Java AES

//The time complexity of both the encryption and decryption operations is O(n), where n is the length of the input message.

import javax.crypto.Cipher;
//Provides the classes and interfaces for cryptographic operations.
import javax.crypto.KeyGenerator;
//This class provides the functionality of a secret (symmetric) key generator.
import javax.crypto.SecretKey;
//A secret (symmetric) key. The purpose of this interface is to group (and provide type safety for) all secret key interfaces.
import javax.crypto.spec.GCMParameterSpec;
//Specifies the set of parameters required by a Cipher using the Galois/Counter Mode (GCM) mode.
import java.util.Base64;
//This class implements a decoder for decoding byte data using the Base64 encoding scheme

//Legal key sizes applicable are : 128, 192, and 256 bits.




public class AES_ENCRYPTION {

    //Initialized Keys
    private SecretKey key;
    private final int KEY_SIZE = 256;
    private final int DATA_LENGTH = 128;
    private Cipher encryptionCipher;

    public void init() throws Exception {
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(KEY_SIZE);
        key = keyGenerator.generateKey();

    }
    //Encryption
    //In order to create a Cipher object, the application calls the Cipher's getInstance method,
    // and passes the name of the requested transformation to it.

    public String encrypt(String data) throws Exception {
        byte[] dataInBytes = data.getBytes();
        encryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        encryptionCipher.init(Cipher.ENCRYPT_MODE, key);
        byte[] encryptedBytes = encryptionCipher.doFinal(dataInBytes);
        return encode(encryptedBytes);
    }


    //Decryption
    public String decrypt(String encryptedData) throws Exception {
        byte[] dataInBytes = decode(encryptedData);
        Cipher decryptionCipher = Cipher.getInstance("AES/GCM/NoPadding");
        GCMParameterSpec spec = new GCMParameterSpec(DATA_LENGTH, encryptionCipher.getIV());
        decryptionCipher.init(Cipher.DECRYPT_MODE, key, spec);
        byte[] decryptedBytes = decryptionCipher.doFinal(dataInBytes);
        return new String(decryptedBytes);
    }

    //Encoding And Decoding
    private String encode(byte[] data) {
        return Base64.getEncoder().encodeToString(data);
    }

    private byte[] decode(String data) {
        return Base64.getDecoder().decode(data);
    }


    public static void main(String[] args) {
        try {
            AES_ENCRYPTION aes_encryption = new AES_ENCRYPTION();
            aes_encryption.init();
            String encryptedData = aes_encryption.encrypt("The encryption world");
            String decryptedData = aes_encryption.decrypt(encryptedData);

            System.out.println("Encrypted Data : " + encryptedData);
            System.out.println("Decrypted Data : " + decryptedData);
        } catch (Exception ignored) {
        }
    }
}
