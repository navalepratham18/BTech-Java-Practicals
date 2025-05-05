public class allEvenNum {
    public static void main(String[] args) {
        System.out.print("All Even Numbers Between 1 to 100 : ");
        for(int i = 1; i <= 100; i++){
            if(i == 100){
                System.out.print(i + ".");
                break;
            }else if(i % 2 == 0){
                System.out.print(i + ", ");
            }
        }
    }
}
