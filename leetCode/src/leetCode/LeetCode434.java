package leetCode;

//434. Number of Segments in a String
/**
 * ͳ���ַ����еĵ��ʸ���������ĵ���ָ���������ķǿ��ַ���
 * 
 * ��ע�⣬����Լٶ��ַ����ﲻ�����κβ��ɴ�ӡ���ַ���
 * 
 * @author 89591
 *
 */
public class LeetCode434 {
	
	public static int countSegments(String s) {
		return ("a " + s).split(" +").length - 1;
	}
	
	public static void main(String[] args) {
		System.out.println(countSegments(" my name is John"));
	}
}
