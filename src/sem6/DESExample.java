package sem6;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

/*

This code uses the DES algorithm to encrypt and decrypt a message.
The key and plaintext are specified as strings, and are converted to byte arrays before being used in the encryption and decryption operations.
The cipher mode is set to ECB (Electronic Code Book) with PKCS5Padding,
which adds padding to the plaintext to ensure it is a multiple of 8 bytes long.

 */


/*

The time complexity of both the encryption and decryption operations is O(n), where n is the length of the input message.
The doFinal method of the Cipher class is used to perform the encryption and decryption operations,
and it takes O(n) time to process the input data.

*/


public class DESExample {

    public static void main(String[] args) throws Exception {
        // Set up the key and plaintext
        String keyString = "mysecretkey";
        String plaintext = "Hello, world!";
        byte[] keyBytes = keyString.getBytes("UTF8");
        byte[] plaintextBytes = plaintext.getBytes("UTF8");

        // Create the key object
        DESKeySpec desKeySpec = new DESKeySpec(keyBytes);
        SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
        SecretKey key = keyFactory.generateSecret(desKeySpec);

        // Create the cipher
        Cipher desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
        desCipher.init(Cipher.ENCRYPT_MODE, key);

        // Encrypt the plaintext
        byte[] encryptedBytes = desCipher.doFinal(plaintextBytes);

        // Print the encrypted data
        System.out.println("Encrypted data: " + new String(encryptedBytes, "UTF8"));

        // Decrypt the encrypted data
        desCipher.init(Cipher.DECRYPT_MODE, key);
        byte[] decryptedBytes = desCipher.doFinal(encryptedBytes);

        // Print the decrypted data
        System.out.println("Decrypted data: " + new String(decryptedBytes, "UTF8"));
    }
}

