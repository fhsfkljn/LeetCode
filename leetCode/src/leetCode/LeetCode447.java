package leetCode;

import java.util.HashMap;
import java.util.Map;

//447. Number of Boomerangs
/**
 * ����ƽ���� n �Բ�ͬ�ĵ㣬�������ڡ� ���ɵ��ʾ��Ԫ�� (i, j, k) ������ i �� j ֮��ľ���� i �� k
 * ֮��ľ�����ȣ���Ҫ����Ԫ���˳�򣩡�
 * 
 * �ҵ����л����ڵ�����������Լ��� n ���Ϊ 500�����е�������ڱ����� [-10000, 10000] �С�
 * 
 * @author 89591
 *
 */
public class LeetCode447 {
	
	public int numberOfBoomerangs(int[][] points) {
	    Map<Integer, Integer> map = new HashMap<>();
	    int res = 0;
	    for(int i=0;i<points.length;i++){
	    	for(int j=0;j<points.length;j++){
	    		if(i==j) continue;
	    		int distance = getDistance(points[i], points[j]);
	    		map.put(distance, map.getOrDefault(distance, 0)+1);
	    	}
	    	for(Integer d : map.values()) res += d*(d-1);
	    	map.clear();
	    }
	    return res;
	}

	private int getDistance(int[] a, int[] b) {
	    int x = a[0]-b[0];
	    int y = a[1]-b[1];
	    return x*x + y*y;
	}
}
