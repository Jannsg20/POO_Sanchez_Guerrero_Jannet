class EntradaTexto{

    //cuerpo del programa o la clase

     public static void main(String[] args) {
        //cuerpo del metodo principal

        /*
        vamos a realizar un programa en el cual podamos introducir texto a nuestra convenicencia
        */

        String nombre;
        
        System.out.println("Por favor introduce tu nombre: ");

        nombre = System.console().readLine();
        System.out.println("Hola, " + nombre + "Bienvenido a tu segundo programa");

        }
}