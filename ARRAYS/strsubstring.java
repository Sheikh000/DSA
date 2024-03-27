public class strsubstring {
    public static String sub(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr=substr+str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="helloworld";
        System.out.println(sub(str, 0, 4));
        System.out.println(str.substring(0,5));
    }
}
