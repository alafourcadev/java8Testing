/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8testing;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java8testing.Domain.Desarrollador;

/**
 *
 * @author Alejandro
 */
public class LambdaComparator {

    public static void main(String[] args) {

        System.out.println("----- Java 7 -------");
        List<Desarrollador> listaDes = obtenerDesarrolladores();

        System.out.println("Antes de ordenar");
        for (Desarrollador dev : listaDes) {
            System.out.println(dev);
        }

        //Ordenar por edad
        Collections.sort(listaDes, new Comparator<Desarrollador>() {
            @Override
            public int compare(Desarrollador o1, Desarrollador o2) {
                return o1.getEdad() - o2.getEdad();
            }
        });

        System.out.println("Despues de Ordenar");
        for (Desarrollador des : listaDes) {
            System.out.println(des);
        }

        System.out.println("----- Java 8 -------");

        System.out.println("----- Ordenar con lambda -------");

        System.out.println("Despues de Ordenar");

       
        listaDes.sort((Desarrollador o1, Desarrollador o2) -> o1.getEdad()- o2.getEdad());

        //imprimir una lista con Java 8 usando Lambda
        listaDes.forEach((desarrollador) -> System.out.println(desarrollador));

    }

    private static List<Desarrollador> obtenerDesarrolladores() {
        List<Desarrollador> resultado = new ArrayList<>();

        resultado.add(new Desarrollador("Rainer", 27));
        resultado.add(new Desarrollador("Puchi", 30));
        resultado.add(new Desarrollador("Husseyn", 29));

        return resultado;
    }

}
