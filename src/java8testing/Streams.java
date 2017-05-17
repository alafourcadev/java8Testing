/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8testing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Alejandro
 */
public class Streams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //  -----  Java 7 --------
        List<String> devs = Arrays.asList("Rainer", "Puchi", "Husseyn");
        List<String> resultado = obtenerListaFiltrada(devs, "Rainer");
        for (String r : resultado) {
            System.out.println(r);    //salida : Puchi, Husseyn
        }
        
        
        // --    Java 8 con Stream (Filtros)
        
         List<String> desarrolladores = Arrays.asList("Rainer", "Puchi", "Husseyn");

        List<String> resultado1 = desarrolladores.stream()                // convierte la lista a un stream
                .filter(dev -> !"Rainer".equals(dev))           // los que no matchean con Rainer
                .collect(Collectors.toList());                  // Colecciona la salida y convierte todo a una lista

        resultado1.forEach(System.out::println);                //salida : Husseyn, Puchi

    }

    
    //Metodo privado para usar en Java 7
    private static List<String> obtenerListaFiltrada(List<String> developers, String filtro) {
        List<String> resultado = new ArrayList<>();
        for (String dev : developers) {
            if (!filtro.equals(dev)) { // los que no matchean con Rainer
                resultado.add(dev);
            }
        }
        return resultado;
    }

}
