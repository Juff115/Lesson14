
public class TireSales {

    public static void main(String[] args) {
        ArrayStack pole = new ArrayStack();
        System.out.println("Just bought 2 goodyear tires");
        pole.push(new Tire("Goodyear"));
        pole.push(new Tire("Goodyear"));
        System.out.println("Next tire to sell: "+pole.peekTop());
        System.out.println("Just bought 4 cooper tires");
        pole.push(new Tire("Cooper"));
        pole.push(new Tire("Cooper"));
        pole.push(new Tire("Cooper"));
        pole.push(new Tire("Cooper"));
        System.out.println("Sold 2 tires");
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        System.out.println("Bought 2 Michelin");
        pole.push(new Tire("Michelin"));
        pole.push(new Tire("Michelin"));
        System.out.println("Sold 4 tires");
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        System.out.println(pole.pop());
        System.out.println("Empty the pole");
        while (pole.size()>0){
            System.out.println(pole.pop());
        }
    }
    
}
