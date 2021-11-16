
package p1;
import java.util.*;
import java.lang.*;
import java.io.*;


class abc
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for (int j=0;j<n;j++)
        {
            int n1=sc.nextInt(),fac=1;
            for(int i=2;i<=n1;i++)
            {
                fac=fac*i;
            }
            arr[j]=fac;
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(arr[j]);

        }
    }
}
