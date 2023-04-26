public class zerocount {
    static int steps=0;
    static int numberOfSteps(int num)
    {
        if(num==0)
        {
            return steps;
        }
        else
        {
            if(num%2==0)
            { steps++;
                return numberOfSteps(num/2);
            }
            else
            {steps++;
                return numberOfSteps(num-1);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));

    }
}
