public class Digit{
    int digit(int num)
    {       
        int result=0,n=num;        
        int numArray[]=new int[num];
        int numArray2[]=new int[num];
    
       for(int i=0;i<num;i++)
        {
          numArray[i]=i+1;
        }
        int a=0;
        for(int j:numArray)
        {
            int x=j,count=0;
           for(int k=0;x!=0;k++)
           {
             x=x/10;
             count++;            
           }   
          numArray2[j-1]=count;          
        }
        int oddcount=0,evencount=0;
         for(int aa:numArray2)
         {
           
            if(aa%2==0)
            {
                if(aa%4==0)
                {
                    evencount=evencount+aa*4;
                }
                else
                {
                    evencount=evencount+aa*3;
                }                
              
            }
            else if(aa%2!=0)
            {
                oddcount=oddcount+aa*2;               
                
            }           
            
         }

         int show=evencount+oddcount;
         int demo=0;
        if(show<10)
        {
            System.out.println(show);
        }  
        else
        {            
            demo=addnum(show);
        }     
       System.out.println("Sum of digits :"+demo);
        return result;
    }

    

    int addnum(int show)
    {
        int get=0,num=show;
        for(int p=0;show!=0;p++)
        {
           get=get+show%10;
           show=show/10;
           
        }
       if(get>9)
       {
        return addnum(get);
       } 
       else
       {
        return get;
       }
        
    }

    
}