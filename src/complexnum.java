    class complex
    {
        int real;
        int imag;
        complex(int real,int imag)
        {
            this.real=real;
            this.imag=imag;
        }
        public void show()
        {
            System.out.println(real+"+i"+imag);
        }
        static public complex add(complex c1,complex c2)
        {
            complex result=new complex(0,0);
            result.real=c1.real+c2.real;
            result.imag=c1.imag+c2.imag;
            return result;

        }


    public static void main(String[] args) {
        complex c1=new complex(1,2);
        complex c2=new complex(1,2);
        complex res= add(c1,c2);
        res.show();

    }

}
