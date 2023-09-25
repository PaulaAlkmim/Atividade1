package model;

public class Curso {
	
	private int codigo;
	private String nome;
	private int carga_horaria;
	private String sigla;
	private int ultima_nota;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCarga_horaria() {
		return carga_horaria;
	}
	public void setCarga_horaria(int carga_horaria) {
		this.carga_horaria = carga_horaria;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public int getUltima_nota() {
		return ultima_nota;
	}
	public void setUltima_nota(int ultima_nota) {
		this.ultima_nota = ultima_nota;
	}

}
