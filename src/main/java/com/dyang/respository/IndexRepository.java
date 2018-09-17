package com.dyang.respository;

import com.dyang.model.MenuVO;
import com.dyang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by DYang on 2018/9/12
 */
@Repository
public interface IndexRepository extends JpaRepository<MenuVO,String> {

    @Query(value = "from MenuVO where used = 'Y' order by orderd")
    public List<MenuVO> getMenu();

}