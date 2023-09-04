import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner lector =new Scanner(System.in);
    System.out.println("Color del semáforo: (r/a/v)");
    char color = lector.next().charAt(0);
    switch(color){
        case 'r' ->{
            System.out.print("El semáforo esta en rojo");
        }
        case 'a' ->{
            System.out.print("El semáforo esta en amarillo");
        }
        case 'v' ->{
            System.out.print("El semáforo esta en verde");
        }
        default->{
            System.out.println("Color incorrecto");
        }
    }
    
    lector.close();
    }
}
