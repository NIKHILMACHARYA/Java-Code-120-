import java.util.Calendar;
public class DateDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // Fixed spelling

        String[] month = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", 
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
        };

        System.out.println("Current Month = " + month[calendar.get(Calendar.MONTH)]);
    }
}
