package DSA;
import java.io.*;
import java.util.*;

public class Findmedianinastream {
	static void insertionSort(ArrayList <Integer> sorted)
    {
        int last_inserted = sorted.size()-1;
        while(last_inserted > 0 && sorted.get(last_inserted) < sorted.get(last_inserted-1))
        {
            int temp = sorted.get(last_inserted-1);
            sorted.set(last_inserted-1,sorted.get(last_inserted));
            sorted.set(last_inserted,temp);
            
            last_inserted--;
        }
    }
    

		static void printMedian(ArrayList <Integer> stream)
    {
        ArrayList <Integer> sorted = new ArrayList <Integer>();
        
        for(int i=0;i<stream.size();i++)
        {
            sorted.add(stream.get(i));
            
            if(sorted.size() == 1)
            System.out.print(sorted.get(0)+"\t");
            else
            {
                insertionSort(sorted);
                
                if(sorted.size() %2 == 1)
                {
                    int mid = sorted.size()/2;
                    System.out.print(sorted.get(mid)+"\t");
                }
                else
                {
                    int mid1 = (sorted.size()-1)/2;
                    int mid2 = sorted.size()/2;
                    
                    float median = (float)(sorted.get(mid1)+sorted.get(mid2))/2;
                    
                    System.out.print(median + "\t");
                }
            }
        }
    }
    public static void main (String[] args) 
    {
        ArrayList <Integer> stream = new ArrayList <Integer> (Arrays.asList(3,10,5,20,7,6));
        printMedian(stream);
    }

}
