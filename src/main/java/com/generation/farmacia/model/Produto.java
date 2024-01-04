package com.generation.farmacia.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

@Entity 
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long id;
	
	@NotBlank(message = "O nome do Produto é obrigatorio e não pode ser nulo!")
	@Size(min = 2, max = 100, message = "O nome deve conter no mínimo 02 e no máximo 100 caracteres")
	@Column(length = 100)
	private String nome;
	
	@NotBlank(message = "A descrição é obrigatoria e não pode ser nula!")
	@Size(min = 5, max = 10000, message = "A descrição deve conter no mínimo 05 e no máximo 1000 caracteres")
	@Column(length = 10000)
	private String bulario;
	
	@NotNull(message = "A quantidade dos produtos não pode ser nula!")
	@Positive(message = "A quantidade deve ser maior que zero!")
	private int quantidade;
	
	@NotNull(message = "A indicação dos produtos não pode ser nula!")
	@Positive(message = "A indicação deve ser maior que zero!")
	private int indicacao;
	
	@NotNull(message = "Informe o Preço do Produto!")
	@Positive(message = "O preço do Produto deve ser maior que zero!")
	private float preco;
	
	@NotBlank(message = "Insira uma foto para validação do seu produto")
	private String foto;
	
	
	
	@ManyToOne
	@JsonIgnoreProperties("prosuto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getBulario() {
		return bulario;
	}

	public void setBulario(String bulario) {
		this.bulario = bulario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	
	public int getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(int indicacao) {
		this.indicacao = indicacao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
