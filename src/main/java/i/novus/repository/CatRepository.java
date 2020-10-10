package i.novus.repository;

import i.novus.entity.CatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CatRepository extends JpaRepository<CatEntity, Integer> {

    @Query(value = "SELECT * FROM cats c WHERE c.sign = false", nativeQuery = true)
    List<CatEntity> findAll();

    CatEntity getById(int catId);

    @Query(value = "SELECT rating FROM cats c WHERE c.id = :id", nativeQuery = true)
    Integer getRaiting(@Param("id") Integer id);

    @Query(value = "SELECT count(name) FROM cats c WHERE c.sign = false", nativeQuery = true)
    Integer getRows();

}
