import java.util.Date;

public class DateAndTime {
    public static void main(String[] args) {
        Date today = new Date();
        System.out.println("现在" + today);
        System.out.println("日期标准格式" + String.format("%tF", today));

    }
}
