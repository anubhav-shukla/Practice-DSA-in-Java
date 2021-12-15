package DSA;
import java.util.*;
public class FindtheKthPermutationSequence {
	static int findFirstNumIndex(int k,
            int n)
{
if (n == 1)
return 0;
n--;

int first_num_index;
int n_partial_fact = n;

while (k >= n_partial_fact && n > 1)
{
n_partial_fact = n_partial_fact *
    (n - 1);
n--;
}
first_num_index = k / n_partial_fact;

k = k % n_partial_fact;
return first_num_index;
}
static String findKthPermutation(int n,
                int k)
{
String ans = "";

HashSet<Integer> s = new HashSet<>();

for (int i = 1; i <= n; i++)
s.add(i);

Vector<Integer> v = new Vector<>();
v.addAll(s);

int itr = v.elementAt(0);

k = k - 1;

for (int i = 0; i < n; i++)
{
int index = findFirstNumIndex(k,
                 n - i);

if(index < v.size())
{
ans += ((v.elementAt(index).toString()));
v.remove(index);
}
else
ans += String.valueOf(itr + 2);

itr = v.elementAt(0);
}
return ans;
}

public static void main(String[] args)
{
int n = 3, k = 4;
String kth_perm_seq = findKthPermutation(n, k);
System.out.print(kth_perm_seq + "\n");
}

}
