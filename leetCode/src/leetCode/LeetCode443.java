package leetCode;

//443. String Compression
/**
 * ����һ���ַ���ʹ��ԭ���㷨����ѹ����
 * 
 * ѹ����ĳ��ȱ���ʼ��С�ڻ����ԭ���鳤�ȡ�
 * 
 * �����ÿ��Ԫ��Ӧ���ǳ���Ϊ1 ���ַ������� int �������ͣ���
 * 
 * �����ԭ���޸���������󣬷���������³��ȡ�
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
