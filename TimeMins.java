import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
public class TimeMins {
	public static void main(String args[]) throws Exception
	{
		String t1="12:23:30";
		String t2="12:26:00";
        SimpleDateFormat format = new SimpleDateFormat("HH:MM:SS");
        Date date1 = format.parse(t1);
        Date date2 = format.parse(t2);
        long difference = date2.getTime()-date1.getTime();
        System.out.println(difference/1000);
}
}
