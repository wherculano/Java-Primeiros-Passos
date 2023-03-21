public class TestaCaracteres {
    public static void main(String[] args){
        char umaLetra = 'a';
        System.out.println(umaLetra);

        char letraPorNumero = 65;
        System.out.println(letraPorNumero);

        String frase = "Java é muito facil de aprender!";
        System.out.println(frase);

        char conversaoLouca = (char) (umaLetra + 2);  // int + int = int, fazendo o casting, será um char letra e nao char int
        System.out.println(conversaoLouca);

        System.out.println(frase + 2); // Ja Strings podem ser concatenadas com numeros sem dar erro.
    }
}
