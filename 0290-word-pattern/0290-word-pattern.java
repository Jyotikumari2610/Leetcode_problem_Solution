class Solution {
    public boolean wordPattern(String pattern, String s){
        HashMap<Character,String> charToWord=new HashMap<>();
        HashMap<String,Character> wordToChar=new HashMap<>();
        String[] words = s.split(" ");
        if(pattern.length()!=words.length)
            return false;
        for(int i=0;i<pattern.length();i++){
            char ch=pattern.charAt(i);
            String word=words[i];
            if(!charToWord.containsKey(ch) && !wordToChar.containsKey(word)){
                charToWord.put(ch,word);
                wordToChar.put(word,ch);
            }else{
                if(!word.equals(charToWord.get(ch)) || ch!=wordToChar.get(word)){
                    return false;
                }
            }
        }
        return true;
    }
}