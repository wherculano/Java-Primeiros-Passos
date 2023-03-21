public class TestaCondicional {
    public static void main(String[] args) {
        int idade = 20;
        int quantidadeDePessoas = 3;

        if(idade >= 18){
            System.out.println("Voce tem mais de 18 anos!\nSeja bem vind!!o");
        }
        else{
            if (quantidadeDePessoas >= 2) {
                System.out.println("Você é meor de idade, mas acompanhado de um adulto você pode entrar!");
            }
            else{
                System.out.println("Que pena! Você não pode entrar");
            }
        }
    }
}
