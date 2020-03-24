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
    @Column(name = "id", columnDefinition = "BIGINT", nullable = false, updatable = false)
    private Long id;

    @Column(name = "zip_code", columnDefinition = "BIGINT", nullable = false)
    private Long zipCode;

    @Column(name = "public_area", columnDefinition = "VARCHAR", length = 60, nullable = false)
    private String publicArea;

    @Column(name = "neighborhood", columnDefinition = "VARCHAR", length = 30, nullable = false)
    private String neighborhood;

    @Column(name = "city", columnDefinition = "VARCHAR", length = 30, nullable = false)
    private String city;

    @Enumerated(EnumType.STRING)
    @Column(name = "federative_unit", columnDefinition = "VARCHAR", length = 2, nullable = false)
    private UnidadeFederativaEnum federativeUnit;
}
