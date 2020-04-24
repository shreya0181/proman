package com.upgrad.proman.service.Dao;

import com.upgrad.proman.service.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.w3c.dom.Entity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceUnit;

@Repository
public class UserDao {

    @PersistenceContext
    private EntityManager em;


    public UserEntity createUser(UserEntity userEntity)
    {
         em.persist(userEntity);
         return userEntity;
    }

}
