package com.target.addressservice.domain;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(schema = "samaia", name = "address")
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id", columnDefinition = "BIGINT")
    private Long id;

    @Column(name = "cep", columnDefinition = "BIGINT")
    private Long cep;

    @Column(name = "logradouro", columnDefinition = "VARCHAR", length = 60)
    private String logradouro;

    @Column(name = "bairro", columnDefinition = "VARCHAR", length = 30)
    private String bairro;

    @Column(name = "cidade", columnDefinition = "VARCHAR", length = 30)
    private String cidade;

    @Enumerated(EnumType.STRING)
    @Column(name = "uf", columnDefinition = "VARCHAR", length = 2)
    private UnidadeFederativaEnum uf;
}
