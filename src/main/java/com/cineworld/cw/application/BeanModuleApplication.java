package com.cineworld.cw.application;

import com.cineworld.cw.application.actor.GetActorApplication;
import com.cineworld.cw.application.category.GetCategoryApplication;
import com.cineworld.cw.application.country.GetCountryApplication;
import com.cineworld.cw.application.customer.CreateCustomerApplication;
import com.cineworld.cw.application.customer.GetCustomerApplication;
import com.cineworld.cw.application.customer.UpdateCustomerApplication;
import com.cineworld.cw.application.film.CreateFilmApplication;
import com.cineworld.cw.application.film.GetFilmApplication;
import com.cineworld.cw.domain.services.actor.GetActorService;
import com.cineworld.cw.domain.services.category.GetCategoryService;
import com.cineworld.cw.domain.services.country.GetCountryService;
import com.cineworld.cw.domain.services.customer.CreateCustomerService;
import com.cineworld.cw.domain.services.customer.GetCustomerService;
import com.cineworld.cw.domain.services.customer.UpdateCustomerService;
import com.cineworld.cw.domain.services.film.CreateFilmService;
import com.cineworld.cw.domain.services.film.GetFilmService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanModuleApplication {


  @Bean
  public GetCategoryApplication getCategoryApplication(
      GetCategoryService getCategoryService) {
    return new GetCategoryApplication(getCategoryService);
  }

  @Bean
  public CreateFilmApplication createFilmApplication(
      CreateFilmService createFilmService,
      GetCategoryApplication categoryApplication) {
    return new CreateFilmApplication(createFilmService, categoryApplication);
  }

  @Bean
  public CreateCustomerApplication createCustomerApplication(
      CreateCustomerService createCustomerService) {
    return new CreateCustomerApplication(createCustomerService);
  }

  @Bean
  public GetCustomerApplication getCustomerApplication(
      GetCustomerService getCustomerService) {
    return new GetCustomerApplication(getCustomerService);
  }

  @Bean
  public UpdateCustomerApplication updateCustomerApplication(
      UpdateCustomerService updateCustomerService) {
    return new UpdateCustomerApplication(updateCustomerService);
  }

  @Bean
  public GetCountryApplication getCountryApplication(
      GetCountryService getCountryService) {
    return new GetCountryApplication(getCountryService);
  }

  @Bean
  public GetFilmApplication getFilmApplication(
      GetFilmService getFilmService) {
    return new GetFilmApplication(getFilmService);
  }

  @Bean
  public GetActorApplication getActorApplication(
      GetActorService getActorService) {
    return new GetActorApplication(getActorService);
  }
}
