package i.novus.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CatDto {

    private Integer id;

    private String name;

    private Integer rating;

    private Boolean sign;

    private String path;


}
