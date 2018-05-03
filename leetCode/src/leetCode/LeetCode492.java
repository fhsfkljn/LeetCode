package leetCode;

//492. Construct the Rectangle
/**
 * ��Ϊһλweb�����ߣ� ��������ȥ�滮һ��ҳ��ĳߴ��Ǻ���Ҫ�ġ� �ָ���һ������ľ���ҳ�������������������һ������Ϊ L �Ϳ��Ϊ W
 * ����������Ҫ��ľ��ε�ҳ�档Ҫ��
 * 
 * 1. ����Ƶľ���ҳ�������ڸ�����Ŀ�������
 * 
 * 2. ��� W ��Ӧ���ڳ��� L������֮��Ҫ�� L >= W ��
 * 
 * 3. ���� L �Ϳ�� W ֮��Ĳ��Ӧ��������С�� ����Ҫ��˳���������Ƶ�ҳ��ĳ��� L �Ϳ�� W��
 * 
 * @author 89591
 *
 */
public class LeetCode492 {
	
	public static int[] constructRectangle(int area) {
		int num = (int) Math.sqrt(area) + 1;
        while (--num > 0)
            if (area % num == 0)
                return new int[] {area / num, num};
        return new int[2];
	}
	
	public static void main(String[] args) {
		int[] res = constructRectangle(89554115);
		for (int i : res) {
			System.out.println(i);
		}
	}
}
