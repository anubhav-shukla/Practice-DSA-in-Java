package DSA;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class StackPermutations {
    static boolean checkStackPermutation(int ip[],
            int op[], int n)
{
Queue<Integer> input = new LinkedList<>();

for (int i = 0; i < n; i++)
{
input.add(ip[i]);
}
Queue<Integer> output = new LinkedList<>();
for (int i = 0; i < n; i++)
{
output.add(op[i]);
}

Stack<Integer> tempStack = new Stack<>();
while (!input.isEmpty())
{
int ele = input.poll();

if (ele == output.peek())
{
output.poll();
while (!tempStack.isEmpty())
{
if (tempStack.peek() == output.peek())
{
tempStack.pop();
output.poll();
}
else
break;
}
}
else
{
tempStack.push(ele);
}
}

return (input.isEmpty() && tempStack.isEmpty());
}

public static void main(String[] args)
{
int input[] = { 1, 2, 3 };

int output[] = { 2, 1, 3 };
int n = 3;
if (checkStackPermutation(input, output, n))
System.out.println("Yes");
else
System.out.println("Not Possible");
}

}
