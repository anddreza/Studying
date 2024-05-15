package aula9;

public class Pessoa {
    private String pessoa;
    private int idade;
    private String sexo;

    public void fazerAniver(){
        this.idade = this.idade + 1;
    }

    public Pessoa(String pessoa, int idade, String sexo) {
        this.pessoa = pessoa;
        this.idade = idade;
        this.sexo = sexo;
    }

    public String getPessoa() {
        return pessoa;
    }

    public void setPessoa(String pessoa) {
        this.pessoa = pessoa;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
