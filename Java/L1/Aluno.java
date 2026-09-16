public class Aluno{
	float n1, n2;
	String nome;

	public Aluno(String nome, float n1, float n2){
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
	}

	public float media(){
		return (n1+n2)/2.0f;
	}

	public void mostrar(){
		System.out.println("Aluno " + nome + " tem media: " + media());
	}
}