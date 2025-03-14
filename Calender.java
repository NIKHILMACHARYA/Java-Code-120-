import java.util.Calender;
public class dateDemo{
    public static void main(String [] args){
        Calender calender=Calender.getInstance();
        String[] month={
            "Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"        
        };
        System.out.println("Current Month="+month[calender.get(Calender.MONTH)]);
    }
 }