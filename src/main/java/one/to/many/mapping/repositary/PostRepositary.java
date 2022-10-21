package one.to.many.mapping.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.to.many.mapping.Entity.Post;
@Repository
public interface PostRepositary extends JpaRepository<Post, Long>{

}
