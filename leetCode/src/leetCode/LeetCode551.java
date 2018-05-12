package leetCode;

//551. Student Attendance Record I
/**
 * 给定一个字符串来代表一个学生的出勤纪录，这个纪录仅包含以下三个字符：
 * 
 * 'A' : Absent，缺勤 'L' : Late，迟到 'P' : Present，到场
 * 如果一个学生的出勤纪录中不超过一个'A'(缺勤)并且不超过两个连续的'L'(迟到),那么这个学生会被奖赏。
 * 
 * 你需要根据这个学生的出勤纪录判断他是否会被奖赏。
 * 
 * @author 89591
 *
 */
public class LeetCode551 {
	
	public static boolean checkRecord(String s) {
		if(s.contains("LLL")) return false;
		int countA = 0;
		for(char c : s.toCharArray()){
			if(c == 'A') countA++;
		}
		return countA <= 1;
	}
	
	public static void main(String[] args) {
		System.out.println(checkRecord("APALLLLLP"));
	}
}
