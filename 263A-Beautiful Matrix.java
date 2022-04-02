import java.util.*;
public class Main{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int x=-1;
        int row=-1;
        int col=-1;
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<5;j++)
        {
            x=sc.nextInt();
            if(x==1)
            {
              
            row=i;
            col=j;
                break;
            }
        }
        if(col!=-1)
        break;
        }
        int sol=Math.abs(3-row)+Math.abs(3-col);
        System.out.println(sol);
    }
}
