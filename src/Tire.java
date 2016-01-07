
public class Tire {
    private String make;
    private int id;
    private static int nextid=1;
    
    public Tire (String m){
        make=m;
        id=nextid;
        nextid++;
    }
    
    public String toString(){
        return "ID "+ id +"\t" +make;
    }
}
