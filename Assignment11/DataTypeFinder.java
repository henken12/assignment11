package Assignment11;

import java.util.Random;

public class DataTypeFinder {
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt();
        if(randomNumber<=Byte.MAX_VALUE && randomNumber>=Byte.MIN_VALUE){
            System.out.println("best choice is byte");
        } else if (randomNumber<=Short.MAX_VALUE && randomNumber >= Short.MIN_VALUE) {
            System.out.println("best choice is short");
        }else {
            System.out.println("best choice integer");
        }
    }
}
