package uno.csci.jamSearch.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uno.csci.jamSearch.models.Post;
import uno.csci.jamSearch.models.User;

public interface PostRepository extends JpaRepository<Post, Long> {
}