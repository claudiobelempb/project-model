package br.com.surb.surb.modules.notification.infra.repositories;

import br.com.surb.surb.modules.notification.infra.entities.Notification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
