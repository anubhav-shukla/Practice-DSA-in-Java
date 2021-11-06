package DSA;

import java.util.ArrayList;

public class Firstandlastoccurrencesofx {
	static ArrayList<Long> find(long arr[], int n, int x)
    {
        ArrayList <Long> res=new ArrayList<Long>();
        res.add(Long.valueOf(-1));
        res.add(Long.valueOf(-1));
        for(int i=0;i<n;i++)
            if(arr[i]==x)
                {
                    res.add(0,Long.valueOf(i));
                    break;
                }
        for(int i=n-1;i>=0;i--)
            if(arr[i]==x)
                {
                    res.add(1,Long.valueOf(i));
                    break;
                }
                
        return res;
        
    }
	public static void main(String ar[]) {
      		int n=9, x=5;
			long	arr[] = { 1, 3, 5, 5, 5, 5, 67, 123, 125 };
			System.out.println(find(arr,n,x));

	}
}
