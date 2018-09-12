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
}
