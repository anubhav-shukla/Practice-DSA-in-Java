package DSA;

public class TransformOneStringtoAnotherusingMinimumNumber {

//	 Time Complexity: O(n)
	
	public static int minOps(String A, String B)
    {
        if(A.length() != B.length())
            return -1;
         
        int i, j, res = 0;
        int count [] = new int [256];
        for(i = 0; i < A.length(); i++)
        {
            count[A.charAt(i)]++;
            count[B.charAt(i)]--;
        }
        for(i = 0; i < 256; i++)
            if(count[i] != 0)
                return -1;
         
        i = A.length() - 1;
        j = B.length() - 1;
 
        while(i >= 0)
        {
            if(A.charAt(i) != B.charAt(j))
                res++;
            else
                j--;
            i--;        
        }
        return res;    
    }
 
    public static void main(String[] args)
    {
        String A = "EACBD";
        String B = "EABCD";
         
        System.out.println(minOps(A, B));
    }

}
