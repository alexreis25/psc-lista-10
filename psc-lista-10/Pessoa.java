
public class Pessoa {
    public String nome;
    public String sexo;
    public int idade;
    private String numeroTelefone;

    public Pessoa(String nome, String sexo , int idade , String numeroTelefone){
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.numeroTelefone = numeroTelefone;
    }

    public void andar(){
        System.out.println(nome + " esta andando na calçada.");
    }

    public void falar(){
        System.out.println(nome + " está falando muito alto.");
    }

    public void comer(){
        System.out.println(nome + " está comendo agora.");
    }

    public void dormir(){
        System.out.println(nome + " foi dormir.");
    }

    public String getnumeroTelefone(){
        return numeroTelefone;
    }
}
