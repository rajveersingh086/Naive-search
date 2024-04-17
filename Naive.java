package pattern;


public class Naive
{
    static void search(String pat ,String txt)
    {
        int l1=pat.length(); // length of pattern.
        int l2=txt.length(); // length of text.
        int i=0,j=l2-1;
        
        for (i = 0,j=l2-1; j<l1;) // match the pattern to text.
        {
            if(txt.equals(pat.substring(i,j+1))){  // check every next pattern one by one if not match leave the first index i and shift to next.
            System.out.println("Patternfound a index at index "+i);
    }
    i++;
    j++;
}
}
    //driver code
    public static void main (String args []){
        String pat = "AABABAAB"; // pattern.
        String txt = "AA"; //Text would be match to pattern.
        search(pat,txt);
    }
}

//Time Complexity: O(N2)
//Auxiliary Space: O(1)