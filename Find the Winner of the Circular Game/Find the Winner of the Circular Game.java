import java.util.*;
public class j08_josephus_problem {
    static int josephus(int n, int k) {
        List<Integer> circle = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            circle.add(i);
        }

        int i = 0;
        while (circle.size() > 1) {
            int j = (i + k - 1) % circle.size();
            circle.remove(j);
            i = j;
        }

        return circle.get(0);
    }

    public static void main(String[] args) {
        int n = 7, k = 3;

        int ans = josephus(n, k);
        System.out.println(ans);
    }
}


=============================================================
  

import java.util.*;

public class j02_josephus_problem {

    static int josephus(int n, int k) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

        Iterator<Integer> it = list.iterator();
        while (list.size() > 1) {
            int count = 0;
            while (count < k) {
                while (it.hasNext() && count < k) {
                    it.next();
                    count++;
                }
                if (count < k) {
                    it = list.iterator();
                    it.next();
                    count++;
                }
            }
            it.remove();
        }
        return list.getFirst();
    }

    public static void main(String[] args) {
        int n = 7, k = 3;

        int ans = josephus(n, k);
        System.out.println(ans);
    }
}



=================================================================
    
    
// efficient method    
public class j15_josephus_problem {

    static int jos(int n, int k) {
        if (n == 1)
            return 0;
        else
            return ((jos(n - 1, k) + k) % n);
    }

    static int myJos(int n, int k) {
        return jos(n, k) + 1;
    }

    public static void main(String[] args) {
        System.out.println(myJos(5, 3));
    }
}
