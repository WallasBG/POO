public class Principal{
	public static void main(String[] args){
		Circulo obj_cirA = new Circulo();//Tem outra maneira de declara, alocar ja inicializando. Usa construtores
		obj_cirA.centro = new Ponto();
		//obj_cirA.centro.x = 0; obj_cirA.centro.y = 0;
		System.out.println("(" + obj_cirA.centro.x + "," + obj_cirA.centro.y + "," + obj_cirA.raio + ")");
		obj_cirA.centro.x += 2.3;
		obj_cirA.centro.x *= 0.5;
		System.out.println("(" + obj_cirA.centro.x + "," + obj_cirA.centro.y + "," + obj_cirA.raio + ")");

		obj_cirA.centro.x = 1; obj_cirA.centro.y = 1;
		obj_cirA.imprime_cord();
		obj_cirA.imprime_ponto();
	}
}

//Parei pagina 18. Garbage collector. Thau memory leaky