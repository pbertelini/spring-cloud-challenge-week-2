package br.com.caelum.eats.administrativo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDeCozinha {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank @Size(min=3, max=100)
	private String nome;

	public TipoDeCozinha(Long id2, String nome2) {
		// TODO Auto-generated constructor stub
	}

	public TipoDeCozinha getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getNome() {
		// TODO Auto-generated method stub
		return null;
	}

}
