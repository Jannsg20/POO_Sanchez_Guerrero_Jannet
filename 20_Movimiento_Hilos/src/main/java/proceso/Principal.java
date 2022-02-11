/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proceso;

/**
 *
 * @author PC
 */
import javax.swing.JFrame;


public class Principal extends JFrame{
    public Principal(){
        
       setTitle("Juego");
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setSize(900,550);
       setLocationRelativeTo(null);
       setResizable(false);
       add(new Tablero());
       setVisible(true);
    }
    
     public static void main(String args[]){
       new Principal();
    }
} 