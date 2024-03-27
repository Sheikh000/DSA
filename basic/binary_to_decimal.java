public class binary_to_decimal {
   public static void btod(int binnum){
        int pow=0;
       int y=binnum;
       int decnum=0;
      while(binnum>0){
        int ld=binnum%10;
        decnum=decnum+(ld*(int)Math.pow(2,pow));
        pow++;
        binnum=binnum/10;
       
        }
        System.out.println("decimal of "+ y+"is "+decnum);

   }
    
    public static void main(String[] args) {
     btod(1010);
    }
}

