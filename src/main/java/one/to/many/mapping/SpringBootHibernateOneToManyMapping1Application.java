package one.to.many.mapping;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import one.to.many.mapping.Entity.Comment;
import one.to.many.mapping.Entity.Post;
import one.to.many.mapping.repositary.CommentRepositary;
import one.to.many.mapping.repositary.PostRepositary;

@SpringBootApplication
public class SpringBootHibernateOneToManyMapping1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootHibernateOneToManyMapping1Application.class, args);
	}

}
