package br.com.surb.surb.modules.reply.infra.repositories;

import br.com.surb.surb.modules.reply.infra.entities.Reply;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReplyRepository extends JpaRepository<Reply, Long> {
}
