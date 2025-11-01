public class App{
public static void main(String[] args) {
    Moto fan160 = new Moto("cg fan 160" , "Honda" , 2023 , "RVZ9A05");  
    Moto fz25Fazer250 = new Moto("fz25Fazer250" , "Yamaha" , 2025 , "TEX9J35" );

    fan160.acelerar();
    fz25Fazer250.buzinar();

    Carro newKa = new Carro("New ka", "Ford" , 2014 , "PVK7D74");
    Carro gol = new Carro("Gol g5", "Volkswagen" , 2011 , "HOJ4592");

    gol.andar();
    newKa.freiar();

    Cachorro barao = new Cachorro("Barão", "vira-lata", 16, 142452);
    Cachorro simba = new Cachorro("Simba", "york shire", 5, 231423);

    barao.dormir();
    simba.latir();

    Pessoa alexVitor = new Pessoa("Alex Vitor" , "Masculino" , 22 , "31982128531");
    Pessoa mariaRita = new Pessoa("Maria Rita" , "Femenino" , 22 , "35991164101");
    Pessoa rosimarReis = new Pessoa("Rosimar Reis" , "Feminino", 41 , "31982161172");
    Pessoa mariaHeloisa = new Pessoa("Maria Heloisa" , "Femenino" , 8 , "319981004627");

    rosimarReis.falar();
    mariaRita.comer();
    alexVitor.andar();
    mariaHeloisa.dormir();

    String telefoneDoAlex = alexVitor.getnumeroTelefone();
    System.out.println("O numero de telefone do Alex: " + telefoneDoAlex);



}
}