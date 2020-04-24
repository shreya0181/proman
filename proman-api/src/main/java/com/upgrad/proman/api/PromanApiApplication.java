package com.upgrad.proman.api;

import com.upgrad.proman.service.Serviceconfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(Serviceconfig.class)
public class PromanApiApplication {
  public static  void main(String[] args)
  {
      SpringApplication.run(PromanApiApplication.class,args);
  }

}
