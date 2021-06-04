package teststudent;

public class TestStudent {

    public static void main(String[] args) {
        int x = 0;
        int y = 5;
        do {
            ++x;
            y--;
        } while (x < 3);
        System.out.println(x + " " + y);
    }

}
