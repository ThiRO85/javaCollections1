package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

class StairTest {
    static void stairCase(int x) {
        for (int i = 0; i < x; i++) {
            StringBuilder a = new StringBuilder("");
            StringBuilder b = new StringBuilder("");
            for (int j = 0; j < x - i - 1; j++) {
                a.append("_");
            }
            for (int k = 0; k <= i; k++) {
                if (x > 1) b.append("#");
                else System.out.println("Invalid parameter!");
            }
            System.out.println(a.toString() + b.toString());
        }
    }
}

public class Main {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public static void main(String[] args) throws ParseException {

        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Enter a number to stair case: ");
            n = sc.nextInt();
            StairTest.stairCase(n);
        }
        while (n > 1);

        sc.close();

        Date born = sdf.parse("03/04/1985");
        Date today = new Date();

        long duration = today.getTime() - born.getTime();
        double days = TimeUnit.DAYS.convert(duration, TimeUnit.MILLISECONDS);
        System.out.println(days);

        Calendar cal = Calendar.getInstance();
        cal.setTime(born);
        cal.add(Calendar.DAY_OF_MONTH, 15);
        Date test = cal.getTime();
        System.out.println(sdf.format(test));

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        String b = "03/04/1985";
        LocalDate a = LocalDate.parse(b, dtf);
        LocalDate c = LocalDate.now();
        Period d = Period.between(a, c);
        double age = d.getYears();
        System.out.println(age);
    }
}
