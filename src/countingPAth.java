class countingPAthandprinting {
    public static void main(String[] args) {
        System.out.println(path(3,3 ));
        printpath("",3,3);
    }
    static int path(int r,int c)
    {
        if(r==1 ||c==1)
        {
            return 1;
        }
         int left=path(r-1,c);
        int right=path(r,c-1);
        int digonal=path(r-1,c-1);
        return left+right+digonal;
    }
    static void printpath(String s,int r,int c)
    {
        if(r==1&&c==1)
        {
            System.out.println(s);
        }
        if(r>1)
        {
            printpath(s+"V",r-1,c);

        }
        if(c>1)
        {
            printpath(s+"H",r,c-1);
        }
        if(r>1 &&c>1)
        {
            printpath(s+"D",r-1,c-1);
        }


    }
}
