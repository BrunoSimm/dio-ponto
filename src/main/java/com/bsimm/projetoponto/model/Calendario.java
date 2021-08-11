package com.bsimm.projetoponto.model;

import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class Calendario {

    @Id
    private Long id;

    @OneToOne
    private TipoData tipoData;

    private String descricao;
    private LocalDateTime dataEspecial;
}
