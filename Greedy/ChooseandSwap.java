package DSA;
import java.util.*;


public class ChooseandSwap {
	
	static int MAX = 26;

	
	static String smallestStr(char []str, int n)
	{
	    int i, j = 0;
	  
	    int []chk = new int[MAX];
	    for (i = 0; i < MAX; i++)
	        chk[i] = -1;

	    for (i = 0; i < n; i++) 
	    {

	        if (chk[str[i] - 'a'] == -1)
	            chk[str[i] - 'a'] = i;
	    }

	
	    for (i = 0; i < n; i++)
	    {
	        boolean flag = false;

	     
	        for (j = 0; j < str[i] - 'a'; j++) 
	        {

	        
	            if (chk[j] > chk[str[i] - 'a']) 
	            {
	                flag = true;
	                break;
	            }
	        }

	      
	        if (flag)
	            break;
	    }

	  
	    if (i < n) 
	    {

	        
	        char ch1 = str[i];
	        char ch2 = (char) (j + 'a');

	      
	        for (i = 0; i < n; i++)
	        {

	          
	            if (str[i] == ch1)
	                str[i] = ch2;

	            else if (str[i] == ch2)
	                str[i] = ch1;
	        }
	    }

	    return String.valueOf(str);
	}

	
	public static void main(String[] args)
	{
	    String str = "ccad";
	    int n = str.length();

	    System.out.println(smallestStr(
	                       str.toCharArray(), n));
	}
	
}
