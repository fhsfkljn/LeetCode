package leetCode;

//458. Poor Pigs
/**
 * ��1000ֻˮͰ����������ֻ��һͰװ�ĺ��ж�ҩ������װ�Ķ���ˮ�����Ǵ���ۿ�������һ�������С����˶�ҩ��������15��������ȥ��
 * 
 * �������ˣ������Ҫ����һСʱ�ڣ�Ū�����ֻˮͰ���ж�ҩ����������Ҫ����ֻ��
 * 
 * �ش�������⣬��Ϊ���еĽ��������дһ��ͨ���㷨��
 * 
 * @author 89591
 *
 */
public class LeetCode458 {
	
	public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
		int status = minutesToTest/minutesToDie + 1;
        int num_of_pig = 0;
        while(Math.pow(status, num_of_pig) < buckets) {num_of_pig++;}
        return num_of_pig;
	}
}
