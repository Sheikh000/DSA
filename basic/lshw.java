public class lshw {
    public static int linearsearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i]==key){
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        String menu[]= {"dosa","cholebhature","idli","vada"};
        String key="idli";
        int index=linearsearch(menu, key);
        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("key is at index : "+ index);
        }


    }
}
