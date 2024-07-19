import java.text.NumberFormat;

public class formatNum {
    public static void main(String[] args) {
//        NumberFormat percentage = NumberFormat.getPercentInstance();
//       String result= percentage.format(0.1);

        String result = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result);
    }
}
