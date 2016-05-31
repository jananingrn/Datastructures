import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.jar.Pack200;

/**
 * Created by admin01 on 23/5/16.
 */

public class pass3 {

    public static TreeSet<Integer> treeset = new TreeSet<Integer>();

    public int[] verifyset(int i) {

        int a[] = new int[2];
        a[0] = -1;
        if (treeset.contains(i) == true) {
            a[0] = treeset.lower(i);
            a[1] = treeset.higher(i);
            return a;
        } else {
            treeset.add(i);
            return a;
        }

    }

    public int generate_random(int n) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            int gen_no;
            do {
                gen_no = rand.nextInt(100);
            } while (treeset.contains(gen_no));
            treeset.add(gen_no);


        }
        return treeset.size();
    }
    }

