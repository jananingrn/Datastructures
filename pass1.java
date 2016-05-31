import java.util.*;
class pass1
{
    public HashMap<Integer,ArrayList<String>> map=new HashMap<Integer,ArrayList<String>>();
    boolean add(String name,int age)
    {
        if(map.get(age) == null) map.put(age,new ArrayList<String>());
       boolean addresult= map.get(age).add(name);
        return addresult;

    }

    HashMap<Integer,Integer> getSizeByAgegroup() {
        HashMap<Integer,Integer> age_count=new HashMap<Integer, Integer>();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry pair = (Map.Entry) it.next();
            ArrayList<String> ls = (ArrayList<String>) pair.getValue();
            int count=ls.size();

            age_count.put((int)pair.getKey(),count);
            System.out.println(pair.getKey() + "     "+count);
        }
        return age_count;
    }
}


