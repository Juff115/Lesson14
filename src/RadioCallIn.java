
public class RadioCallIn {
  
    public static void main(String[] args) {
        //create a phone line queue
        linkedQueue phoneline = new linkedQueue();
        System.out.print("Our lines are open");
        System.out.println(". We currently have "+phoneline.size()+" callers");
        System.out.println("3 people have just called in....");
        phoneline.enqueue(new Caller("Steve"));
        phoneline.enqueue(new Caller("Tim"));
        phoneline.enqueue(new Caller("Joe"));
        System.out.println("The next caller is "+phoneline.peekFront());
        System.out.println("We are now talking to: "+phoneline.dequeue());
        System.out.println("Let's talk to the next caller...");
        System.out.println("We are now talking to: "+phoneline.dequeue());
        System.out.println(". We currently have "+phoneline.size()+" callers");
        System.out.println("2 more people have called in");
        phoneline.enqueue(new Caller("Jeremy"));
        phoneline.enqueue(new Caller("Mike"));
        System.out.println("Let's talk to the next caller...");
        System.out.println("We are now talking to: "+phoneline.dequeue());
        System.out.println("------------------");
        System.out.println("Let's clear the phone lines");
        while(phoneline.size()>0){
            System.out.println(phoneline.dequeue());
        }
        
    }
    
}
