package uno.csci.jamSearch.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import uno.csci.jamSearch.models.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}