package br.com.caelum.eats.distancia;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
class RestauranteComDistanciaDto {

	public RestauranteComDistanciaDto(Long restauranteId2, BigDecimal distancia2) {
		// TODO Auto-generated constructor stub
	}

	private Long restauranteId;

	private BigDecimal distancia;

}
