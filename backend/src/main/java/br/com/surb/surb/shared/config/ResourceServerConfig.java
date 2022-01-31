package br.com.surb.surb.shared.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import java.util.Arrays;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

  private final Environment environment;
  private final JwtTokenStore tokenStore;

  public ResourceServerConfig(Environment environment, JwtTokenStore tokenStore){
    this.environment = environment;
    this.tokenStore = tokenStore;
  }

  private static final String[] PUBLIC = {
    "/oauth/token",
    "/h2-console/**",
  };

  private static final String[] PERMISSION_GET = {
    "/api/users/**",
    "/api/products/**",
    "/api/categories/**",
    "/api/movies/**",
    "/api/scores/**",
    "/api/departments/**",
    "/api/employees/**",
    "/api/roles/**",
  };

  private static final String[] PERMISSION_POST = {
    "/api/products",
    "/api/categories",
    "/api/movies/**",
    "/api/scores/**",
    "/api/departments/**",
    "/api/employees/**",
    "/api/roles/**",
  };

  private static final String[] PERMISSION_PUT = {
    "/api/products/**",
    "/api/categories/**",
    "/api/movies/**",
    "/api/scores/**",
    "/api/departments/**",
    "/api/employees/**",
    "/api/roles/**",
  };

  private static final String[] PERMISSION_DELETE = {
    "/api/products/**",
    "/api/categories/**",
    "/api/movies/**",
    "/api/scores/**",
    "/api/departments/**",
    "/api/employees/**",
    "/api/roles/**",
  };

  private static final String[] PERMISSION_PATCH = {
    "/api/products/status/**",
    "/api/categories/status/**",
    "/api/movies/status/**",
    "/api/scores/status/**",
    "/api/departments/status/**",
    "/api/employees/status/**",
    "/api/roles/status/**",
  };

  private static final String[] USER_OR_ADMIN = {
    "/api/user/notifications"
  };

  private static final String[] ADMIN = {
    "/api/users/**",
    "/api/notifications"
  };

//  private static final String[] ADMIN = {
//    "/api/users/notifications",
//    "/api/users/status"
//  };

  @Override
  public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
    resources.tokenStore(tokenStore);
  }

  @Override
  public void configure(HttpSecurity http) throws Exception {

    // H2
    if(Arrays.asList(environment.getActiveProfiles()).contains("test")){
      http.headers().frameOptions().disable();
    }

    http.authorizeRequests()
      .antMatchers(PUBLIC).permitAll()
      .antMatchers(HttpMethod.GET, USER_OR_ADMIN).permitAll()
//      .antMatchers(OPERATOR_OR_ADMIN).hasAnyRole("OPERATOR", "ADMIN")
      .antMatchers(HttpMethod.GET, PERMISSION_GET).hasAnyRole("OPERATOR", "STUDENT", "INSTRUCTOR", "ADMIN")
      .antMatchers(HttpMethod.POST, PERMISSION_POST).hasAnyRole("ADMIN")
      .antMatchers(HttpMethod.PUT, PERMISSION_PUT).hasAnyRole("ADMIN")
      .antMatchers(HttpMethod.DELETE, PERMISSION_DELETE).hasAnyRole("ADMIN")
      .antMatchers(HttpMethod.PATCH, PERMISSION_PATCH).hasAnyRole("ADMIN")
      .antMatchers(ADMIN).hasRole("ADMIN")
//      .anyRequest().hasAnyRole("ADMIN")
      .anyRequest().authenticated();

  }
}
