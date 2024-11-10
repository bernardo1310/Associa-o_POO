package Carro_Moto_Pessoa;
public class CarroMain {
    public static void main(String[] args) {
        Carro car = new Carro();
        Motor mt = new Motor();
        Pessoa ps = new Pessoa();

        ps.setNome("Bernardo");
        ps.setEndereco("Rua Exemplo, 123");

        mt.setMarca("Chevrolet");
        mt.setPotencia(3.5f);
        mt.setCilindros(8);
        mt.setCombustivel("Gasolina");

        car.setAno(2000);
        car.setCor("Azul escuro");
        car.setFabricante("Chevrolet");
        car.setModelo("Astra");
        car.setDono(ps);   
        car.setMotor(mt);  

        System.out.println(car.toString());
    }
}