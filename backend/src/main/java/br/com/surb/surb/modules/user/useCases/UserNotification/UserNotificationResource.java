package br.com.surb.surb.modules.user.useCases.UserNotification;

import br.com.surb.surb.modules.notification.dto.NotificationDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users/notifications")
public class UserNotificationResource {

  private final UserNotificationService notificationFindAllService;

  public UserNotificationResource(UserNotificationService notificationFindAllService){
    this.notificationFindAllService = notificationFindAllService;
  }

  @GetMapping
  public ResponseEntity<Page<NotificationDTO>> handle(Pageable pageable){
    /*PARAMETRISE: page, size, sort*/
    Page<NotificationDTO> page = notificationFindAllService.execute(pageable);
    return ResponseEntity.ok().body(page);
  }
}
