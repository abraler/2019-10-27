import java.util.Map;
import java.util.TreeMap;

public class Contect {
    Map<String,User>map=new TreeMap<>();
    public void add(String name,String mobilphone,String officephone)throws nameException{
        User user=new User(name,mobilphone,officephone);
        if(map.containsKey(name)){
            throw new nameException();
        }
        map.put(name,user);
    }
//    public User search(String name){
//        if(map.containsKey(name)){
//            User a=map.get(name);
//            return a;
//        }
//        return null;
//    }
    public void search(String name)throws usernotException{
        if(!map.containsKey(name)){
            throw new usernotException();

        }
        System.out.println(map.get(name));
    }
    public void remove(String name)throws usernotException{
        if(!map.containsKey(name)){
            throw new usernotException();
        }
        System.out.println(map.remove(name));
    }
    public void display(){
        map.forEach((String,User)-> System.out.println(String+":"+User));
    }
    public void updata1(String name,User user)throws usernotException{
        if(!map.containsKey(name)){
            throw new usernotException();
        }
        map.replace(name,user);
    }
    public void updata2(String name,String name2,User user)throws usernotException,nameException{
        if(!map.containsKey(name)) {
            throw new usernotException();
        }
        map.remove(name);
        if(map.containsKey(name2)){
            throw new nameException();
        }
        map.put(name2,user);

    }
    public User search2(String name){
        return map.get(name);
    }
}
