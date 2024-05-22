
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //if practice

        Random random = new Random();
        int num1 = random.nextInt(3);
        int num2 = random.nextInt(3);
        //Numeros random
        //int num1 = 35;
        //int num2 = 35;
        //Operacion
        if (num1 > num2){
            System.out.println(num1 + " es mayor a " + num2);
        }else{
            if (num1 == num2){
                System.out.println("Los numeros son iguales: " + num1);
            }
            else{
                System.out.println(num2 + " es mayor a " + num1);
            }

        }

    }
}