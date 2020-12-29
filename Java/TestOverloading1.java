class Adder{  
static int add(int a,int b){return a+b;}  
static int add(int a,int b,int c){
	return a+b+c;
	}
static int add(int a,int b,int c,int d){return a+b+c+d;}  
}  
class TestOverloading1{  
public static void main(String[] args){ 
	//Adder a = new Adder();
  System.out.println(Adder.add(2,5));
  System.out.println(Adder.add(2,5,6));
  System.out.println(Adder.add(2,5,6,2));
}
} 
