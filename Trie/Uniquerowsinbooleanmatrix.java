package DSA;

public class Uniquerowsinbooleanmatrix {
	static int ROW = 4;
	static int COL = 5;

	static void findUniqueRows(int M[][])
	{

	for(int i = 0; i < ROW; i++)
	{
	int flag = 0;

	for(int j = 0; j < i; j++)
	{
	flag = 1;

	for(int k = 0; k < COL; k++)
	if (M[i][k] != M[j][k])
	flag = 0;

	if (flag == 1)
	break;
	}
	if (flag == 0)
	{

	for(int j = 0; j < COL; j++)
	System.out.print(M[i][j] + " ");

	System.out.println();
	}
	}
	}

	public static void main(String[] args)
	{
	int M[][] = { { 0, 1, 0, 0, 1 },
	{ 1, 0, 1, 1, 0 },
	{ 0, 1, 0, 0, 1 },
	{ 1, 0, 1, 0, 0 } };

	findUniqueRows(M);
	}
	
}
