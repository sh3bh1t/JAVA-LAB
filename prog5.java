public class prog5{
    static  boolean userstrcmp(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    static boolean userstrcmp(String str1, String str2 , int n){
        for(int i=0;i<n;i++){
            if(str1.charAt(i)!=str2.charAt(i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str1= "hello";
        String str2="helLO";
        System.out.println(userstrcmp(str1,str2));
        System.out.println(userstrcmp(str1,str2,3));

    }
}