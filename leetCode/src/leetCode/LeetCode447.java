package leetCode;

import java.util.HashMap;
import java.util.Map;

//447. Number of Boomerangs
/**
 * 给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k
 * 之间的距离相等（需要考虑元组的顺序）。
 * 
 * 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
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
