public class TestaPontoFlutuante {
    public static void main(String[] args){
        double salario = 19246.77;
        System.out.println("Meu salario é R$" + salario);

        int divisaoInteira = 5 / 2;
        System.out.println("Para Java, inteiro com inteiro é inteiro: " + divisaoInteira);

        double outraDivisaoInteira = 5 / 2;
        System.out.println("Primeiro é feita a instrução da direita, ou seja, a divisao e depois é feita a atribuição");
        System.out.println("Resultado: " + outraDivisaoInteira);

        double divisao = 5.0 / 2;
        System.out.println("Para obter um float, é preciso que pelo menos um seja float: " + divisao);
    }
}
