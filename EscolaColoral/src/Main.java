
public class Main {
	
	public static void main(String[] args) {
		
		
		Cadastro aluno1 = new Cadastro("Matheus",1111,7,7,9,40);
		Cadastro aluno2 = new Cadastro("Lucas",222,9,7,9,40);
		aluno1.imprimirInfos();
		
		aluno2.imprimirInfos();
		
		System.out.println("Total de alunos cadastrados: " + Cadastro.getTotal());

		
		
		
	
		
	}
}
