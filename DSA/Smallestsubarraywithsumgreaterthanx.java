package DSA;
import java.util.*;
import java.io.*;
public class Smallestsubarraywithsumgreaterthanx {
         public static int smallestSumWithSUm(int a[],int n,int x) {
        	 int sum =0;
        	 int min=Integer.MAX_VALUE;
        	 int i =0,j=0;
        	 while(j<n) {
        		 while(sum<=x && j<n) {
        			 sum += a[j++];
        		 }
        		 while(sum>x) {
        			 if(j-i<min)
        			 min = j-i;
        			 sum = a[i];
        			 i++;
        		 }
        	 }
        	 System.out.println(min);
        	 return min;
         }
         public static void main(String[] args) {
        	 int a[]= {1,3,45,6,6,77,4,3};
        	 int n = a.length;
        	 int x=99;
        	 smallestSumWithSUm(a,n,x);
         }
}
