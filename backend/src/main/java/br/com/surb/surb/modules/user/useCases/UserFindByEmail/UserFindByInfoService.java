package br.com.surb.surb.modules.user.useCases.UserFindByEmail;

import br.com.surb.surb.modules.user.infra.jpa.entities.User;
import br.com.surb.surb.modules.user.infra.jpa.repositories.UserRepository;
import br.com.surb.surb.shared.constants.ExceptionConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public record UserFindByInfoService(
  UserRepository userRepository) implements UserDetailsService {


  private static final Logger logger = LoggerFactory.getLogger(UserFindByInfoService.class);

  @Override
  public UserDetails loadUserByUsername(String usernameEmail) throws UsernameNotFoundException {
    User user = userRepository.findByEmail(usernameEmail);

    if (user == null) {
      logger.error(ExceptionConstants.USER_NOT_FOUND + usernameEmail);
      throw new UsernameNotFoundException(ExceptionConstants.EMAIL_NOT_FOUND + usernameEmail);
    }

    logger.info(ExceptionConstants.USER_FOUND + usernameEmail);
    return user;
  }
}
