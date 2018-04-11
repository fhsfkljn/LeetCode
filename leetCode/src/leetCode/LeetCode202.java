package leetCode;

import java.util.HashSet;
import java.util.Set;

//202. Happy Number
/**
 * дһ���㷨���ж�һ�����ǲ��ǡ�����������
 * 
 * һ�����ǲ��ǿ�������ô����ģ�����һ����������ÿһ�ν������滻Ϊ��ÿ��λ���ϵ����ֵ�ƽ���ͣ�Ȼ���ظ��������ֱ���������Ϊ 1����������ѭ����ʼ�ձ䲻��
 * 1��������Ա�Ϊ 1����ô��������ǿ�������
 * 
 * @author 89591
 *
 */
public class LeetCode202 {
	
	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while(set.add(n)){
			int next = 0;
			int temp = 0;
			while(n>0){
				temp = n%10;
				next += temp*temp;
				n /= 10;
			}
			if(next==1) return true;
			n = next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		System.out.println(isHappy(18));
	}
}
