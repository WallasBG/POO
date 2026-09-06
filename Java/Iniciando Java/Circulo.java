public class Circulo{
	public float raio;
	Ponto centro; 

	// public void put_raio(float r){
	// 	raio = r;
	// }
	// public void imprime_raio(){
	// 	System.out.printf("O raio eh: %2.f\n", raio);
	// }

	public void imprime_ponto(){
		System.out.println("(" + centro.x + "," + centro.y + ")");
	}

	public void imprime_cord(){
		System.out.println("(" + centro.x + "," + centro.y + "," + raio + ")");
	}
}