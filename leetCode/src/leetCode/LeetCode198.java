package leetCode;

//198. House Robber
/**
 * ����һ��רҵ��ǿ�����ƻ������ؽֵķ��ݡ�ÿ�䷿������һ�����ֽ���ֹ���������ǵ�Ψһ����Լ���ؾ������ڵķ����б���ϵͳ���ӣ�����������ڵķ�����ͬһ���ϱ����룬�����Զ���ϵ������
 * 
 * ����һ������ÿ�����ݵĽ��ķǸ������б�ȷ���������û�����Ѿ�������������ٵ���߽�
 * 
 * @author 89591
 *
 */
public class LeetCode198 {

	public int rob(int[] nums) {
		int last = 0;
        int now = 0;
        int tmp;
        for (int n :nums) {
            tmp = now;
            now = Math.max(last + n, now);
            last = tmp;
        }
        return now; 
	}
	
	
}
