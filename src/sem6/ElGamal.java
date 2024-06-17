package sem6;

import java.math.*;
import java.util.*;
import java.security.*;
import java.io.*;

public class ElGamal
{
    public static void main(String[] args) throws IOException
    {

        System.out.println("El Gamal encryption of clear Text\n");
        String msg = "9876543210987654321";
        BigInteger p, b, c, secretKey;
        Random sc = new SecureRandom();
        secretKey = new BigInteger("12345678901234567890");
        //
        // public key calculation
        //
        System.out.println("secretKey = " + secretKey);
        p = BigInteger.probablePrime(64, sc);
        b = new BigInteger("3");
        c = b.modPow(secretKey, p);
        System.out.println("p = " + p);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        //
        // Encryption
        //
        System.out.print("Enter your Big Number message --> ");
        //String s = Tools.getString();
        String s = msg;
        BigInteger X = new BigInteger(s);
        BigInteger r = new BigInteger(64, sc);
        BigInteger EC = X.multiply(c.modPow(r, p)).mod(p);
        BigInteger brmodp = b.modPow(r, p);
        System.out.println("Plaintext = " + X);
        System.out.println("\nEncryption");
        System.out.println("r = " + r);
        System.out.println("EC = " + EC);
        System.out.println("b^r mod p = " + brmodp);
        //
        // Decryption
        //
        System.out.println("\nDecryption");
        BigInteger crmodp = brmodp.modPow(secretKey, p);
        BigInteger d = crmodp.modInverse(p);
        BigInteger ad = d.multiply(EC).mod(p);
        System.out.println("c^r mod p = " + crmodp);
        System.out.println("d = " + d);
        System.out.println("Alice decodes: " + ad);
    }
}