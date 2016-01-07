
public class Caller {
    private String name;
    private int id;
    private static int nextid=0;
    
    public Caller(String n){
        name=n;
        nextid++;
        id=nextid;
    }
    
    public String toString(){
        return "Caller "+ name + "\tID: "+ id;
    }
    
}
