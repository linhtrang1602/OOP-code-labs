import java.util.Scanner;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;

    private static int nbOrders = 0;
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private String dateOrdered;

    public String getDateOrdered() {
        return dateOrdered;
    }

    public void setDateOrdered(String dateOrdered) {
        this.dateOrdered = dateOrdered;
    }

    public int getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(int qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc) {
        if (this.qtyOrdered < MAX_NUMBERS_ORDERED) {
            this.qtyOrdered += 1;
            itemsOrdered[this.qtyOrdered] = disc;
            System.out.println("The disc has been added");
        } else {
            System.out.println("The order is almost full");
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc [] dvdList) {
        for (int i = 0; i < dvdList.length; i++) {
            if (this.qtyOrdered < MAX_NUMBERS_ORDERED) {
                this.qtyOrdered += 1;
                itemsOrdered[this.qtyOrdered] = dvdList[i];
                System.out.println("The disc " + dvdList[i].getTitle() + " has been added");
            } else {
                System.out.println("The order is almost full");
                break;
            }
        }
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (this.qtyOrdered < MAX_NUMBERS_ORDERED) {
            this.qtyOrdered += 1;
            itemsOrdered[this.qtyOrdered] = dvd1;
            System.out.println("The disc " + dvd1.getTitle() + " has been added");
        } else {
            System.out.println("The order is almost full");
        }
        if (this.qtyOrdered < MAX_NUMBERS_ORDERED) {
            this.qtyOrdered += 1;
            itemsOrdered[this.qtyOrdered] = dvd2;
            System.out.println("The disc " + dvd2.getTitle() + " has been added");
        } else {
            System.out.println("The order is almost full");
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int i = 1;
        while (i <= this.qtyOrdered) {
            if (itemsOrdered[i].getTitle().equals(disc.getTitle())) {
                break;
            }
            i++;
        }

        if (i > this.qtyOrdered) {
            System.out.println("The disc is not in the order yet");
        } else {
            for (int j = i; j <= this.qtyOrdered; j++){
                itemsOrdered[j] = itemsOrdered[j + 1];
            }
            this.qtyOrdered--;
            System.out.println("The item " + disc.getTitle() + " has been removed");
        }
    }

    public float totalCost() {
        float total = 0;
        for (int i = 1; i <= qtyOrdered; i++) {
            total += itemsOrdered[i].getCost();
        }
        return total;
    }

    //constructor of Order class
    public Order() {
        setDateOrdered(String.valueOf(java.time.LocalDate.now()));
        if (nbOrders < MAX_LIMITED_ORDERS) {
            nbOrders++;
        } else {
            System.out.println("The order is full");
        }
    }

    public void printOrder() {
        System.out.println("***********************Order***********************");
        System.out.println("Date: " + getDateOrdered());
        System.out.println("Ordered Items:");
        for (int i = 1; i <= qtyOrdered; i++) {
            System.out.println(i + ". DVD - " + itemsOrdered[i].getTitle() + " - " + itemsOrdered[i].getCategory() + " - " + itemsOrdered[i].getDirector() + " - " + itemsOrdered[i].getLength() + ": " + itemsOrdered[i].getCost() + "$");
        }
        System.out.println("Total cost: " + totalCost());
        System.out.println("***************************************************");
    }
}
