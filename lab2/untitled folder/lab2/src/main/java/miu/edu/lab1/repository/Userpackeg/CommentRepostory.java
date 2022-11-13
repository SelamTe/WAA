package miu.edu.lab1.repository.Userpackeg;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.xml.stream.events.Comment;

public interface CommentRepostory extends JpaRepository<Comment ,Long> {
}
