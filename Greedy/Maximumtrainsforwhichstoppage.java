package DSA;
import java.util.Arrays;
public class Maximumtrainsforwhichstoppage {
	
	 
	    public static void main(String args[])
	    {
	 
	        int arr[] = {100, 140, 150, 200, 215, 400};
	        int dep[] = {110, 300, 210, 230,315, 600};
	        System.out.println("Minimum platforms needed:"+findPlatformsRequiredForStation(arr,dep,6));
	    }
	 
	    static int findPlatformsRequiredForStation(int arr[], int dep[], int n)
	    {
	        int platform_needed = 0, maxPlatforms = 0;
	        Arrays.sort(arr);
	        Arrays.sort(dep);
	        int i = 0, j = 0;
	 
	        while (i < n && j < n)
	        {
	            if (arr[i] < dep[j])
	            {
	                platform_needed++;
	                i++;
	                if (platform_needed > maxPlatforms)
	                    maxPlatforms = platform_needed;
	            }
	            else
	            {
	                platform_needed--;
	                j++;
	            }
	        }
	        return maxPlatforms;
	    }
	
}
