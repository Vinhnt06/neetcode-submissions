class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            int count[] = new int[26];
            String word = strs[i];
            for (int j = 0; j < word.length(); j++) count[word.charAt(j) - 'a']++;
            String key = Arrays.toString(count);
            if (!map.containsKey(key)) {
                List<String> l = new ArrayList<>();
                l.add(strs[i]);
                map.put(key, l);
            } else {
                List<String> z = map.get(key);
                z.add(strs[i]);
                map.put(key, z);
            }
        }
        List<List<String>> arr = new ArrayList<>();
        for (Map.Entry<String, List<String>> x : map.entrySet()) {
            arr.add(x.getValue());
        }
        return arr;
    }
}
