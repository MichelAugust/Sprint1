package exercicio8;
public class Bonificacao{
private double salario;
private String nome;




public void bonificacao() {
	double valorBonificacao = 0;
	
	
		if(this.salario <= 1000) {
			valorBonificacao = (this.getSalario() * 0.2);
			System.out.println("\nBonus: " + valorBonificacao);
			
		}else if (this.salario > 1000 && this.salario <= 2000) {
			valorBonificacao = (this.getSalario() * 0.1);
			System.out.println("\nBonus: " + valorBonificacao);
			
		}else if(this.salario >= 2000) {
			valorBonificacao = (this.salario * (- 0.1));
			System.out.println("\nDesconto: " + valorBonificacao);
		}
		System.out.printf("Salario liquido: "+(this.salario + valorBonificacao));
		System.out.println(" ");
		
}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;		
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
		
		
		}
	
	
		
	}




