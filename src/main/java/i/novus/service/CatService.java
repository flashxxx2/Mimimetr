package i.novus.service;

import i.novus.dto.CatDto;
import i.novus.entity.CatEntity;
import i.novus.mapper.CatMapper;
import i.novus.repository.CatRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class CatService {

    private final CatRepository repository;
    private CatDto catDto = new CatDto();


    public CatService(CatRepository repository) {
        this.repository = repository;
    }

    public List<CatEntity> getAll() {
        return repository.findAll();
    }

    public List<CatEntity> getTwoCat() {
        List<CatEntity> catEntityList = repository.findAll();
        CatEntity catEntity = catEntityList.get(random());
        CatEntity catEntityTwo = catEntityList.get(random());
        catEntityList.clear();
        catEntityList.add(catEntity);
        catEntityList.add(catEntityTwo);

        return catEntityList;

    }

    public Integer random() {
        Integer[] arr = new Integer[10];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
        }
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

        return (int) (Math.random() * getCount()) + 1;

    }

    private Integer getCount() {
        return repository.getRows();
    }

    public CatEntity addPoint(Integer id) {
        CatEntity catEntity = repository.getById(id);
        catEntity.setRating(repository.getRaiting(id)+1);
        catEntity.setSign(true);
        repository.save(catEntity);
        return catEntity;
    }

}
