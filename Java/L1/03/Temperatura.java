public class Temperatura{
	private double temperatura;

	public Temperatura(double temperatura){
		this.temperatura = temperatura;
	}
	public void celsiusToFahrenheit(){
		temperatura = temperatura*9.0 /5.0 +32;
		//ver se precisa do this, o atributo é privado
		//(edit) funciona, o pq? nao sei
		//sera pq nesse tenho um construtor?
		//e no outro nao tinha, daí tinha q "construir" na hora?
	}
	public void fahrenheiToCelsius(){
		temperatura = ((temperatura -32)*5.0/9.0);
	}
	public String toString(){
		return Double.toString(temperatura);
		//ver pq o valueof tbm funciona
	}
}