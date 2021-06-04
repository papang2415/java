package tickhour;

public class TickHour {

    public static void main(String[] args) {
//        myTime t1 = new myTime();
        MyTime t2 = new MyTime(23, 59, 59);
//        System.out.println("The given Time");
//        t1.displayTime24(); 
//        System.out.println("\n Tick by Hour");
//        t1.tickByHour();
//        t1.displayTime24();
//        System.out.println("\nTick By minute");
//        t1.tickByMinute();
//        t1.displayTime24();
//        System.out.println("\nTick By Second");
//        t1.tickBySecond();
//        t1.displayTime24();
//        System.out.println("\nTick By Seconds");
//        t1.tickBySecond(5);
//        t1.displayTime24();

        System.out.println("The given Time");
        t2.displayTime24();
        System.out.println("\n Tick by Hour");
        t2.tickByHour();
        t2.displayTime24();
        System.out.println("\nTick By minute");
        t2.tickByMinute();
        t2.displayTime24();
        System.out.println("\nTick By Second");
        t2.tickBySecond();
        t2.displayTime24();
        System.out.println("\nTick By Seconds");
        t2.tickBySecond(5);
        t2.displayTime24();
    }

}
