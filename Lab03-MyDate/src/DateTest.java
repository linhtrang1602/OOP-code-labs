public class DateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate();
        MyDate date2 = new MyDate(12, 12, 2012);
        MyDate date3 = new MyDate("12/12/2012");
        date1.print();
        date2.print();
        date3.print();
        date1.accept();
        date1.print();
    }
}
