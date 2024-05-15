package aula10;

public class ProjetoPessoas {
    public static void main(String[] args) {
         Pessoa p1 = new Pessoa();
         Aluno p2 = new Aluno();
         Professor p3 = new Professor();
         Funcionario p4 = new Funcionario();

         p1.setNome("Pedro");
         p2.setNome("Maria");
         p3.setNome("Claudio");
         p4.setNome("Fabiana");

        p1.setSexo("M");
        p2.setSexo("F");
        p2.setIdade(18);

        p2.setCurso("Informatica");
        p3.setSalario(25000f);
        p4.setSetor("Estoque");

        p3.receberAumento(500.20f);

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
