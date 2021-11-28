package DSA;


	import java.util.*;
	 
	class Givenalinkedlistof0s1sand2ssortit
	{
	  
		  
		static void sortarray ( int [] array , int n )  
		{  
		    int countzero = 0 ;  
		    int countone = 0 ;  
		    int counttwo = 0 ;  
		    int i = 0 ;  
		    while ( i < n )  
		    {  
		        if ( array [ i ] == 0 )  
		        {  
		            countzero = countzero + 1 ;  
		        }  
		        if ( array[ i ] == 1 )  
		        {  
		            countone = countone + 1 ;  
		        }  
		                       if ( array[ i ] == 2 )  
		        {  
		            counttwo = counttwo + 1 ;  
		        }  
		        i = i + 1 ;  
		    }  
		    i = 0 ;  
		    while ( i < countzero )  
		    {  
		        array[ i ] = 0 ;  
		        i = i + 1 ;  
		    }  
		    while ( i < countone + countzero )  
		    {  
		        array[ i ] = 1 ;  
		        i = i + 1 ;  
		    }  
		    while ( i < counttwo + countone + countzero )  
		    {  
		        array[ i ] = 2 ;  
		        i = i + 1 ;  
		    }  
		} 
		public static void main ( String args[] )    
		{    
		 int n ;  
		 Scanner sc = new Scanner ( System.in ) ;  
		 System.out.println ( " Enter number of elements :  " ) ;  
		 n = sc.nextInt() ;  
		 int [] array = new int[ 100 ] ;  
		 System.out.println ( " Enter elements of the array :  " ) ;  
		 for ( int i = 0 ; i < n ; i++ )  
		 {  
		     array[ i ] = sc.nextInt() ;  
		 }  
		 sortarray( array , n ) ;  
		 System.out.println ( " Array after sorting : " ) ;  
		  for ( int i = 0 ; i < n ; i++ )  
		 {  
		     System.out.println ( array[ i ] ) ;  
		 }  
		}  }
		