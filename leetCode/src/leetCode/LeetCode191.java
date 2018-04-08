package leetCode;

//191. Number of 1 Bits
/**
 * ��дһ��������������һ���޷������������ص��������� λ1 �ĸ�����Ҳ����Ϊ������������
 * 
 * ���磬32λ���� '11' �Ķ����Ʊ�ʾΪ 00000000000000000000000000001011�����Ժ�������3��
 * 
 * @author 89591
 *
 */
public class LeetCode191 {

	public static int hammingWeight(int n) {
		int ones = 0;
		while (n != 0) {
			ones = ones + (n & 1);
			n = n >>> 1;
		}
		return ones;
	}

	public static void main(String[] args) {
		System.out.println(11 >>> 1);
	}
}
