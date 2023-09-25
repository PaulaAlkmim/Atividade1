package model;

import lombok.Data;

public class Aluno {
	
	private int CPF;
	private String nome;
	private String nome_social;
	private Data data_nasc;
	private int telefone1;
	private int telefone2;
	private String email_p;
	private String email_c;
	private Data dt_conclusao_segundo;
	private String intituicao_conclusao;
	private double pontuacao;
	private int posicao_vestibular;
	private int ano_ingresso;
	private int semestre_ingresso;
	private int semestre_limite;
	private int ano_limite;
	private int RA;
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome_social() {
		return nome_social;
	}
	public void setNome_social(String nome_social) {
		this.nome_social = nome_social;
	}
	public Data getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Data data_nasc) {
		this.data_nasc = data_nasc;
	}
	public int getTelefone1() {
		return telefone1;
	}
	public void setTelefone1(int telefone1) {
		this.telefone1 = telefone1;
	}
	public int getTelefone2() {
		return telefone2;
	}
	public void setTelefone2(int telefone2) {
		this.telefone2 = telefone2;
	}
	public String getEmail_p() {
		return email_p;
	}
	public void setEmail_p(String email_p) {
		this.email_p = email_p;
	}
	public String getEmail_c() {
		return email_c;
	}
	public void setEmail_c(String email_c) {
		this.email_c = email_c;
	}
	public Data getDt_conclusao_segundo() {
		return dt_conclusao_segundo;
	}
	public void setDt_conclusao_segundo(Data dt_conclusao_segundo) {
		this.dt_conclusao_segundo = dt_conclusao_segundo;
	}
	public String getIntituicao_conclusao() {
		return intituicao_conclusao;
	}
	public void setIntituicao_conclusao(String intituicao_conclusao) {
		this.intituicao_conclusao = intituicao_conclusao;
	}
	public double getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}
	public int getPosicao_vestibular() {
		return posicao_vestibular;
	}
	public void setPosicao_vestibular(int posicao_vestibular) {
		this.posicao_vestibular = posicao_vestibular;
	}
	public int getAno_ingresso() {
		return ano_ingresso;
	}
	public void setAno_ingresso(int ano_ingresso) {
		this.ano_ingresso = ano_ingresso;
	}
	public int getSemestre_ingresso() {
		return semestre_ingresso;
	}
	public void setSemestre_ingresso(int semestre_ingresso) {
		this.semestre_ingresso = semestre_ingresso;
	}
	public int getSemestre_limite() {
		return semestre_limite;
	}
	public void setSemestre_limite(int semestre_limite) {
		this.semestre_limite = semestre_limite;
	}
	public int getAno_limite() {
		return ano_limite;
	}
	public void setAno_limite(int ano_limite) {
		this.ano_limite = ano_limite;
	}
	public int getRA() {
		return RA;
	}
	public void setRA(int rA) {
		RA = rA;
	}
	
	
	
	
	
	
	
	
	

}
