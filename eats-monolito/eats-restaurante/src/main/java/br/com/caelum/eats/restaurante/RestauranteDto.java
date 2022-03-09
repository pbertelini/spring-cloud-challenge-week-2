package br.com.caelum.eats.restaurante;

import java.math.BigDecimal;

import br.com.caelum.eats.administrativo.TipoDeCozinhaDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestauranteDto {

	private Long id;

	private String cnpj;

	private String nome;

	private String descricao;

	private String cep;

	private String endereco;

	private BigDecimal taxaDeEntregaEmReais;

	private Integer tempoDeEntregaMinimoEmMinutos;

	private Integer tempoDeEntregaMaximoEmMinutos;

	private Boolean aprovado;

	private TipoDeCozinhaDto tipoDeCozinha;

	public RestauranteDto(Restaurante restaurante) {
		this(restaurante.getId(), restaurante.getCnpj(), restaurante.getNome(), restaurante.getDescricao(), restaurante.getCep(), restaurante.getEndereco(),
				restaurante.getTaxaDeEntregaEmReais(), restaurante.getTempoDeEntregaMinimoEmMinutos(),
				restaurante.getTempoDeEntregaMaximoEmMinutos(), restaurante.getAprovado(),
				new TipoDeCozinhaDto(restaurante.getTipoDeCozinha()));
	}

  public RestauranteDto(Long id2, String cnpj2, String nome2, String descricao2, String cep2, String endereco2,
			BigDecimal taxaDeEntregaEmReais2, Integer tempoDeEntregaMinimoEmMinutos2,
			Integer tempoDeEntregaMaximoEmMinutos2, Boolean aprovado2, TipoDeCozinhaDto tipoDeCozinhaDto) {
		// TODO Auto-generated constructor stub
	}

public void populaRestaurante(Restaurante restaurante) {
    restaurante.setCnpj(cnpj);
    restaurante.setNome(nome);
    restaurante.setDescricao(descricao);
    restaurante.setCep(cep);
    restaurante.setEndereco(endereco);
    restaurante.setTaxaDeEntregaEmReais(taxaDeEntregaEmReais);
    restaurante.setTempoDeEntregaMinimoEmMinutos(tempoDeEntregaMinimoEmMinutos);
    restaurante.setTempoDeEntregaMaximoEmMinutos(tempoDeEntregaMaximoEmMinutos);
    restaurante.setTipoDeCozinha(tipoDeCozinha.toTipoDeCozinha());
  }

}
