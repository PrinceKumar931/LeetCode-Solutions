//Subtract the Product and Sum of Digits of an Integer
class Solution1281
{

    public static int subtractProductAndSum(int n)
    {
        int sum=0;
        int prod=1;
        int rem=0;
        
        while(n>0)
        {
            rem=n%10;
            n=n/10;
            sum+=rem;
            prod*=rem;
            
        }

        return prod-sum;
    }

    public static void main(String[] args) {
        System.out.println(subtractProductAndSum(234));
        
    }
}