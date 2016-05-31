import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import java.util.TreeSet;

import static org.junit.Assert.*;

/**
 * Created by admin01 on 25/5/16.
 */
public class pass3Test {
    private pass3 obj=new pass3();

    @Test
    public void verifyset() throws Exception {
    obj.generate_random(100);
        int actual[]=obj.verifyset(97);
        int expected[]={96,98};
        assertArrayEquals(actual,expected);


    }

    @Test
    public void generate_random() throws Exception {
       int actual=obj.generate_random(100);
        assertEquals(100,actual);



    }

}