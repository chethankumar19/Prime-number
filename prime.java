package prime;
import java.util.scanner;

class test{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Please Enter a value");
    int num = sc.nextInt();
    boolean isPrime=true;
    for(int i=2;i<num;i++){
       if(num%i==0){
           isPrime=false;
           break;
       }
    }
    if(isPrime=true){
      System.out.println(num+"is a Prime number");
    }
    else{
       System.out.println(num+"is not a Prime number");
    }
  }
}

