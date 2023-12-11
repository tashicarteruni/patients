import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Encryption 
{
    public static void encryptString(String input) throws NoSuchAlgorithmException {
    MessageDigest md = MessageDigest.getInstance("SHA-512");

    byte[] messageDigest = md.digest(input.getBytes());

    BigInteger bigInt = new BigInteger(1, messageDigest);

    System.out.println(bigInt.toString(16));
  }
    public static void main(String[] args) throws Exception 
    {
        encryptString(args[0]);
    }
}
