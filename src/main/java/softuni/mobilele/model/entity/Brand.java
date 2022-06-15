package softuni.mobilele.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "brands")
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column
    private LocalDateTime created;

    @Column
    private LocalDateTime modified;

    @OneToMany(mappedBy = "brand",
            targetEntity = Model.class,
            fetch = FetchType.EAGER,
            cascade = CascadeType.ALL)
    private List<Model> models;
}
