package leetCode;

//762. Prime Number of Set Bits in Binary Representation
//此题非常简单，先取得1的个数，再进行判断即可
public class LeetCode762 {
	public int countPrimeSetBits(int L, int R) {
		int count = 0;
		for(int i=L;i<=R;i++){
			String str1 = Integer.toBinaryString(i);
			String str2 = str1.replaceAll("1", "");
			int length = str1.length() - str2.length();
			if(length == 2 || length == 3 || length == 5 || length == 7 || length == 11 || length == 13 || length == 17 || length == 19){
				count ++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(257888));
	}
}
