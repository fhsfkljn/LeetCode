package leetCode;

//278. First Bad Version
/**
 * ���ǲ�Ʒ����Ŀǰ�����쵼һ���Ŷӿ���һ���²�Ʒ�����ҵ��ǣ����Ĳ�Ʒ�����°汾û��ͨ��������顣����ÿ���汾���ǻ���֮ǰ�İ汾�����ģ����Դ���汾֮������а汾���ǲ��õġ�
 * 
 * �������� n ���汾 [1, 2, ..., n]�������ҳ���һ������İ汾�������������еĴ���
 * 
 * �����ͨ�� bool isBadVersion(version) �Ľӿ����жϰ汾�� version
 * �Ƿ��ڵ�Ԫ�����г���ʵ��һ�����������ҵ�һ������İ汾����Ӧ�þ������ٶ� API �ĵ��ô�����
 * 
 * @author 89591
 *
 */
public class LeetCode278 {
	public int firstBadVersion(int n) {
		int low = 1,high = n;
		int version = -1;
		while(low<=high){
			int mid = low + (high-low)/2;
			if(isBadVersion(mid)){
				version = mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
			
		}
		return version;
	}

	private boolean isBadVersion(int mid) {
		// TODO Auto-generated method stub
		return false;
	}
}
