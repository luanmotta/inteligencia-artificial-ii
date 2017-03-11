//Exemplo - Rede Perceptron com apenas 1 neuronio

public class Perceptron {
    public static void treinamentoOr(Treinamento treinador) {
        int x1[] = new int[4]; // 1a entrada
        int x2[] = new int[4]; // 2a entrada
        int d[] = new int[4]; // saida desejada

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
        int x1[] = new int[4]; // 1a entrada
        int x2[] = new int[4]; // 2a entrada
        int d[] = new int[4]; // saida desejada

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
        int x1[] = new int[4]; // 1a entrada
        int x2[] = new int[4]; // 2a entrada
        int d[] = new int[4]; // saida desejada

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
    
    public static void main(String args[]) {
        Neuronio neuronio           = new Neuronio();
        Treinamento treinador       = new Treinamento(neuronio);
        Generalizacao generalizador = new Generalizacao();

        treinamentoXor(treinador);
        generalizador.generalizar(neuronio);
    }
}
