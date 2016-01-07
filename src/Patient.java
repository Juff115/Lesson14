
public class Patient {
    private String name;
    private String condition;
    
    public Patient(String n, String c){
        name= n;
        condition=c;
    }
    
    public String getName(){
        return name;
    }
    
    public String getCondition(){
        return condition;
    }
    
    public String toString(){
        return name+ ": "+condition;
    }
}
