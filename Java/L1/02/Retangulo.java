public class Retangulo{
	private int comprimento = 1, largura = 1;

	public int perimetro(){
		return 2*largura + 2*comprimento;
	}

	public int area(){
		return comprimento * largura;
	}

	public int getComprimento(){
		return comprimento;
	}

	public int getLargura(){
		return largura;
	}

	public void setComprimento(int comprimento){
		if(comprimento > 0 && comprimento < 20) this.comprimento = comprimento; //set modificar atributo privado, usamos this.~~
	}

	public void setLargura(int largura){
		if(largura > 0 && largura < 20) this.largura = largura;
	}
}