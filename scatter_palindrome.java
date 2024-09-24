public static List<Integer> scatterPalindrome(List<String> strToEvaluate) {
        List<Integer> result = new ArrayList<>();
        for (String s : strToEvaluate) {
            int count = 0;
            int n = s.length();
            for (int start = 0; start < n; start++) {
                int[] freq = new int[26];
                for (int end = start; end < n; end++) {
                    freq[s.charAt(end) - 'a']++;
                    int oddCount = 0;
                    for (int f : freq) {
                        if (f % 2 != 0) {
                            oddCount++;
                        }
                    }
                    if (oddCount <= 1) {
                        count++;
                    }
                }
            }
            result.add(count);
        }
        return result;
    }
