class Solution {
    public String findCommonResponse(List<List<String>> responses) {

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < responses.size(); i++) {

            Set<String> set = new HashSet<>();

            for (int j = 0; j < responses.get(i).size(); j++) {

                set.add(responses.get(i).get(j));

            }
            for (String str : set) {
                map.put(str, map.getOrDefault(str, 0) + 1);
            }

        }

        int max = 0;
        for (String key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }

        String res = "";
        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() == max) {
                if (res.equals("") || entry.getKey().compareTo(res) < 0) {
                    res = entry.getKey();
                }
            }
        }

        return res;
    }
}