import java.util.Scanner;
class bouncyNum
{
  public static void main (String[]args)
  {
  Scanner scan=new Scanner (System.in);
  System.out.println("Enter Any number you want to chek");
  int num=scan.nextInt();
  boolean inc=true;
  boolean dec=true;
  int OldlastDigit=num%10;
  int temp=num;
  num =num/10;
  while (num!=0)
  {
    int newLastDigit =num%10;
    if (newLastDigit>OldlastDigit)
    {
      OldlastDigit=newLastDigit;
    }
    else
    {
        dec=false;
    }
    num=num/10;
  }
  num = temp;
  while (num!=0)
  {
    int newLastDigit=num%10;
    if (newLastDigit<OldlastDigit)
    {
      OldlastDigit=newLastDigit;
    }
    else 
    {
      inc = false;
    }
    num = num/10;
   }
     if (dec==true||inc==true)
     {
        System. out.println("not Bouncy number");
     }
     else
     {
       System.out.println ("Bouncy number");
     }
     
   }
   }