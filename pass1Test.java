import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

/**
 * Created by admin01 on 25/5/16.
 */
public class pass1Test {

  private pass1 obj=new pass1();

    @Test
    public void add() throws Exception {
        boolean r1=obj.add("janani",12);
        assertEquals(true,r1);
        boolean r2=obj.add("kavishree",12);
       assertEquals(true,r2);



    }

    @Test
    public void getSizeByAgegroup() throws Exception {

        boolean r1=obj.add("janani",12);
        boolean r2=obj.add("kavishree",12);
        boolean r3=obj.add("jan",16);

        HashMap<Integer,Integer> actual=(HashMap)obj.getSizeByAgegroup();
        final HashMap<Integer, Integer> expected = new HashMap<Integer, Integer>() {
            {
                put(12, 2);
                put(16,1);
            }
        };
        assertEquals(expected,actual);
    }

}