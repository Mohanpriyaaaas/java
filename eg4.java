import java.math.BigInteger;

class Solution {
    public String addBinary(String a, String b) {
      BigInteger x1=new BigInteger(a,2);
      BigInteger  x2=new BigInteger(b,2);
      BigInteger sum=x1.add(x2);
      return sum.toString(2);
    }
}
