import java.util.Scanner;
public class cadena{
    Scanner entrada= new Scanner(System.in);
    /*
    Vamos a empezar a jugar con cadenas
    */
    public void cadenas(){
        String s1="Hola";
        //obtener la lomgitud de cadena
        System.out.println("El tamaño de la cadena es: "+s1.length());
//si comienza con ......
System.out.println("La cadena inicia con V o F con Hola?"+s1.startsWith("Hola"));
//si termina con .......
System.out.println("La cadena termina V o F con gato?"+s1.endsWith("gato"));
//vamos a obtener subcadenas de la primera cadena
System.out.println("Parte de una subcadena de s1: "+s1.indexOf("tito"));
//vamos a sustraer una palabrea de una cadena
System.out.println("Primera parte: "+s1.substring(12));
System.out.println("Segunda parte: "+s1.substring(3,11));
//convertir una palabra de la cadena
int valor = 24;
String s3 = String.valueOf(valor);
/*
cadena  int
2+2=22  2+2=4
*/
//convertir una cadena en numero
String s4 = "20";
int numero= Integer.parseInt(s4);
System.out.println("El valor es de: "+numero+"ahora es un numero");
//convertir cadena a un decimal
String s5="20.89";
Double numero1=Double.parseDouble(s5);
System.out.println("El valor es de: "+numero1+"ahora es un doble");
//metodo toString convierte un entero a una cadena
Integer x=5;
System.out.println("El valor de: "+x.toString()+"ahora es una cadena");
System.out.println("El valor de: "+Integer.toString(12)+"ahora es una cadena");
    }
}