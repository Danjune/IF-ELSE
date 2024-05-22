
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //if practice

        Random random = new Random();
        int num1 = random.nextInt(100);
        int num2 = random.nextInt(100);
        //Numeros random
        //int num1 = 45;
        //int num2 = 35;
        //Operacion
        if (num1 > num2){
            System.out.println(num1 + " es mayor a " + num2);
        }else{
            System.out.println(num2 + " es mayor a " + num1);

        }

    }
}