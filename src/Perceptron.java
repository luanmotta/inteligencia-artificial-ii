//Exemplo - Rede Perceptron com apenas 1 neuronio

public class Perceptron {
    public static void treinamentoOr(Treinamento treinador) {
        double x1[] = new double[4]; // 1a entrada
        double x2[] = new double[4]; // 2a entrada
        double d[] = new double[4]; // saida desejada

        // Conjunto de Treino : OR
        x1[0] = 0;
        x2[0] = 0;
        d[0] = 0;

        x1[1] = 0;
        x2[1] = 1;
        d[1] = 1;

        x1[2] = 1;
        x2[2] = 0;
        d[2] = 1;

        x1[3] = 1;
        x2[3] = 1;
        d[3] = 1;

        treinador.treinar(x1, x2, d);
    }
    
    public static void treinamentoAnd(Treinamento treinador) {
        double x1[] = new double[4]; // 1a entrada
        double x2[] = new double[4]; // 2a entrada
        double d[] = new double[4]; // saida desejada

        // Conjunto de Treino : OR
        x1[0] = 0;
        x2[0] = 0;
        d[0] = 0;

        x1[1] = 0;
        x2[1] = 1;
        d[1] = 0;

        x1[2] = 1;
        x2[2] = 0;
        d[2] = 0;

        x1[3] = 1;
        x2[3] = 1;
        d[3] = 1;

        treinador.treinar(x1, x2, d);
    }
    
    public static void treinamentoXor(Treinamento treinador) {
        double x1[] = new double[4]; // 1a entrada
        double x2[] = new double[4]; // 2a entrada
        double d[] = new double[4]; // saida desejada

        // Conjunto de Treino : OR
        x1[0] = 0;
        x2[0] = 0;
        d[0] = 0;

        x1[1] = 0;
        x2[1] = 1;
        d[1] = 1;

        x1[2] = 1;
        x2[2] = 0;
        d[2] = 1;

        x1[3] = 1;
        x2[3] = 1;
        d[3] = 0;

        treinador.treinar(x1, x2, d);
    }
    
    public static void treinamentoPagador(Treinamento treinador) {
        double x1[] = new double[14]; // 1a entrada
        double x2[] = new double[14]; // 2a entrada
        double d[] = new double[14]; // saida desejada
        
        double maiorRenda = 2800;
        double maiorDivida = 800;

        // Conjunto de Treino : Pagador
        x1[0] = 2800 / maiorRenda;
        x2[0] = 550 / maiorDivida;
        d[0] = 1;

        x1[1] = 1300 / maiorRenda;
        x2[1] = 500 / maiorDivida;
        d[1] = 0;
        
        x1[2] = 1400 / maiorRenda;
        x2[2] = 80 / maiorDivida;
        d[2] = 1;

        x1[3] = 500 / maiorRenda;
        x2[3] = 200 / maiorDivida;
        d[3] = 0;
        
        x1[4] = 1100 / maiorRenda;
        x2[4] = 270 / maiorDivida;
        d[4] = 0;
        
        x1[5] = 1800 / maiorRenda;
        x2[5] = 450 / maiorDivida;
        d[5] = 1;

        x1[6] = 2400 / maiorRenda;
        x2[6] = 650 / maiorDivida;
        d[6] = 1;

        x1[7] = 1950 / maiorRenda;
        x2[7] = 600 / maiorDivida;
        d[7] = 1;
        
        x1[8] = 450 / maiorRenda;
        x2[8] = 70 / maiorDivida;
        d[8] = 0;
        
        x1[9] = 2750 / maiorRenda;
        x2[9] = 730 / maiorDivida;
        d[9] = 1;

        x1[10] = 850 / maiorRenda;
        x2[10] = 90 / maiorDivida;
        d[10] = 0;

        x1[11] = 1300 / maiorRenda;
        x2[11] = 200 / maiorDivida;
        d[11] = 0;

        x1[12] = 2100 / maiorRenda;
        x2[12] = 750 / maiorDivida;
        d[12] = 1;

        x1[13] = 900 / maiorRenda;
        x2[13] = 300 / maiorDivida;
        d[13] = 0;

        /*treinamento
        1 2800 550 bom
        2 1300 500 mau
        3 1400 80 bom
        4 500 200 mau
        5 1100 270 mau
        6 1800 450 bom
        7 2400 650 bom
        8 1950 600 bom
        9 450 70 mau
        0 2750 730 bom
        1 850 90 mau
        2 1300 200 mau
        3 2100 750 bom
        4 900 300 mau
        
        generalizacao
        5 2700 250 bom 0,9642857142857143 0,3125
        6 1600 500 mau 0,5714285714285714 0,625
        7 1900 150 bom 0,6785714285714286 0,1875
        8 2500 800 bom 0,8928571428571429 1
        9 1600 700 mau 0,5714285714285714 0,875
        0 2300 500 bom 0,8214285714285714 0,625
        1 2100 250 bom 0,75 0,3125
        */

        treinador.treinar(x1, x2, d);
    }
    
    public static void treinamentoPagadorBom(Treinamento treinador) {
        double x1[] = new double[14]; // 1a entrada
        double x2[] = new double[14]; // 2a entrada
        double d[] = new double[14]; // saida desejada
        
        double maiorRenda = 2800;
        double maiorDivida = 800;

        // Conjunto de Treino : Pagador
        x1[0] = 2800 / maiorRenda;
        x2[0] = 550 / maiorDivida;
        d[0] = 1;
        
        x1[1] = 1400 / maiorRenda;
        x2[1] = 80 / maiorDivida;
        d[1] = 1;
        
        x1[2] = 1800 / maiorRenda;
        x2[2] = 450 / maiorDivida;
        d[2] = 1;

        x1[3] = 2400 / maiorRenda;
        x2[3] = 650 / maiorDivida;
        d[3] = 1;

        x1[4] = 1950 / maiorRenda;
        x2[4] = 600 / maiorDivida;
        d[4] = 1;
        
        x1[5] = 2750 / maiorRenda;
        x2[5] = 730 / maiorDivida;
        d[5] = 1;

        x1[6] = 2100 / maiorRenda;
        x2[6] = 750 / maiorDivida;
        d[6] = 1;

        treinador.treinar(x1, x2, d);
    }
    
    public static void treinamentoLetras(Treinamento treinador) {
        double x1[] = new double[4]; // 1a entrada
        double x2[] = new double[4]; // 2a entrada
        double d[] = new double[4]; // saida desejada

        // Conjunto de Treino : OR
        x1[0] = 0;
        x2[0] = 0;
        d[0] = 0;

        x1[1] = 0;
        x2[1] = 1;
        d[1] = 0;

        x1[2] = 1;
        x2[2] = 0;
        d[2] = 0;

        x1[3] = 1;
        x2[3] = 1;
        d[3] = 1;

        treinador.treinar(x1, x2, d);
    }
    
    public static void main(String args[]) {
        Neuronio neuronio1           = new Neuronio();
        Neuronio neuronio2           = new Neuronio();
        Treinamento treinador       = new Treinamento(neuronio1);
        Generalizacao generalizador = new Generalizacao();

        treinamentoPagadorBom(treinador);
        generalizador.generalizar(neuronio1);
    }
}
