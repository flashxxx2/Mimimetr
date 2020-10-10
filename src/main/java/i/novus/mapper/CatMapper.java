package i.novus.mapper;

import i.novus.dto.CatDto;
import i.novus.entity.CatEntity;

public class CatMapper {

    public static CatEntity dtoToEntity(CatDto catDto) {

        CatEntity catEntity = new CatEntity();
        catEntity.setName(catDto.getName());
        catEntity.setRating(catDto.getRating());
        catEntity.setSign(catDto.getSign());
        catEntity.setPath(catDto.getPath());

        return catEntity;
    }


}
