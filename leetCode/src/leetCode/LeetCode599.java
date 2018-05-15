package leetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//599. Minimum Index Sum of Two Lists
/**
 * ����Andy��Doris�������ʱѡ��һ�Ҳ������������Ƕ���һ����ʾ��ϲ���������б�ÿ���������������ַ�����ʾ��
 * 
 * ����Ҫ�������������ٵ��������ҳ����ǹ�ͬϲ���Ĳ����� ����𰸲�ֹһ������������д𰸲��Ҳ�����˳�� ����Լ������Ǵ���һ���𰸡�
 * 
 * @author 89591
 *
 */
public class LeetCode599 {
	
	public static String[] findRestaurant(String[] list1, String[] list2) {
		Map<String, Integer> record = new HashMap<>();
		Map<String, Integer> union = new HashMap<>();
		int min = Integer.MAX_VALUE;
		for(int i=0;i<list1.length;i++){
			record.put(list1[i], i);
		}
		for(int i=0;i<list2.length;i++){
			if(record.containsKey(list2[i])){
				if(min>=(record.get(list2[i])+i)){
					min = record.get(list2[i])+i;
					union.put(list2[i], min);
				}
			}
		}
		
		List<String> res = new ArrayList<>();
		
		for(Map.Entry<String, Integer> entry : union.entrySet()){
			if(entry.getValue()==min) res.add(entry.getKey());
		}
		String[] arr = new String[res.size()];
		return res.toArray(arr);
	}
	
	public static void main(String[] args) {
		String[] list1 = new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
		String[] list2 = new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};
		String[] res = findRestaurant(list1, list2);
		for (String string : res) {
			System.out.println(string);
		}
	}
}
