
public class Main
{
    static int methodname(int n) {
    int inpt,rem;
    int r=0;
    inpt=n;
    while(n!=0)
    {
        rem=n%10;
        r=r*10+rem;
        n=n/10;
        
     }
        if(inpt==r){
             System.out.println("The below no. is palindrom");
        }
        else{
            System.out.println("The below no. is not a palindrom");
        }
        return inpt;
         
    }
   
  public static void main(String[] args){
       System.out.println(methodname(111));
  }
}