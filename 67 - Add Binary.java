import java.math.BigInteger; 

class Solution {
    public String addBinary(String a, String b) {
        BigInteger da = new BigInteger(a,2);
        BigInteger db = new BigInteger(b,2);
        BigInteger result = da.add(db);

        return result.toString(2);

    }
}
