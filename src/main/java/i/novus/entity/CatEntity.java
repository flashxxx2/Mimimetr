package i.novus.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "cats")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Integer rating;

    private String path;

    private Boolean sign;


}
