package utec.demodomino.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import utec.demodomino.user.domain.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findUserById(long id);

}