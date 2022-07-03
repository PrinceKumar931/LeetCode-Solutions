// Average Salary Excluding the Minimum and Maximum Salary
public class Solution1491 {
    public static double findMax(int []arr)
    {
        double max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
                max=arr[i];
        }
        
        return max;
    }
    
    public static double findMin(int []arr)
    {
        double min=arr[0];
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
            
        return min;
    }
    public static double average(int[] salary) {
        
        
        double max=findMax(salary);
        double min=findMin(salary);
        double sum=0;
        
        for(int i=0;i<salary.length;i++)
        {
            sum=sum+salary[i]; 
        }
        
        double avg=(sum-(max+min))/(salary.length-2);
        return avg;
    }  
    public static void main(String[] args) {
        int []salary={4000,3000,1000,2000};
        System.out.println(average(salary));
    }


}
