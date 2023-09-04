import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner lector = new Scanner(System.in);
        System.out.println("¿Hasta que tabla de multiplicar?");
        byte tabla = lector.nextByte();

        while(tabla > 50){
            System.out.println("Valor demaciado alto");
            System.out.println("¿Hasta que tabla de multiplicar?");
            tabla = lector.nextByte();
        }
            
            for(int j=1; j<=tabla; j++){//pasar de una tabla a otra
                System.out.println("-.-.-.-.-..- Tabla del "+j+ " -.-.-.-.-..-");
                 for(int i = 1; i <= 12; i++){
                     System.out.println(j + " x " +i+ " = " +j*i);
                }
            }
        
        lector.close();
    }
}
