package fr.ksludovic.algoheroes.repository;

import fr.ksludovic.algoheroes.model.Comment;
import fr.ksludovic.algoheroes.model.Post;
import fr.ksludovic.algoheroes.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
