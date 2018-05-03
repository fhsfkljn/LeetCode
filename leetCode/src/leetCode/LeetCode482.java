package leetCode;

//482. License Key Formatting
/**
 * 您将得到一个以字符串S表示的许可证密钥，该字符串仅由字母数字字符和破折号组成。该字符串被分成N + 1个组，分为N个破折号。
 * 
 * 给定数字K，我们希望重新格式化字符串，使得每个组包含完全
 * K个字符，但第一个组可能比K短，但仍然必须至少包含一个字符。此外，两组之间必须插入短划线，并且所有小写字母都应该转换为大写字母。
 * 
 * 给定一个非空字符串S和一个数字K，根据上述规则格式化字符串。
 * 
 * @author 89591
 *
 */
public class LeetCode482 {
	
	public static String licenseKeyFormatting(String S, int K) {
		String str = S.replaceAll("-", "").toUpperCase();
		if(str.length()==0) return "";
		StringBuilder res = new StringBuilder();
		
		int head = str.length()%K;
		if(head!=0) res.append(str.substring(0,head)+"-");
		
		for(int i=head;i<str.length();i+=K){
			res.append(str.substring(i,i+K)+"-");
		}
		res.deleteCharAt(res.length()-1);
		return res.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(licenseKeyFormatting("---", 3));
	}
}
