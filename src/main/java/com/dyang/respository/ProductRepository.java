package com.dyang.respository;

import com.dyang.model.ProductVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by DYang on 2018/9/12
 */
@Repository
public interface ProductRepository extends JpaRepository<ProductVO,String> {

    @Query("from ProductVO where kind = :kind")
    public List<ProductVO> getPorducts(@Param("kind") String kind);

    @Query(value = "select new ProductVO(a.id,a.name,a.imgUrl,a.bImgUrl,a.describe,a.price) from " +
            "ProductVO a,StarProVO b where a.id = b.proid order by b.orderd",nativeQuery = false)
    public List<ProductVO> getStarPro();
}
