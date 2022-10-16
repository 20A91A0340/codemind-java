import java.util.*;
 class Sample
 {
     public static void main(String args[])
     {
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int arr[]=new int[n];
         for(int i=0;i<n;i++)
         {
             arr[i]=sc.nextInt();
         }
         HashMap<Integer,Integer>hm=new
    HashMap<Integer,Integer>();
         for(int i=0;i<n;i++)
         {
             if(hm.containsKey(arr[i]))
             {
                 hm.put(arr[i],hm.get(arr[i])+1);
             }
             else
             {
                 hm.put(arr[i],1);
             }
         }
         //System.out.println(hm);
         //System.out.println();
         int f=0;
         int m=-1;
         for(Map.Entry<Integer,Integer>e:hm.entrySet())
         {
             if(e.getValue()==1)
             {
                 if(e.getKey()>m)
                 {
                     m=e.getKey();
                     //System.out.print(e.getKey()+" ");
                     f=1;
                 }
             }
         }
         //if(f==0)
         //System.out.print(-1);
         System.out.print(m);
     }
 }
                 