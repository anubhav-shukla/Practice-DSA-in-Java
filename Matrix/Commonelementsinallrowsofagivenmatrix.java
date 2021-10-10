package DSA;

import java.util.HashMap;
import java.util.Map;

public class Commonelementsinallrowsofagivenmatrix {
	static int m=4;
	static int n=5;
	
	static void printcommanelements(int mat[][]) {
		Map<Integer,Integer> mp= new HashMap<>();
		for(int j=0;j<n;j++)
			mp.put(mat[0][j], 1);
		for(int i=1;i<m;i++)
			for(int j=0;j<n;j++)
				if(mp.get(mat[i][j]) != null && mp.get(mat[i][j])==i) {
					mp.put(mat[i][j], i+1);
		             if(i==m-1)
					            	System.out.println(mat[i][j]);
				}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int mat[][] =
			    {
			        {1, 2, 1, 4, 8},
			        {3, 7, 8, 5, 1},
			        {8, 7, 7, 3, 1},
			        {8, 1, 2, 7, 9},
			    };
			 
		 printcommanelements(mat);

	}

}
