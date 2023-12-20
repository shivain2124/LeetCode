import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        // Convert array to BigInteger
        BigInteger result = BigInteger.ZERO;
        for (int i = 0; i < digits.length; i++) {
            result = result.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
        }

        // Add one to the BigInteger
        result = result.add(BigInteger.ONE);

        // Convert BigInteger to array
        String resultStr = result.toString();
        int[] arr = new int[resultStr.length()];
        for (int i = 0; i < resultStr.length(); i++) {
            arr[i] = resultStr.charAt(i) - '0';
        }

        return arr;
    }
}
