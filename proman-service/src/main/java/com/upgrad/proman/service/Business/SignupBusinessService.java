package com.upgrad.proman.service.Business;

import com.upgrad.proman.service.Dao.UserDao;
import com.upgrad.proman.service.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;

import javax.transaction.Transactional;

@Service
public class SignupBusinessService {

    @Autowired
    private UserDao userDao;
    @Transactional(propagation=Propagation)
    public UserEntity signup(UserEntity userEntity)
    {

      return  userDao.createUser(userEntity);
    }

}
