class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagramsMap = new HashMap<>();
        for(String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);
            anagramsMap.computeIfAbsent(sortedStr, key -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(anagramsMap.values());
    }
}