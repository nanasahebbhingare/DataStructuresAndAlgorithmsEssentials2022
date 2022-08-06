package leetcode;

public class JewelsAndStones771 {
	public static void main(String[] args) {
		System.out.println(numJewelsInStones("aA", "aAAbbb"));
	}

	public static int numJewelsInStones(String jewels, String stones) {
		int[] charArray = new int[256];
		int stoneCnt = 0;
		/*for (int i = 0; i < stones.length(); i++) {
			charArray[stones.charAt(i)]++;
		}
		for (int i = 0; i < jewels.length(); i++) {
			stoneCnt+=charArray[jewels.charAt(i)];
		}*/
		for (int i = 0; i < stones.length(); i++) {
			if(jewels.indexOf(stones.charAt(i))!=-1)
			{
				stoneCnt++;
			}
		}
		return stoneCnt;
	}
}
