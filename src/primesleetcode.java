class Solu {
    public static void main(String[] args) {
        System.out.println(countPrimes(2));
    }
    static public int countPrimes(int n) {
        int count=0;
    boolean arr[]=new boolean[n];
        for(int i=0;i<n;i++)
    {
        arr[i]=true;
    }
        for(int i=2;i*i<n;i++)
    {
        if(arr[i]==true) {
            for(int j=i*i;j<n;j+=i)
            {
                arr[j]=false;
            }
        }
    }
        for(int i=2;i<n;i++)
    {
        if(arr[i]==true) {
            System.out.println(i);
            count++;
        }
    }
        return count;
}
}