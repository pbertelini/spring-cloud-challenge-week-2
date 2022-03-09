package br.com.caelum.eats.pagamento;

import java.math.BigDecimal;
import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class PagamentoDto {

	private Long id;
	private BigDecimal valor;
	private String nome;
	private String numero;
	private String expiracao;
	private String codigo;
	private Pagamento.Status status;
	private Long formaDePagamentoId;
	private Long pedidoId;

	PagamentoDto(Pagamento p) {
		this(p.getId(), p.getValor(), p.getNome(), p.getNumero(), p.getExpiracao(), p.getCodigo(), p.getStatus(), p.getFormaDePagamentoId(), p.getPedidoId());
	}

	public PagamentoDto(Map<String, ?> id2, Object valor2, Object nome2, Object numero2, Object expiracao2,
			Object codigo2, Object status2, Object formaDePagamentoId2, Long pedidoId2) {
		// TODO Auto-generated constructor stub
	}

}
