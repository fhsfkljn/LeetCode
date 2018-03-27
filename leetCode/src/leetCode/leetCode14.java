package leetCode;

//14. Longest Common Prefix
//���������������⣬����ȡ�����еĵ�һ���ַ��������������ַ����Ƿ�������ַ������Ҹ��ַ���λ�ڿ�ͷ��������ǣ��򽫿�ͷ�ַ���ĩβ���ַ�
//��ȥ��Ȼ������ж�
public class leetCode14 {
	public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0)
			return "";
		String pre = strs[0];
		int i = 1;
		while(i<strs.length){
			while(strs[i].indexOf(pre) != 0){
				pre = pre.substring(0, pre.length()-1);
			}
			i++;
			if(pre.length()==0){
				break;
			}
		}
		return pre;
	}
	
	public static void main(String[] args) {
		String[] strs = {"abcd","dbabc"};
		System.out.println(new leetCode14().longestCommonPrefix(strs));
	}
}
