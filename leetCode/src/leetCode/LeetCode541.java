package leetCode;

//541. Reverse String II
/**
 * ����һ���ַ�����һ������ k������Ҫ�Դ��ַ�����ͷ�����ÿ�� 2k ���ַ���ǰk���ַ����з�ת�����ʣ������ k
 * ���ַ�����ʣ�������ȫ����ת�������С�� 2k �����ڻ���� k ���ַ�����תǰ k ���ַ�������ʣ����ַ�����ԭ����
 */
public class LeetCode541 {
	
	public String reverseStr(String s, int k) {
        char[] charArr = s.toCharArray();
        for(int i = 0; i < charArr.length; i += 2 * k) {
            int end = (i + k - 1) > (charArr.length - 1) ? (charArr.length - 1) : (i + k - 1) ;
            reverse(charArr, i, end);
        }
        return new String(charArr);
    }
    
    public void reverse(char[] charArr, int start, int end) {
        while(start < end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            ++start; --end;
        }
    }
}
