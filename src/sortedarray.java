public class sortedarray {
    public static void main(String[] args) {
        int[] arr={1,0,3,4,5};
        System.out.println(ascending(arr,0));
    }
    static boolean ascending(int[] x,int index)
    {
      if(index==x.length-1)
      {
          return true;
      }
      else {
          return x[index]<x[index+1] && ascending(x,index+1);
      }

    }
}
