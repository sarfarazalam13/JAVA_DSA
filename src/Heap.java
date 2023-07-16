import java.util.ArrayList;
//min heap
/*
public class Heap {
    static class hip {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;
            while (arr.get(x) < arr.get(par)) //O(log n)
            {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public int remove() {
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            arr.remove(arr.size() - 1);

            heapify(0);
            return data;
        }

        private void heapify(int i) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            int min = i;

            if (l < arr.size() && arr.get(l) < arr.get(min)) {
                min = l;

            }
            if (r < arr.size() && arr.get(r) < arr.get(min)) {
                min = r;
            }
            if (min != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);

                heapify(min);
            }

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
    public static void main(String args[])
    {
        hip h=new hip();
        h.add(5);
        h.add(2);
        h.add(3);
        h.add(9);
        h.add(1);
       while(!h.isEmpty())
       {
           System.out.println(h.peek());
           h.remove();
       }
    }

    }*/

//Max Heap
public class Heap {
    static class hip {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);

            int x = arr.size() - 1;
            int par = (x - 1) / 2;
            while (arr.get(x) > arr.get(par)) //O(log n)
            {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        public int remove() {
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            arr.remove(arr.size() - 1);

            heapify(0);
            return data;
        }

        private void heapify(int i) {
            int l = 2 * i + 1;
            int r = 2 * i + 2;
            int min = i;

            if (l < arr.size() && arr.get(l) >arr.get(min)) {
                min = l;

            }
            if (r < arr.size() && arr.get(r) > arr.get(min)) {
                min = r;
            }
            if (min != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(min));
                arr.set(min, temp);

                heapify(min);
            }

        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String args[]) {
        hip h = new hip();
        h.add(5);
        h.add(2);
        h.add(3);
        h.add(9);
        h.add(1);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }
    }
}

