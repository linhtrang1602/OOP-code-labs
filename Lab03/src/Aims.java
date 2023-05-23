import java.util.Scanner;

public class Aims {
    public static void main(String[] args) {
        Order anOrder =  new Order();

        DigitalVideoDisc dvd1 =  new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.5f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladddin");
        dvd2.setCategory("Animation");
        dvd2.setCost(18.99f);
        dvd2.setDirector("John Musker");
        dvd2.setLength(90);
        anOrder.addDigitalVideoDisc(dvd3);

        System.out.println("Total Cost is: " + anOrder.totalCost());
        System.out.println("Let you remove a disc, which one?");
        Scanner keyboard = new Scanner(System.in);
        String removeDisc = keyboard.nextLine();
        if (removeDisc.equals("dvd1")) {
            anOrder.removeDigitalVideoDisc(dvd1);
        } else if (removeDisc.equals("dvd2")) {
            anOrder.removeDigitalVideoDisc(dvd2);
        } else if (removeDisc.equals("dvd3")) {
            anOrder.removeDigitalVideoDisc(dvd3);
        } else {
            System.out.println("The disc you choose has not in the order yet!");
        }

        System.out.println("So now the order has " + anOrder.getQtyOrdered() + " dvd");
    }
}

