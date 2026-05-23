class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str.length());
            sb.append('#');
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            //j -> find the delimeter 
            while(str.charAt(j) != '#'){
                j++;
            }
            //get the length of the string
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            j = i + length;
            decoded.add(str.substring(i, j));
            i = j;
        }
        return decoded;
    }
}
