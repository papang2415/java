package test;

//import javax.swing.JOptionPane;
import java.util.Random;

public class Test {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null,"Jolly");
//        String name = "Jolly. d";
//        System.out.println(name.indexOf('d'));
        Random newRandom = new Random();
        long a = newRandom.nextInt();
        long b = newRandom.nextInt();
        System.out.println("Random: " + a+b);
    }

}
