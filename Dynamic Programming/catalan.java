import java.util.*;
class catalanN 
{
  

static void catalan(int n)
{
    int cat_ = 1;

    
    System.out.print(cat_+" "); // C(0)

    
    for (int i = 1; i < n; i++) 
    {
       
        cat_ *= (4 * i - 2);
        cat_ /= (i + 1);
        System.out.print(cat_+" ");
    }
}


public static void main(String args[])
{
    int n = 5;

    
    catalan(n);
}
}