import java.util.ArrayList;
public class LinkedPriorityQueue implements PriorityQueue{
    
    private ArrayList list[];
    
    public LinkedPriorityQueue(int levels){
        list=new ArrayList[levels];
        for(int x=0; x<levels; x++){
            list[x]= new ArrayList();
        }
    }
    
    public void enqueue(Object o, int level) {
        list[level].add(o);
    }

     public void enqueue(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     
    public Object peekFront() {
        if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        for (int i = 0; i < list.length; i++) {
            if(size(i) >0) return list[i].get(0);
        }
        return null;
    }

    public boolean isEmpty(){
        boolean empty=true;
        for(int x=0; x<list.length; x++){
            if(list[x].size()>0) empty=false;
        }
        return empty;
    }
    
    public Object dequeue() {
         if (isEmpty())
            throw new IllegalStateException("Queue is empty");
        for (int i = 0; i < list.length; i++) {
            if(size(i) >0) return list[i].remove(0);
        }
        return null;
    }

    public int size() {
        return list.length;//return number of priority levels
    }
    
    public int size(int level){
        return list[level].size();
    }
    
}
