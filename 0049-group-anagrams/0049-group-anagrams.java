class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
     /*   List<List<String>> result = new ArrayList<>();
        boolean ana[]= new boolean[strs.length];
        for (int i = 0; i < strs.length; i++){
            if (ana[i]) continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            ana[i] = true;

            for (int j = i + 1; j < strs.length; j++) {

                if (ana[j]) continue;
                char[] a = strs[i].toCharArray();
                char[] b = strs[j].toCharArray();

                Arrays.sort(a);
                Arrays.sort(b);

                if (Arrays.equals(a, b)) {
                    group.add(strs[j]);
                    ana[j] = true;
                }
            }
            result.add(group);
        }
        return result;
        */
        HashMap<String,List<String>>map=new HashMap<>();
        for(String s:strs){
            char a[]=s.toCharArray();
            Arrays.sort(a);
            String c=new String(a);
            if(!map.containsKey(c)){
                map.put(c,new ArrayList<>());
            }
            map.get(c).add(s);
        }
        return new ArrayList<>(map.values());
    }
}