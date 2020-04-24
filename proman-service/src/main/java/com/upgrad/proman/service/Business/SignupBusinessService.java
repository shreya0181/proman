package com.upgrad.proman.service.Business;

import com.upgrad.proman.service.Dao.UserDao;
import com.upgrad.proman.service.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupBusinessService {

    @Autowired
    private UserDao userDao;
    public UserEntity signup(UserEntity userEntity)
    {

      return  userDao.createUser(userEntity);
    }

}
