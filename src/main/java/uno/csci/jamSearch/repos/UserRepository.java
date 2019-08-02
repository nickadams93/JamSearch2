package uno.csci.jamSearch.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uno.csci.jamSearch.models.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}