public class allEvenNum {
    public static void main(String [] args){
        System.out.print("Even Numbers between 1-100 : ");
        for(int i = 1; i <=100; i++){
            if (i % 2 == 0){
                if ( i!=100 ){
                    System.out.print(i+", ");
                }else{
                    System.out.print(i+".");
                }
            }else{
                continue;
            }
        }
    }
}
