
import static java.lang.Math.abs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 114928710
 */
public class Treinamento {
    private Neuronio neuronio;
    
    public Treinamento(Neuronio n) {
        this.neuronio = n;
    }
    public void treinar(double x1[], double x2[], double d[]) {
        // Treinamento
        int epocas = 0, i;
        double y, erro, erroGeral;
        double eta = 1d; 
        // eta e a constante (taxa) de aprendizagem

        System.out.println("--- TREINAMENTO");
        while (true) {
            epocas++;
            erroGeral = 0;

            System.out.println("Epoca: " + epocas);
            for (i = 0; i < x1.length; i++) {

                // propagacao
                y = neuronio.calculaY(x1[i], x2[i]);

                // calcula do erro
                erro = d[i] - y;

                // ajuste dos pesos
                if (erro != 0) {
                    neuronio.setW0(neuronio.getW0() + eta * erro);
                    neuronio.setW1(neuronio.getW1() + eta * erro * x1[i]);
                    neuronio.setW2(neuronio.getW2() + eta * erro * x2[i]);
                }
                System.out.println("Neuronio - pesos: " + neuronio);
                erroGeral = erroGeral + abs(erro);
            }

            // para quando para todas as entradas o erro for zero
            if (erroGeral == 0)
                break;
        }
    }
}
