class Solution {

    public int minSwaps(int[] nums) {

        int n = nums.length;

        int d[][] = new int[nums.length][2];
        //int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            d[i][0]=nums[i];
            d[i][1]=i;

            // int d=sum(nums[i]);
            // a[i]=d;
        }

        Arrays.sort(d,(a,b) -> {
            
            int x=sum(a[0]);
            int s=sum(b[0]);

            if(x!=s)
            {
                return Integer.compare(x,s);
            }
            return Integer.compare(a[0],b[0]);
        });

        int sw=0;

        for(int i=0;i<n;i++)
        {
            while(d[i][1]!=i)
            {
                int j=d[i][1];

                int[] t=d[i];
                d[i]=d[j];
                d[j]=t;
                sw++;
            }
        }

      return sw;
       
    }
    public static int sum(int d)
    {
        int sum = 0;
        while(d>0)
        {
            int digi=d%10;
            sum+=digi;
            d=d/10;
        }
        return sum;
    }
}