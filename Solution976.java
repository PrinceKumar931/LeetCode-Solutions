import java.util.Arrays;

//Largest parameter triangle.

class Solution976
{

    public static int largestPerimeter(int[] nums) {
        Arrays.sort(nums); //sorting array in ascending order.
        int size=nums.length;
        for(int i=size-1;i>=2;i--)
        {
            int a=nums[i-2];
            int b=nums[i-1];
            int c=nums[i];
            if(c<a+b)
                return a+b+c;
        }
        return 0;
        
    }

    public static void main(String[] args) {
        int []arr={2,1,2};

        System.out.println(largestPerimeter(arr));
    }
}
