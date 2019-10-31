import java.util.*;
public class fact {
    public static void main(String args[])
    {
        int factorial=1,i,n;
        Scanner nt=new Scanner(System.in);
          n=nt.nextInt();
          for(i=1;i<=n;i++)
          {
              factorial=factorial*i;
             
          }
           System.out.println(factorial);
    }
    
}
