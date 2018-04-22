package leetCode;

import java.util.ArrayList;
import java.util.List;

//412. Fizz Buzz
/**
 * дһ����������� 1 �� n ���ֵ��ַ�����ʾ��
 * 
 * 1. ��� n ��3�ı����������Fizz����
 * 
 * 2. ��� n ��5�ı����������Buzz����
 * 
 * 3.��� n ͬʱ��3��5�ı�������� ��FizzBuzz����
 * 
 * @author 89591
 *
 */
public class LeetCode412 {
	
	public List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<>();
		for(int i=1;i<=n;i++){
			if(i%5==0 && i%3==0) res.add("FizzBuzz");
			else if(i%3==0) res.add("Fizz");
			else if(i%5==0) res.add("Buzz");
			else res.add(i+"");
		}
		return res;
	}
}
