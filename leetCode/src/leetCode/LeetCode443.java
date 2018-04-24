package leetCode;

//443. String Compression
/**
 * 给定一组字符，使用原地算法将其压缩。
 * 
 * 压缩后的长度必须始终小于或等于原数组长度。
 * 
 * 数组的每个元素应该是长度为1 的字符（不是 int 整数类型）。
 * 
 * 在完成原地修改输入数组后，返回数组的新长度。
 * 
 * 
 * @author 89591
 *
 */
public class LeetCode443 {
	
	public static int compress(char[] chars) {
		int resIndex = 0,index = 0;
		char currentChar;
		while(index<chars.length){
			currentChar = chars[index];
			int count = 0;
			while(index<chars.length && currentChar==chars[index]){
				index++;
				count++;
			}
			chars[resIndex++] = currentChar;
			if(count!=1){
				for(char c : String.valueOf(count).toCharArray()) chars[resIndex++] = c;
			}
		}
		return resIndex;
	}
	
	public static void main(String[] args) {
		System.out.println(compress(new char[]{'a','b','b','b','b','b','b','b','b','b','b','b','b'}));
	}
}
