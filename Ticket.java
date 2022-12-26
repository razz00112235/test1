import java.util.*;

class Ticket
{

    int book()
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter person");
        int person=sc.nextInt();
        int age[]=new int[person];
        System.out.println("Enter Age");
        int price=0;
        for(int i=0;i<person;i++)
        {            
            age[i]=sc.nextInt();
            if(age[i]>=3 && age[i]<=12)
            {
                price=price+100;
            }
            else if(age[i]>12)
            {
                price=price+150;
            }
        }
        return price;

    }
    public static void main(String[] args) {
        Ticket tc=new Ticket();
        int fees=tc.book();
        System.out.println("Your Movie Ticket Price: "+fees);

    }
}
