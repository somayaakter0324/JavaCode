public class ReverseString {
    static void main(String[] args) {
        String s="java";
        String rev=" ";
        for(int i=s.length()-1;i>=0;i--){
            rev +=s.charAt(i);
        }
        System.out.println("reverse string : "+rev);
    }
}
