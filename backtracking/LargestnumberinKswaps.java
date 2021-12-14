package DSA;

import java.io.*;


	class Res {
	    static String max = "";
	}
	public class LargestnumberinKswaps {
	    public static void findMaximumNum(char ar[], int k,
	                                      Res r)
	    {
	        if (k == 0)
	            return;
	        int n = ar.length;
	        for (int i = 0; i < n - 1; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (ar[j] > ar[i]) {
	                    char temp = ar[i];
	                    ar[i] = ar[j];
	                    ar[j] = temp;

	                    String st = new String(ar);

	                    if (r.max.compareTo(st) < 0) {
	                        r.max = st;
	                    }
	                    findMaximumNum(ar, k - 1, r);

	                    temp = ar[i];
	                    ar[i] = ar[j];
	                    ar[j] = temp;
	                }
	            }
	        }
	    }

	    public static void main(String[] args)
	    {
	        String str = "129814999";
	        int k = 4;
	        Res r = new Res();
	        r.max = str;
	        findMaximumNum(str.toCharArray(), k, r);
	        System.out.println(r.max);
	    }
	}