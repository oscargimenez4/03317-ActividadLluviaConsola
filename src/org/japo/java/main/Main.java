/* 
 * Copyright 2019 Oscar G.4 - oscargimenez4@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Random;

/**
 *
 * @author Oscar G.4 - oscargimenez4@gmail.com
 */
public class Main {

    public static final Random RND = new Random();

    public static void main(String[] args) {
        //Constantes Basicas
        final int LLUVIA_MAX = 500;
        final int LLUVIA_MIN = 0;
        final int DIAS_MIN = 0;
        final int DIAS_MAX = 7;
        //Constantes nombre dias
        final String NOMBRE_DIA1 = "Lunes";
        final String NOMBRE_DIA2 = "Martes";
        final String NOMBRE_DIA3 = "Miercoles";
        final String NOMBRE_DIA4 = "Jueves";
        final String NOMBRE_DIA5 = "Viernes";
        final String NOMBRE_DIA6 = "Sabado";
        final String NOMBRE_DIA7 = "Domingo";
        //Variable random
        int cantidadLitros;
        //Variables
        int dia = 0;
        int diaMax = 0;
        int diaMin = 7;
        int acumulador = 0;
        int mediaLluvia;
        String nomDia = null;
        String nomDiaMin = null;
        String nomDiaMax = null;
        int lluviaMax = 0;
        int lluviaMin = 500;
        //Bucle
        for (int i = DIAS_MIN; i < DIAS_MAX; i++) {
            //Random
            cantidadLitros = RND.nextInt(LLUVIA_MAX - LLUVIA_MIN + 1) + LLUVIA_MIN;
            //Switch para determinar los dias de la semana
            switch (dia + 1) {
                case 1:
                    nomDia = NOMBRE_DIA1;
                    break;
                case 2:
                    nomDia = NOMBRE_DIA2;
                    break;
                case 3:
                    nomDia = NOMBRE_DIA3;
                    break;
                case 4:
                    nomDia = NOMBRE_DIA4;
                    break;
                case 5:
                    nomDia = NOMBRE_DIA5;
                    break;
                case 6:
                    nomDia = NOMBRE_DIA6;
                    break;
                case 7:
                    nomDia = NOMBRE_DIA7;
                    break;
            }
            //Mensaje diario por pantalla con cada dia y sus litros
            System.out.printf("El %s han caido %03d L/m^2 %n", nomDia,
                    cantidadLitros);
            //Variable que va sumando la cantidad de litros que van saliendo para
            //hacer mas tarde las medias
            acumulador += cantidadLitros;
            //Incrementa en 1 el dia para que no sea siempre lunes
            dia++;
            //Condiciones para comprobar y determinar el dia que mas/menos llovio
            if (cantidadLitros > lluviaMax) {
                lluviaMax = cantidadLitros;
                diaMax = dia;
            }
            if (cantidadLitros < lluviaMin) {
                lluviaMin = cantidadLitros;
                diaMin = dia;
            }
        }
        //Switch para cambiar el nombre del dia que menos llovio
        switch (diaMin) {
            case 1:
                nomDiaMin = NOMBRE_DIA1;
                break;
            case 2:
                nomDiaMin = NOMBRE_DIA2;
                break;
            case 3:
                nomDiaMin = NOMBRE_DIA3;
                break;
            case 4:
                nomDiaMin = NOMBRE_DIA4;
                break;
            case 5:
                nomDiaMin = NOMBRE_DIA5;
                break;
            case 6:
                nomDiaMin = NOMBRE_DIA6;
                break;
            case 7:
                nomDiaMin = NOMBRE_DIA7;
                break;
        }
        //Switch para cambiar el nombre del dia que mas llovio
        switch (diaMax) {
            case 1:
                nomDiaMax = NOMBRE_DIA1;
                break;
            case 2:
                nomDiaMax = NOMBRE_DIA2;
                break;
            case 3:
                nomDiaMax = NOMBRE_DIA3;
                break;
            case 4:
                nomDiaMax = NOMBRE_DIA4;
                break;
            case 5:
                nomDiaMax = NOMBRE_DIA5;
                break;
            case 6:
                nomDiaMax = NOMBRE_DIA6;
                break;
            case 7:
                nomDiaMax = NOMBRE_DIA7;
                break;
        }
        //Calculo de la media
        mediaLluvia = acumulador / DIAS_MAX;
        //Mensaje de salida de la media
        System.out.printf("%nLa media semanal es ...: %3d l/m2 %n", mediaLluvia);
        //Mensaje de salidas de los dias menor y mayor lluvia
        System.out.printf("El %s fue el dia que mas llovio con: %03d "
                + "L/m^2 %n", nomDiaMin, lluviaMin);
        System.out.printf("El %s fue el dia que mas llovio con: %03d "
                + "L/m^2 %n", nomDiaMax, lluviaMax);
    }
}
