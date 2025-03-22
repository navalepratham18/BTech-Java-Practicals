package temp;

// testing multiple main() in a file
 
public class helloWorld {
		public static void main(String[] args) {
			helloWorld h1 = new helloWorld();
			
			int x = 6; 
			System.out.println(h1.main(x));

		}
		
		public static int main(int args) {
			int q = args;
			return q;
		}
}
class trial2{
	static public void main(String[] args){
		System.out.println("hello world");
	}
}





// local varible can be initialize  

//public class helloWorld{
//	public static void main(String [] args) {
//		int x =3;
//		
//		if(x>=0) {
//			if(x == 0)
//				System.out.println("1");
//			else
//				System.out.println("2");       // 2
//			System.out.println("3");           // 3
//		}
////		System.out.println(x);
//	}
//}