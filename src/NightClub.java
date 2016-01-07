
public class NightClub {

    public static void main(String[] args) {
        LinkedPriorityQueue lineup = new LinkedPriorityQueue(2);
        System.out.println("2 regular guys show up at the door");
        lineup.enqueue("Roger", 1);
        lineup.enqueue("Dequan", 1);
        System.out.println("1 special person arives");
        lineup.enqueue("Airwicka", 0);
        System.out.println("2 more regular guys show up at the door");
        lineup.enqueue("Tyrone", 1);
        lineup.enqueue("Jamal", 1);
        System.out.println("1 special person arives");
        lineup.enqueue("Shenequa", 0);
        System.out.println("Let the first 3 people in");
        System.out.println(lineup.dequeue());
        System.out.println(lineup.dequeue());
        System.out.println(lineup.dequeue());
        System.out.println("Let every one esle in");
        while(lineup.isEmpty()==false){
            System.out.println(lineup.dequeue());
        }
    }
    
}
