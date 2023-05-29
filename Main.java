import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    while(true)
      {
  Scanner s=new Scanner(System.in);
  System.out.println("enter an integer");
    int m=s.nextInt();
    if(m%2!=0 && m<2)
    {
      System.out.println("NEW");
    }
    else if(m>=2 && m<=5)
    {
      System.out.println("OLD");
    }
    else if(m>=6 && m<=30)
    {
      if(m%2==0)
      {
        System.out.println("NEW");
      }
    }
      else if(m>30){
        if(m%2==0)
        {
          System.out.println("OLD");
        }
      }
    }
    
  }
}


