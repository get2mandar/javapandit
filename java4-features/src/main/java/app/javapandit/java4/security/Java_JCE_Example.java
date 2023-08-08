package app.javapandit.java4.security;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/**
 * Java Cryptography Extension (JCE) Example
 */
public class Java_JCE_Example {

	public static void main(String[] args) {

		try {
			KeyGenerator keygenerator = KeyGenerator.getInstance("DES");
			SecretKey myDesKey = keygenerator.generateKey();

			Cipher desCipher;

			// Create The Cipher
			desCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");

			// Initialize the Cipher for Encryption
			desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);

			// Sensitive Information Sample
			byte[] text = "I am the secret. No body can see me.".getBytes();

			System.out.println("Text [Byte Format] : " + text);
			System.out.println("Text : " + new String(text));
			System.out.println(" - - - - - - ");

			// Encrypt the text
			byte[] textEncrypted = desCipher.doFinal(text);

			System.out.println("Text Encryted : " + textEncrypted);

			// Initialize the same Cipher for Decryption
			desCipher.init(Cipher.DECRYPT_MODE, myDesKey);

			// Decrypt the text
			byte[] textDecrypted = desCipher.doFinal(textEncrypted);

			System.out.println("Text Decryted : " + new String(textDecrypted));

		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
