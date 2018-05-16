package leetCode;

//605. Can Place Flowers
/**
 * 
 * ��������һ���ܳ��Ļ�̳��һ���ֵؿ���ֲ�˻�����һ����ȴû�С����ǣ����ܲ�����ֲ�����ڵĵؿ��ϣ����ǻ�����ˮԴ�����߶�����ȥ��
 * 
 * ����һ����̳����ʾΪһ���������0��1������0��ʾû��ֲ����1��ʾ��ֲ�˻�������һ���� n ���ܷ��ڲ�������ֲ�������������� n
 * �仨�����򷵻�True�������򷵻�False��
 * 
 * @author 89591
 *
 */
public class LeetCode605 {
	
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		for(int i=0;i<flowerbed.length;i++){
			if(flowerbed[i]==0 && (i==0 || flowerbed[i-1]==0) && (i==flowerbed.length-1 || flowerbed[i+1]==0)){
				flowerbed[i] = 1;
				n--;
			}
		}
		return n<=0;
	}
}
