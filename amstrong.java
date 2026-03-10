import java.util.*;
import java.lang.Math;
class am
{
    public static void main(String args[])
    {
        int n=153;
        int temp=n;
        int c=0;
        while(temp!=0)
        {
            temp=temp/10;
            c++;
        }
        temp=n;
        int r=0;
        while(temp!=0)
        {
            r=r+(int)Math.pow(temp%10,c);
        }
        if(n==r)
        System.out.println("amstrong no");
        else 
        System.out.println("not amstrong");
    }
}