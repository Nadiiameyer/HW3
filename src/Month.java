import com.sun.xml.internal.bind.v2.model.core.MaybeElement;

public class Month {
    public static int getDaysInMonth(int monthNumber) {
        int daysInMonth;
        switch (monthNumber) {
            case 1:
                System.out.println("January");
            case 3:
                System.out.println("March");
            case 5:
                System.out.println("May");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 10:
                System.out.println("October");
            case 12:
                System.out.println("December");
                daysInMonth = 31;
                break;
            case 4:
                System.out.println("April");
            case 6:
                System.out.println("June");
            case 9:
                System.out.println("September");
            case 11:
                System.out.println("November");
                daysInMonth = 30;
                break;
            case 2:
                System.out.println("February");
                //Check for a leap year(2023 is not a leap year)
                daysInMonth = 28;
                break;
            default:
                daysInMonth = -1;
                System.out.println("Invalid month number");
                break;
        }
        return daysInMonth;
    }

    public static void main(String[] args) {
        int monthNumber = 8;
        int days = getDaysInMonth(monthNumber);
        if (days == -1) {
            System.out.println("Invalid month number");
        } else {
            System.out.println("In month number " + monthNumber + ", there are " + days + " days.");
        }
    }

}
