package Carro_Moto_Pessoa;
public class Carro {
	private String fabricante;
	private String modelo;
	private String cor;
	private int ano;
	protected Pessoa dono;
	protected Motor motor;
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public Pessoa getDono() {
		return dono;
	}
	public void setDono(Pessoa dono) {
		this.dono = dono;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor string) {
		this.motor = string;
	}
	@Override
	public String toString() {
		return "Carro [fabricante=" + fabricante + ", modelo=" + modelo + ", cor=" + cor + ", ano=" + ano
				+ ", toString()=" + super.toString() + "]";
	}
}
