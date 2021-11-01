package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PrintAnagramsTogether {
    static final int NO_OF_CHARS = 26;
    static class TrieNode
    {
        boolean isEnd;  
        TrieNode[] child = new TrieNode[NO_OF_CHARS];
        LinkedList<Integer> head; 
        public TrieNode() 
        {
            isEnd = false;
            head = new LinkedList<>();
            for (int i = 0; i < NO_OF_CHARS; ++i)
                child[i] = null;
        }
    }
     
    static TrieNode insert(TrieNode root,String word,
                                int index, int i)
    {
        if (root == null)
        {
            root = new TrieNode();
        }
        
        if (i < word.length() )
        {
            int index1 = word.charAt(i) - 'a';
            root.child[index1] = insert(root.child[index1],
                                       word, index, i+1 );
        }
        else
        {
            
            if (root.isEnd == true)
            {
                root.head.add(index);
            }
            else
            {
                root.isEnd = true;
                root.head.add(index);
            }
        }
        return root;
    }

    static void printAnagramsUtil(TrieNode root, 
                                      String wordArr[])
    {
        if (root == null)
            return;
        if (root.isEnd)
        {
            for(Integer pCrawl: root.head)
                System.out.println(wordArr[pCrawl]);
        }
     
        for (int i = 0; i < NO_OF_CHARS; ++i)
            printAnagramsUtil(root.child[i], wordArr);
    }
     
    static void printAnagramsTogether(String wordArr[], 
                                               int size)
    {
        TrieNode root = null;
     
        for (int i = 0; i < size; ++i)
        {
            char[] buffer = wordArr[i].toCharArray();
           
            Arrays.sort(buffer);
            root = insert(root, new String(buffer), i, 0);
            
        }
        printAnagramsUtil(root, wordArr);
    }
    public static void main(String args[])
    {
        String wordArr[] = {"cat", "dog", "tac", "god",
                                        "act", "gdo"};
        int size = wordArr.length;
        printAnagramsTogether(wordArr, size);
    }
}
