package leetCode;

//405. Convert a Number to Hexadecimal
/**
 * ����һ����������дһ���㷨�������ת��Ϊʮ�������������ڸ�����������ͨ��ʹ�� �������� ������
 * 
 * @author 89591
 *
 */
public class LeetCode405 {
	
	private static char[] map = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f' };

	public static String toHex(int num) {
		if(num==0) return "0";
		String res = "";
		while(num!=0){
			res = map[(num&15)] + res;
			num = (num>>>4); //�޷�������
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(toHex(-1));
	}

}
