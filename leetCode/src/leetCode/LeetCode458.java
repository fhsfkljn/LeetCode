package leetCode;

//458. Poor Pigs
/**
 * 有1000只水桶，其中有且只有一桶装的含有毒药，其余装的都是水。它们从外观看起来都一样。如果小猪喝了毒药，它会在15分钟内死去。
 * 
 * 问题来了，如果需要你在一小时内，弄清楚哪只水桶含有毒药，你最少需要多少只猪？
 * 
 * 回答这个问题，并为下列的进阶问题编写一个通用算法。
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
