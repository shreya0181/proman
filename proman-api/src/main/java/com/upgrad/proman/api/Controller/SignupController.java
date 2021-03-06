package com.upgrad.proman.api.Controller;



import com.upgrad.proman.api.model.SignupUserRequest;
import com.upgrad.proman.api.model.SignupUserResponse;
import com.upgrad.proman.service.Business.SignupBusinessService;
import com.upgrad.proman.service.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;
import java.util.UUID;

@RestController
@RequestMapping("/")
public class SignupController {

    @Autowired
    private SignupBusinessService signupBusinessService;



    @RequestMapping(method = RequestMethod.POST, path = "/signup", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<SignupUserResponse> signup(final SignupUserRequest signupUserRequest)
    {
      final   UserEntity userEntity =new UserEntity();
      userEntity.setUuid(UUID.randomUUID().toString());
      userEntity.setFirstName(signupUserRequest.getFirstName());
      userEntity.setLastName(signupUserRequest.getLastName());
      userEntity.setEmail(signupUserRequest.getEmailAddress());
      userEntity.setPassword(signupUserRequest.getPassword());
      userEntity.setSalt("234567");
      userEntity.setStatus(4);
      userEntity.setCreatedAt(ZonedDateTime.now());
      userEntity.setCreatedBy("Me");

     final UserEntity createdUserEntity =   signupBusinessService.signup(userEntity);
     SignupUserResponse userResponse=new SignupUserResponse().id(createdUserEntity.getUuid()).status("REGISTERED");
        return  new ResponseEntity<SignupUserResponse>(userResponse,HttpStatus.CREATED) ;
    }

}

