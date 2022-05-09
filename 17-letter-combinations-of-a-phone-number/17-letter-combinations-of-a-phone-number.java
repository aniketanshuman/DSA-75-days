class Solution {
    static Map<Integer, String> map;
	static StringBuilder sb;
	static List<String> rs;
	static int idx;

	public static void fillMap() {
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
	}

	public static void rec(String str) {
		if (idx == str.length()) {
			rs.add(sb.toString());
			return;
		}

		idx++;
		for (char c : map.get(str.charAt(idx - 1) % '0').toCharArray()) {
			sb.append(c);
			rec(str);
			sb.deleteCharAt(sb.length() - 1);
		}
		idx--;
	}

	public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();
        
		rs = new ArrayList<>();
		rec(digits);
		return rs;
	}

	static {
		sb = new StringBuilder();
		map = new HashMap<>();
		idx = 0;
		fillMap();
	}
}