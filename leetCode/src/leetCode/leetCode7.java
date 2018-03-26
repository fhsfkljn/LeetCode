package leetCode;

//7. Reverse Integer
public class leetCode7 {
	public int reverse(int x) {
		long rev= 0;
        while( x != 0){
            rev= rev*10 + x % 10;
            x= x/10;
            if( rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
        }
        return (int) rev;
	}
	
	public static void main(String[] args) {
		leetCode7 lt = new leetCode7();
		System.out.println(lt.reverse(-123));
	}
	
}
