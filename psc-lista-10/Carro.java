
public class Carro {
    public String modelo;
    public String montadora;    
    public int ano;
    private String placa;

    public Carro(String modelo , String montadora , int ano , String placa){
        this.modelo = modelo;
        this.montadora = montadora;
        this.ano = ano;
        this.placa = placa;
    }

    public void andar(){
        System.out.println(modelo + " esta andando.");
    }

    public void acelerar(){
        System.out.println(modelo + " está acelerando muito.");
    }

    public void freiar(){
        System.out.println(modelo + " teve que freiar para diminuir a velocidade.");
    }

    public void buzinar(){
        System.out.println(modelo + " buzinou para chamar atenção.");
    }

    public String getPlaca(){
        return placa;
    }

}
