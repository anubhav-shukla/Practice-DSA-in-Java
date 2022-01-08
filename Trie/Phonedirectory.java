package DSA;
import java.util.*;
public class Phonedirectory {
	HashMap<Character,Phonedirectory> child;
	  
    boolean isLast;
    public Phonedirectory()
    {
        child = new HashMap<Character,Phonedirectory>();
  
      
        for (char i = 'a'; i <= 'z'; i++)
             child.put(i,null);
  
        isLast = false;
    }
}
  
class Trie
{
	Phonedirectory root;
  
    public void insertIntoTrie(String contacts[])
    {
        root = new Phonedirectory();
        int n = contacts.length;
        for (int i = 0; i < n; i++)
        {
            insert(contacts[i]);
        }
    }
  

    public void insert(String s)
    {
        int len = s.length();
  
    
        Phonedirectory itr = root;
        for (int i = 0; i < len; i++)
        {
            
        	Phonedirectory nextNode = itr.child.get(s.charAt(i));
            if (nextNode == null)
            {
            
                nextNode = new Phonedirectory();
  
            
                itr.child.put(s.charAt(i),nextNode);
            }
  
          
            itr = nextNode;
  
            if (i == len - 1)
                itr.isLast = true;
        }
    }
  
    
    public void displayContactsUtil(Phonedirectory curNode,
                                   String prefix)
    {
  
        
        if (curNode.isLast)
            System.out.println(prefix);
  
        for (char i = 'a'; i <= 'z'; i++)
        {
        	Phonedirectory nextNode = curNode.child.get(i);
            if (nextNode != null)
            {
                displayContactsUtil(nextNode, prefix + i);
            }
        }
    }
  
    void displayContacts(String str)
    {
        TrieNode prevNode = root;
  
  
        String prefix = "";
        int len = str.length();
  
        
        int i;
        for (i = 0; i < len; i++)
        {
            prefix += str.charAt(i);
  
            char lastChar = prefix.charAt(i);
  
           
            TrieNode curNode = prevNode.child.get(lastChar);
  
            if (curNode == null)
            {
                System.out.println("nNo Results Found for "
                                          + prefix + "");
                i++;
                break;
            }
            System.out.println("nSuggestions based on "
                                    + prefix + " are");
            displayContactsUtil(curNode, prefix);
  
            prevNode = curNode;
        }
  
        for ( ; i < len; i++)
        {
            prefix += str.charAt(i);
            System.out.println("nNo Results Found for "
                                          + prefix + "");
        }
    }

  

    public static void main(String args[])
    {
        Trie trie = new Trie();
  
        String contacts [] = {"gforgeeks", "geeksquiz"};
  
        trie.insertIntoTrie(contacts);
  
        String query = "gekk";
  
        trie.displayContacts(query);
    }

}
