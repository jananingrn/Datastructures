import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.util.TreeSet;

import static org.junit.Assert.*;

/**
 * Created by admin01 on 25/5/16.
 */
public class collegeTest {

    private college[] obj = new college[250];

    @Test
    public void create_Map() throws Exception {

        BufferedReader br=new BufferedReader(new FileReader("/home/admin01/janani/assignments/src/assignment2.csv"));
        String l;
        String splitBy=",";
        int i=0;
        while ((l = br.readLine()) != null) {

            String details[] = l.split(splitBy);
            obj[i]=new college(details[0],details[1],details[2]);
                    i++;
        }
br.close();
        for(int j=0;j<i;j++)
        {
            boolean result= obj[j].create_Map(obj[j]);
        }






    }

    @Test
    public void common_Courses() throws Exception {


        BufferedReader br=new BufferedReader(new FileReader("/home/admin01/janani/assignments/src/assignment2.csv"));
        String line;
        String splitBy=",";
        int i=0;
        while ((line = br.readLine()) != null) {

            String details[] = line.split(splitBy);
            obj[i]=new college(details[0],details[1],details[2]);
            i++;
        }
        br.close();
        for(int j=0;j<i;j++)
        {

            boolean result= obj[j].create_Map(obj[j]);
        }


        TreeSet<String> expected=new TreeSet<>();
        expected.add("Bio");
        expected.add("Chemical");
        expected.add("ComputerScience");
        expected.add("Electrical");
        expected.add("Mechanical");
        expected.add("Medical");

        TreeSet<String> actual=obj[0].common_Courses();
        assertEquals(expected,actual);






    }

}