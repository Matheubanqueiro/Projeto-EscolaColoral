import java.text.DecimalFormat;

public class Cadastro {

	private int numMatricula;
	private double notaA, notaB, notaC;
	private double notaFinal;
	private int frequencia;
	private String nome;
	private static int total = 0;
	final int mediaMinima = 6;
	final int frequenciaMinima = 50;
	
	
	public Cadastro(String nome, int numMatricula, double notaA, double notaB, double notaC, int frequencia) {
		super();
		
		total++;
		this.nome = nome;
		this.numMatricula = numMatricula;
		this.notaA = notaA;
		this.notaB = notaB;
		this.notaC = notaC;
		this.frequencia = frequencia;
		
	}
	
	public void imprimirInfos() {
		
		System.out.println("Nome do Aluno: " + getNome());
		System.out.println("O número da matrícula: " + getNumMatricula());
		calculoMedia(3);
		calculoFrequencia(180); //No mês a frequencia minima é de 50 aulas presentes
		verificarSituaçao();
	}
	
	public void calculoMedia(double pesoMedia) {
		
		DecimalFormat df = new DecimalFormat("0.0");
		
		this.notaFinal = (getNotaA() + getNotaB() + getNotaC()) / pesoMedia;

		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.println("A nota final de " + getNome() + " foi: " + df.format(getNotaFinal()));
		validarNotaFinal();
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		
		
	}
	
	public boolean validarNotaFinal() {
		 
		if (getNotaFinal() > mediaMinima) {
			
			System.out.println("********************");
			System.out.println("APROVADO(A) POR NOTA");
			System.out.println("********************");
			return true;
		} 
			
			System.out.println("---------------------");
			System.out.println("REPROVADO(A) POR NOTA");
			System.out.println("---------------------");
			return false;
		
	}
	
	public boolean calculoFrequencia(int quantDoSemestre) {
		
		
		if (getFrequencia() >= frequenciaMinima) {
			
			System.out.println("****************************");
			
			System.out.println("Total de presenças: " + getFrequencia());
			System.out.println("Total de faltas nesse semestre: " + (quantDoSemestre - getFrequencia()));
			System.out.println("APROVADO(A) POR FREQUÊNCIA!");
			System.out.println("****************************");
			return true;
		} 
			System.out.println("------------------------");
			System.out.println("Total de presenças: " + getFrequencia());
			System.out.println("Total de faltas nesse semestre: " + (quantDoSemestre - getFrequencia()));
			System.out.println("REPROVADO(A) POR FREQUÊNCIA!");
			System.out.println("------------------------");
			return false;
		
	}
	
	public void verificarSituaçao () {
		
		if (getNotaFinal() < mediaMinima && getFrequencia() >= frequenciaMinima) {
			
			System.out.println("DEVE PAGAR DP!");
			System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
			
		} else if (getNotaFinal() > mediaMinima && getFrequencia() < frequenciaMinima) {
		
		System.out.println("DEVE REALIZAR O ANO NOVAMENTE!");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*");
		
		}
	}
	
	
	public int getNumMatricula() {
		return numMatricula;
	}
	public void setNumMatricula(int numMatricula) {
		this.numMatricula = numMatricula;
	}
	public double getNotaA() {
		return notaA;
	}
	public void setNotaA(double notaA) {
		this.notaA = notaA;
	}
	public double getNotaB() {
		return notaB;
	}
	public void setNotaB(double notaB) {
		this.notaB = notaB;
	}
	public double getNotaC() {
		return notaC;
	}
	public void setNotaC(double notaC) {
		this.notaC = notaC;
	}
	public int getFrequencia() {
		return frequencia;
	}
	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getNotaFinal() {
		return notaFinal;
	}
	public void setNotaFinal(double notaFinal) {
		this.notaFinal = notaFinal;
	}
	public static int getTotal() {
		
		return Cadastro.total;
	}
}
