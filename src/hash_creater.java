import java.math.BigInteger;
import java.security.MessageDigest;

class HashCreator {
    public String bytesToHex(String str) {
        String hash = "";
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = md.digest(str.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            hash = no.toString(16);
            while (hash.length() < 32) {
                hash = "0" + hash;
            }

        } catch (Exception e) {
            System.out.println("Exception: " + e);
        }
        return hash;

    }
}