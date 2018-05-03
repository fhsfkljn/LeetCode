package leetCode;

//482. License Key Formatting
/**
 * �����õ�һ�����ַ���S��ʾ�����֤��Կ�����ַ���������ĸ�����ַ������ۺ���ɡ����ַ������ֳ�N + 1���飬��ΪN�����ۺš�
 * 
 * ��������K������ϣ�����¸�ʽ���ַ�����ʹ��ÿ���������ȫ
 * K���ַ�������һ������ܱ�K�̣�����Ȼ�������ٰ���һ���ַ������⣬����֮��������̻��ߣ���������Сд��ĸ��Ӧ��ת��Ϊ��д��ĸ��
 * 
 * ����һ���ǿ��ַ���S��һ������K���������������ʽ���ַ�����
 * 
 * @author 89591
 *
 */
public class LeetCode482 {
	
	public static String licenseKeyFormatting(String S, int K) {
		String str = S.replaceAll("-", "").toUpperCase();
		if(str.length()==0) return "";
		StringBuilder res = new StringBuilder();
		
		int head = str.length()%K;
		if(head!=0) res.append(str.substring(0,head)+"-");
		
		for(int i=head;i<str.length();i+=K){
			res.append(str.substring(i,i+K)+"-");
		}
		res.deleteCharAt(res.length()-1);
		return res.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("---", 3));
	}
}
