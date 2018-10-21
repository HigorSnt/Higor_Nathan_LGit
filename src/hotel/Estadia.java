package hotel;

public class Estadia {
	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nome, int idade, String tipo, int valor, int dias) {
		this.animal = new Animal(nome, tipo, idade);
		this.valor = valor;
		this.dias = dias;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	public int getDias() {
		return this.dias;
	}
	public double getValor() {
		return this.valor;
	}
	public String getNome() {
		return this.animal.getNome();
	}
	public String getTipo() {
		return this.animal.getTipo();
	}
	public int getIdade() {
		return this.animal.getIdade();
	}
	
	public String toString() {
		return this.animal.getNome() + ", " + this.animal.getTipo() + ", " + this.dias + " dias com o preço de R$ "
				+ this.valor + System.lineSeparator();			
	}
	
	
}
