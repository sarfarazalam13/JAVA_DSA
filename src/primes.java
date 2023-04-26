
class Sol {
    public static void main(String[] args) {
        int x=countPrimes(10);
        System.out.println(x);
    }

    static public int countPrimes(int n)
    {
        int count=0;
        for (int num = 2; num < n; num++)
        {
            boolean isPrime = true;
            for (int i=2; i< num; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime==true)
            {
                count++;
            }
        }
        return count;
    }
}