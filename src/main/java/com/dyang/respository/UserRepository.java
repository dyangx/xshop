package com.dyang.respository;

import com.dyang.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;


/**
 * Created by DYang on 2018/7/4
 */
@Component
public interface UserRepository extends JpaRepository<User,Integer> {

    /**
     * 根据名字查询用户
     * @param username
     * @return
     */
    @Query("from User where username =:username")
    public User getUserByName(@Param("username") String username);


}
