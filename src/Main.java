/**
 * @author Negin Mousavi
 */
public class Main {
    public static void main(String[] args) {
        //for example:
        MyDate myDate = new MyDate(1399, 12, 30);
        System.out.println(myDate.nextDay().toString());
        System.out.println(myDate.nextDay().toString());
        System.out.println(myDate.valid_date(1399,11,30));
    }
}
