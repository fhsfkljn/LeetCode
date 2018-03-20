package leetCode;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCode575 {
	public int distributeCandies(int[] candies) {
		Set<Integer> kinds = new HashSet<>();
		for (int candy : candies)
			kinds.add(candy);
		return kinds.size() >= candies.length / 2 ? candies.length / 2 : kinds.size();

		// return Math.min(candies.length / 2,
		// IntStream.of(candies).boxed().collect(Collectors.toSet()).size());
	}
}
