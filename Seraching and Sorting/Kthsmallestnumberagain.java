package DSA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Kthsmallestnumberagain {
	public static void main(String args[] ) throws Exception {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while(t-- > 0){

		    int n = sc.nextInt();

		     int q = sc.nextInt();

		     ArrayList<ArrayList<Long>> li = new ArrayList<ArrayList<Long>>();

		     for(int i =0; i <n; i++){

		     ArrayList<Long> al = new ArrayList<>();

		     long a = sc.nextLong();

		     long b = sc.nextLong();

		     al.add(a);

		     al.add(b);

		     li.add(al);

		     }


		 

		     Collections.sort(li, new Comparator<ArrayList<Long>>(){

		     public int compare(ArrayList<Long> o1, ArrayList<Long> o2){

		     return o1.get(0).compareTo(o2.get(0));

		     }

		     });


		 

		     int idx = 0;

		     for(int i =1; i < li.size() ; i++){

		     if( li.get(i).get(0) <= li.get(idx).get(1) ){

		     li.get(idx).set(1, Math.max(li.get(idx).get(1) , li.get(i).get(1)));

		     }

		     else{

		         idx++;

		         li.set(idx, li.get(i));

		     }

		     }




		 

		     while(q-- > 0){

		     boolean isFound = false;

		     long k = sc.nextLong();

		     for(int i =0; i <= idx; i++){

		         long diff = li.get(i).get(1) - li.get(i).get(0);

		         if(k <= diff + 1){

		         System.out.println(li.get(i).get(0) + k -1 );

		         isFound = true;

		         break;

		         }

		         else{

		         k = k - diff-1;

		         }

		     }

		     if(!isFound){

		     System.out.println(-1);

		     }

		     }

		
		}}}
