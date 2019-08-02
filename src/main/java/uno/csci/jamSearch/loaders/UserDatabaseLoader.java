package uno.csci.jamSearch.loaders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import uno.csci.jamSearch.models.Comment;
import uno.csci.jamSearch.models.Post;
import uno.csci.jamSearch.models.User;
import uno.csci.jamSearch.repos.PostRepository;
import uno.csci.jamSearch.repos.UserRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserDatabaseLoader implements CommandLineRunner {

    private final UserRepository userRepo;

    @Autowired
    public UserDatabaseLoader(UserRepository userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public void run(String... strings) throws Exception {
        User user = new User();
        user.setUsername("TestName");
        user.setPassword("TestPassword");
        user.setInstruments("Guitar");

        List<Post> posts = new ArrayList<>();
        Post post = new Post();
        post.setContent("Test Post");
        List<Comment> comments = new ArrayList<>();
        Comment comment = new Comment();
        comment.setMessage("that post sucked");

        post.setComments(comments);
        user.setPosts(posts);

        userRepo.save(user);

    }
}