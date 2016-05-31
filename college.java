import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by admin01 on 23/5/16.
 */
public class college {
    public String studentName;
    public String college;
    public String courseName;
    public static HashMap<String, Set<String>> col_details = new HashMap<String, Set<String>>();


    college(String name, String course, String college) {
        this.studentName = name;
        this.college = college;
        this.courseName = course;

    }

    boolean create_Map(college obj) {

        if (col_details.get(obj.college) == null) {
            col_details.put(obj.college, new TreeSet<String>());
        }

        boolean result = col_details.get(obj.college).add(obj.courseName);
        return result;
    }

    TreeSet<String> common_Courses() {

        TreeSet<String> temp_set2 = new TreeSet<>();
        int flag = 0;
        TreeSet<String> temp_set1 = new TreeSet<String>();

        for(Map.Entry<String,Set<String>> entry : col_details.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();

            if (flag == 0) {
                //creating a temporary treeset from set
                temp_set1 = (TreeSet) entry.getValue(); //initializing the tree set for the first time

            } else {
                temp_set2 = (TreeSet) entry.getValue();

                temp_set2.retainAll(temp_set1);
                temp_set1.clear();
                temp_set1.addAll(temp_set2);
            }
            flag = 1;

        }
        return temp_set2;



    }
        }
        
