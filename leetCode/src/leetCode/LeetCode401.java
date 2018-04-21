package leetCode;

import java.util.ArrayList;
import java.util.List;

//401. Binary Watch
/**
 * ²»ºÃÃèÊö
 * 
 * @author 89591
 *
 */
public class LeetCode401 {
	
	public List<String> readBinaryWatch(int num) {
		List<String> res = new ArrayList<>();
		for(int h=0;h<12;h++){
			for(int m=0;m<60;m++){
				if(Integer.bitCount(h*64+m)==num) res.add(String.format("%d:%02d", h,m));
			}
		}
		return res;
	}
}
