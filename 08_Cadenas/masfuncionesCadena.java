import java.util.*;
public class masfuncionesCadena{
    Scanner entrada = new Scanner(System.in);

    public void masFunciones(){
        String s1=new String("Hola proque mi tele no llega");
        String s2="Harry potter ajedrez magico lego";
        String s3="Feliz no cumpleaños";
        String s4="Feliz no cumpleaños";
        System.out.println("Escribe la letra de un caracter: ");
        char y =entrada.next().charAt(0);
        System.out.println("Escribiste : "+y);
        //concatenar cadenas
    String salida ="Cadena s1:"+s1+"\n"+"\n Cadena s2:"+s2+"\n"+"\nCadena s3: "+s3+"\n"+"\n Cadena s4: "+s4+"\n";
    System.out.println(salida);
    String salidas="";
    //probar la igualdad de una cadena
    if(s1.equals("Solo juguito contigo")){
        //si es verdad
        salidas+="Si es igual la cadena";
        System.out.println(salidas);
    }else{
        salidas+="No es la misma cadena";
        System.out.println(salidas);
    }
    //probar con ==,solo sirve para objetos no para cadenas
    if(s1=="Hola porque mi tele no llega"){
        salida+="Si es igual la cadena";
        System.out.println(salida);
    }else{
        salidas+="No es la misma cadena porque objeto";
        System.out.println(salida);
    }
    //probar la igualdad ignorando mayusculas
    if(s3.equalsIgnoreCase(s4)){
        salidas+="Si es la misma cadena\n";
        System.out.println(salidas);
    }else{
        salidas+="No es la misma cadena\n";
        System.out.println(salidas);
    }
    //vamos a probar compareTo
    salida+="\n s1 compareTo(s2):"+s1.compareTo(s2)+
    "\n s2 compareTo(s1):"+s2.compareTo(s1)+
    "\n s3 compareTo(s4):"+s3.compareTo(s4)+
    "\n s4 compareTo(s3):"+s4.compareTo(s3)+"\n";
    System.out.println(salida);
    //obtener la segunda posicion de un caracter repetido
    String s5="Patito color cafe";
    int pos=0;
    pos=s5.indexOf('t',pos+1);
    System.out.println("La segunda aparicion de la t es:"+pos);
    }
}