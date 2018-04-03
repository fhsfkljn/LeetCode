package leetCode;

import java.util.ArrayList;
import java.util.List;

//119. Pascal's Triangle II
/**
 * ����һ������ k��������˹�������Σ�������ǣ��ĵ� k �С�
 * 
 * ���磬���� k = 3��
 * 
 * �򷵻� [1, 3, 3, 1]��
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
