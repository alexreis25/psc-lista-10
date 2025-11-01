
public class Cachorro {
    public String nome;
    public String raca;
    public int idade;
    private int id;

    public Cachorro(String nome, String raca , int idade , int id){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
        this.id = id;
    }

    public void andar(){
        System.out.println(nome + " esta andando na rua.");
    }

    public void latir(){
        System.out.println(nome + " está latindo muito alto.");
    }

    public void comer(){
        System.out.println(nome + " está comendo agora.");
    }

    public void dormir(){
        System.out.println(nome + " foi dormir.");
    }

    public int getid(){
        return id;
    }
}
