package DSA;

public class WordBreakProblem {
	static final int ALPHABET_SIZE = 26;

	static class TrieNode
	{
	    TrieNode children[];

	    boolean isEndOfWord;

	    TrieNode()
	    {
	        children = new TrieNode[ALPHABET_SIZE];
	        for(int i = 0; i < ALPHABET_SIZE; i++)
	            children[i] = null;
	            
	        isEndOfWord = false;
	    }
	}

	static void insert(TrieNode root, String key)
	{
	    TrieNode pCrawl = root;

	    for(int i = 0; i < key.length(); i++) 
	    {
	        int index = key.charAt(i) - 'a';
	        if (pCrawl.children[index] == null)
	            pCrawl.children[index] = new TrieNode();

	        pCrawl = pCrawl.children[index];
	    }

	    pCrawl.isEndOfWord = true;
	}

	static boolean search(TrieNode root, String key)
	{
	    TrieNode pCrawl = root;

	    for(int i = 0; i < key.length(); i++)
	    {
	        int index = key.charAt(i) - 'a';
	        if (pCrawl.children[index] == null)
	            return false;

	        pCrawl = pCrawl.children[index];
	    }
	    return (pCrawl != null && pCrawl.isEndOfWord);
	}

	static boolean wordBreak(String str, TrieNode root)
	{
	    int size = str.length();

	    if (size == 0)
	        return true;

	    for(int i = 1; i <= size; i++) 
	    {
	        
	        if (search(root, str.substring(0, i)) && 
	            wordBreak(str.substring(i, size), root))
	            return true;
	    }

	    return false;
	}

	public static void main(String []args)
	{
	    String dictionary[] = { "mobile", "samsung",
	                            "sam", "sung", "ma",
	                            "mango", "icecream", 
	                            "and", "go", "i", "like",
	                            "ice", "cream" };
	                            
	    int n = dictionary.length;
	    TrieNode root = new TrieNode();

	    for(int i = 0; i < n; i++)
	        insert(root, dictionary[i]);

	    System.out.print(wordBreak("ilikesamsung", root) ?
	                               "Yes\n" : "No\n");
	    System.out.print(wordBreak("iiiiiiii", root) ? 
	                               "Yes\n" : "No\n");
	    System.out.print(wordBreak("", root) ?
	                               "Yes\n" : "No\n");
	    System.out.print(wordBreak("ilikelikeimangoiii", root) ?
	                               "Yes\n" : "No\n");
	    System.out.print(wordBreak("samsungandmango", root) ?
	                               "Yes\n" : "No\n");
	    System.out.print(wordBreak("samsungandmangok", root) ?
	                               "Yes\n" : "No\n");
	}
	
}
