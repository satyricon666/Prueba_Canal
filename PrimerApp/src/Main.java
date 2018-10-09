
import java.util.Scanner;
public class Main {
    
    public static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        cicloFor();
    }
    public static void holaMundo(){
        int edad = 0;
        double nota1 =0.00;
        String nombre = "";
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(s.nextLine());
        System.out.println("Ingrese su calificacion: ");
        nota1 = Double.parseDouble(s.nextLine());
        System.out.println("Ingrese su nombre: ");
        nombre = s.nextLine();
        System.out.println("Su nombre es " + nombre + ". Su edad es " + edad + ". Su calificacion es " + nota1 + ".");
    }
    public static void estructuraControl1(){
    
        int edad = 0;
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(s.nextLine());
        if (edad >= 18) {
            System.out.println("La persona es mayor de edad.");
            }else {
                   System.out.println("La persona es menor de edad.");
                    }
        
    }
    public static void estructuraControl2(){
        int variable = 0;
        System.out.println("Ingrese un numero:");
        variable = Integer.parseInt(s.nextLine());
        switch (variable){
            
                case 1: System.out.println("Su numero es 1.");
                break;
                case 2: System.out.println("Su numero es 2.");
                break;
                case 3: System.out.println("Su numero es 3.");
                break;
                default: System.out.println("N/A");
                }
    }
    public static void estructuraControl3(){
        double num1=0.0, num2=0.0, num3=0.0, promedio=0.0;
        String resultado="";
        System.out.println("Ingrese primera nota:");
        num1= Double.parseDouble(s.nextLine());
        System.out.println("Ingrese segunda nota:");
        num2= Double.parseDouble(s.nextLine());
        System.out.println("Ingrese tercera nota:");
        num3= Double.parseDouble(s.nextLine());
        promedio = (num1+num2+num3) / 3;
        System.out.println("Promedio: " + promedio + ".");
        resultado = promedio >= 6.0 ? "Aprobado." : "Reprobado.";
        System.out.println("Alumno: " + resultado);
    }
    public static void cicloWhile (){
    
        int contador = 0, numero = 0, sumador = 0;
        while (contador < 5){
            System.out.println("Ingrese un numero:");
            numero = Integer.parseInt(s.nextLine());
            sumador = sumador + numero;
            contador = contador + 1;
        }
        System.out.println("Fin ciclo, la suma de los numeros ingresados es: " + sumador + ".");
}
    public static void cicloDoWhile (){
    
        int numero = 0;
        double nota = 0.0;
        do{
            System.out.println("Ingrese un numero:");
            numero = Integer.parseInt(s.nextLine());
          }while(numero < 0);
            System.out.println("Numero correcto.");
            
            do{
                System.out.println("Ingrese una nota:");
                nota = Double.parseDouble(s.nextLine());
              }while(nota < 1.0 || nota > 7.0);
            System.out.println("Nota correcta. " + nota);          
}     
        public static void cicloFor (){
    
               for(int i=0;i<5;i++){
            System.out.println("Hola Mundo For");
        }   
} 
}
