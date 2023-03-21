public class TestaConversao {
    public static void main(String[] args){
        double salario = 19246.77;
        int valor_inteiro = (int) salario;

        System.out.println(salario);
        System.out.println(valor_inteiro);

        float pi = 3.14f;
        System.out.println("Valor de pi: " + pi);
        // 3.14 é um double e por isso foi preciso adicionar o f no fim. Ou float pi = (float) 3.14.
    }
}
