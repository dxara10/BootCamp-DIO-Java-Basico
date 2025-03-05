package Basic.AnatomiaDasClasses;

public class MinhaPrimeiraClasse {
    public static void main(String[] args) {
        String nome = "João";
        String sobrenome = "Silva";
        String nomeCompleto = NomeCompleto(nome, sobrenome);

        System.out.println(nomeCompleto);
    }
    public static String NomeCompleto(String nome, String sobrenome) {
        return nome.concat(" ").concat(sobrenome);
    }
}
