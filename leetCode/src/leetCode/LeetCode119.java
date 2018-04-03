package leetCode;

import java.util.ArrayList;
import java.util.List;

//119. Pascal's Triangle II
/**
 * 给定一个索引 k，返回帕斯卡三角形（杨辉三角）的第 k 行。
 * 
 * 例如，给定 k = 3，
 * 
 * 则返回 [1, 3, 3, 1]。
 * 
 * @author 89591
 *
 */
public class LeetCode119 {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new ArrayList<Integer>();
		if (rowIndex < 0)
			return list;

		for (int i = 0; i < rowIndex + 1; i++) {
			list.add(0, 1);
			for (int j = 1; j < list.size() - 1; j++) {
				list.set(j, list.get(j) + list.get(j + 1));
			}
		}
		return list;
	}
}
