package cl.ucn.disc.pa.empty;

import edu.princeton.cs.stdlib.StdDraw;
import edu.princeton.cs.stdlib.StdOut;

import java.awt.*;

/**
 *Este programa crea un protector de pantalla que es una version
 * simplificada del protector de pantalla "mistify"
 *
 *@author Alejandro torres
 *@version 1.0
 * @since 08-04-2023
 */

public class Main {

    public static void main(String[] args) {

        // Rango de dibujo
        double min = -1.0;
        double max = 1.0;

        // Rango de velocidad
        double minv = 0.125;
        double maxv = 0.25;


        // Definicion de escala del lienzo del dibujo
        StdDraw.setXscale(min,max);
        StdDraw.setYscale(min,max);
        // Evitar el parpadeo de la pantalla
        StdDraw.enableDoubleBuffering();
        // Dando valor randomizado al par ordenado

        double x0 = min + (max - min) * Math.random();
        double y0 = min + (max - min) * Math.random();

        // Velocidad inicial
        double vx = minv + (maxv - minv) * Math.random();
        double vy = minv + (maxv - minv) * Math.random();

        // Ciclo infinito
        while (true) {
            // Colision
            if (Math.abs(x0 + vx) > 1.0 ) {
                vx = -vx;
            }
            if (Math.abs(y0+ vy) > 1.0 ) {
                vy = -vy;
            }
            // Actualizacion de posicion
            x0 += vx;
            y0 += vy;

            // linea 2
            double x1 = x0 - 0.02;
            double y1 = y0 - 0.02;
            double vx1 = vx - 0.02;
            double vy1 = vy - 0.02;
            // linea 3
            double x2 = x0 - 0.04;
            double y2 = y0 - 0.04;
            double vx2 = vx - 0.04;
            double vy2 = vy - 0.04;
            // linea 4
            double x3 = x0 + 0.02;
            double y3 = y0 + 0.02;
            double vx3 = vx + 0.02;
            double vy3 = vy + 0.02;
            // linea 5
            double x4 = x0 + 0.04;
            double y4 = y0 + 0.04;
            double vx4 = vx + 0.04;
            double vy4 = vy + 0.04;
            // linea 6
            double x5 = x0 - 0.06;
            double y5 = y0 - 0.06;
            double vx5 = vx - 0.06;
            double vy5 = vy - 0.06;




            // Limpiar el fondo
            StdDraw.clear();


            // Dibujar lineas
            StdDraw.setPenColor(Color.BLACK);
            StdDraw.filledSquare(0,0,1);
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.line(x0,y0,vx,vy);
            StdDraw.setPenColor(StdDraw.RED);
            StdDraw.line(x1,y1,vx1,vy1);
            StdDraw.setPenColor(StdDraw.YELLOW);
            StdDraw.line(x2,y2,vx2,vy2);
            StdDraw.setPenColor(StdDraw.GREEN);
            StdDraw.line(x3,y3,vx3,vy3);
            StdDraw.setPenColor(StdDraw.ORANGE);
            StdDraw.line(x4,y4,vx4,vy4);
            StdDraw.setPenColor(StdDraw.PINK);
            StdDraw.line(x5,y5,vx5,vy5);
            // Cambiando el color de las lineas
            if (Math.abs(x0 + vx) > 1.0 ){
                StdDraw.setPenColor(Color.GRAY);
                StdDraw.filledCircle(0.5,-0.5,0.25);
            }
            if (Math.abs(y0+ vy) > 1.0 ) {
                StdDraw.setPenColor(StdDraw.DARK_GRAY);
                StdDraw.filledCircle(-0.5,0.5,0.25);
            }





            // Mostrar pantalla y esperar
            StdDraw.show();
            StdDraw.pause(100);


        }



    }

}
