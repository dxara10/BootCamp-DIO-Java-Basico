package Basic.AnatomiaDasClasses;

public class BoletimEstudantil {

    public static void main(String[] args) {
        BoletimEstudantil boletim = new BoletimEstudantil("João", 8.0, 7.0, 6.0, 10.0);
        System.out.println("Nome: " + boletim.getNome());
        System.out.println("Nota 1: " + boletim.getNota1());
        System.out.println("Nota 2: " + boletim.getNota2());
        System.out.println("Nota 3: " + boletim.getNota3());
        System.out.println("Nota 4: " + boletim.getNota4());
        System.out.println("Média: " + boletim.calcularMedia());

        if (boletim.calcularMedia() >= 6) {
            System.out.println("Aprovado");
        } else if(boletim.calcularMedia() >= 4){
            System.out.println("Recuperação");
        } else{
            System.out.println("Reprovado");
        }
    }

    private String nome;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public BoletimEstudantil(String nome, double nota1, double nota2, double nota3, double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }

    public double calcularMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public String getNome() {
        return nome;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public double getNota4() {
        return nota4;
    }       
}
