package config;

import java.security.*;
import java.util.Base64;

public class passwordHasher {
    public static String hashPassword(String password) throws NoSuchAlgorithmException {
        MessageDigest md = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = md.digest(password.getBytes());
        String encoded = Base64.getEncoder().encodeToString(hashBytes);
        return encoded;
    }
}
