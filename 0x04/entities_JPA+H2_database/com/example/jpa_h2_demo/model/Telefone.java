package com.example.jpa_h2_demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Telefone {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String ddd;
	private String numero;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
}
