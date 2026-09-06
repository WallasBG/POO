public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World");
	}
}
//Nome das classes deve comecar com letra maiuscula
//O public da classe obriga ao nome do arquivo ser HelloWorld.c
//So pode ter uma classe public em um codigo java, as outras (se houver) devem ser nao publicas
//PQ? Uma resposta pq tem que ser o nome do arquivo, dai como so pode existir um arquivo
//Isso facilita a conexao dos arquivos java em projetos. Usar uma classe (tipo) em outro projeto. MAS tem q ter o public.
//Aparentemente os projetos separam cada classe em um codigo diferente.

//O static eh pq para usar o metodo main, seria preciso criar um objeto do tipo HelloWorld. Mas o programa
//ainda nao comecou entao usamos static. 
//Um metodo static pertence à classe, nao a um objeto.

//println ln(line) imprime tbm um \n. print nao tem \n.
//tem tbm printf, como no c.

// Os argumentos da main do java, c. Servem para fazer um programa que passara os parametros
//da funcao no terminal, no momento em vc chama o programa.
//Ex: git commit -m "ggos", a string ggos eh um parametro, a msg do commit.

//Observe que System eh uma classe (Comeeca com letra maiuscula), dentro dessa classe temos o 
//atributo (var) out, eh do tipo(classe) PrintStream, e dentro dessa classe temos os prints.