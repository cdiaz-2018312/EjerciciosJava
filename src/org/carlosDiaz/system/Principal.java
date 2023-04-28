package org.carlosDiaz.system;

import org.carlosDiaz.bean.*;
import javax.swing.JOptionPane;

/**
 *
 * @author carlos diaz
 * @date 01/04/2022 IN5BM grupo: 1
 */
public class Principal {

    public static void main(String[] args) {
        float distancia;
        int Num;

        Num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero de ejercicio que desea realizar"));
        switch (Num) {
            case 1:
                RepartidorPizza tiempo = new RepartidorPizza();
                distancia = Float.parseFloat(
                        JOptionPane.showInputDialog("Ingrese la cantidad de Kilometros a "
                                + "la que se encuentra para darle un tiempo estimado"));
                tiempo.setKm(distancia);
                JOptionPane.showMessageDialog(null, "el tiempo en segundos estimado es de: " + tiempo.TiempoEstimado() + "s");
                break;
            case 2:
                float nota1;
                float nota2;
                float nota3;
                nota1 = Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota 1"));
                nota2 = Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota 2"));
                nota3 = Float.parseFloat(JOptionPane.showInputDialog("ingrese la nota 3"));
                Promedio pr = new Promedio(nota1, nota2, nota3);
                JOptionPane.showMessageDialog(null, "\nnota1: " + nota1
                        + "\nnota 2: " + nota2
                        + "\nnota 3: " + nota3
                        + "\npromedio: " + pr.operacionPromedio());
                break;
            case 3:
                float c;
                c = Float.parseFloat(JOptionPane.showInputDialog("ingrese los grados C°"));
                Fahrenheit F = new Fahrenheit(c);
                JOptionPane.showMessageDialog(null, "grados Fahrenheit: \n" + F.Operacion());
                break;
            case 4:
                String dia;
                dia = JOptionPane.showInputDialog("ingrese el dia de la semana");
                dia = dia.toLowerCase();
                switch (dia) {
                    case "lunes":
                        JOptionPane.showMessageDialog(null, "Dia Laboral");
                        break;
                    case "martes":
                        JOptionPane.showMessageDialog(null, "Dia Laboral");
                        break;
                    case "miercoles":
                        JOptionPane.showMessageDialog(null, "Dia Laboral");
                        break;
                    case "jueves":
                        JOptionPane.showMessageDialog(null, "Dia Laboral");
                        break;
                    case "viernes":
                        JOptionPane.showMessageDialog(null, "Dia Laboral");
                        break;
                    case "sabado":
                        JOptionPane.showMessageDialog(null, "Dia No Laboral");
                        break;
                    case "domingo":
                        JOptionPane.showMessageDialog(null, "Dia No Laboral");
                        
                    default:
                        JOptionPane.showMessageDialog(null,"Dia Inexistente");
                        break;

                }
                break;
            case 5:
                String letra;
                letra= JOptionPane.showInputDialog("igrese una letra o vocal");
                letra= letra.toLowerCase();
                if(letra=="q" || letra=="w"){
                    JOptionPane.showMessageDialog(null,"es consonante");
                }else if( letra=="a"|| letra=="e"|| letra=="i"|| letra=="o"|| letra=="u"){
                    JOptionPane.showMessageDialog(null,"es vocal");
                 }
                break;
            default:
                JOptionPane.showMessageDialog(null,"no es ni uno de los 5 ejercicios");
                
        }
    }
}
