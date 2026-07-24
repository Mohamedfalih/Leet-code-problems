class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set<String> set = new HashSet<>();

        for(int i = 0 ; i < emails.length ; i++){

            String email = emails[i];

            String str1 = "";
            String str2 = "";

            for(int j = 0 ; email.charAt(j) != '@' ; j++){

                if(email.charAt(j) != '+'){
                    if(email.charAt(j) != '.'){
                        str1 += email.charAt(j);
                    }
                }
                else{
                    break;
                }
            }

            for(int j = email.length()-1 ; email.charAt(j) != '@' ; j--){

                str2 = email.charAt(j) + str2;

            }
            set.add(str1+"@"+str2);
        }
        return set.size();
    }
}