
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 114928710
 */
public class Generalizacao {
    private Scanner dados;

	public void generalizar(Neuronio neuronio) {
        // Generalizacao - Teste da rede
        double entrada1, entrada2;
        dados = new Scanner(System.in);
        System.out.println("\n--- GENERALIZACAO");

        while (true) {
            // digita novas entradas
            System.out.println("Digite -100 para encerrar");
            System.out.print("Digite a entrada (x1): ");
            entrada1 = dados.nextDouble();
            if (entrada1 == -100)
                break;

            System.out.print("Digite a entrada (x2): ");
            entrada2 = dados.nextDouble();
            if (entrada2 == -100)
                break;

            // propagacao
            System.out.println("Saida Gerada pela rede: "
                + neuronio.calculaY(entrada1, entrada2));
        }
    }
}
