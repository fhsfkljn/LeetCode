package leetCode;

//374. Guess Number Higher or Lower
/**
 * ����������һ����������Ϸ�� ��Ϸ�������£� �Ҵ� 1 �� n ѡ��һ�����֡� ����Ҫ����ѡ�����ĸ����֡� ÿ����´��ˣ��һ��������������Ǵ��˻���С�ˡ�
 * �����һ��Ԥ�ȶ���õĽӿ� guess(int num)�����᷵�� 3 �����ܵĽ����-1��1 �� 0����
 * 
 * @author 89591
 *
 */
public class LeetCode374 {
	
	public int guessNumber(int n) {
		int low = 1,high = n;
		while(low<high){
			int mid = low + (high-low)/2;
			if(guess(mid)==0) return mid;
			else if(guess(mid)==1) low = mid+1;
			else high = mid-1;
		}
		return low;
	}

	private int guess(int mid) {
		// TODO Auto-generated method stub
		return 0;
	}
}
