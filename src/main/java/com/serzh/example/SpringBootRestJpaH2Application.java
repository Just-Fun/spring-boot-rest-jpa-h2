package com.serzh.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

//http://localhost:8080/swagger-ui.html
@EnableSwagger2
@SpringBootApplication
//http://javasolutionsguide.blogspot.com/2018/08/restful-api-using-spring-rest-spring.html
public class SpringBootRestJpaH2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestJpaH2Application.class, args);
    }
}

/*import com.samskivert.mustache.Mustache
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
@EnableConfigurationProperties(BlogProperties::class)
class BlogApplication {

	@Bean
	fun mustacheCompiler(loader: Mustache.TemplateLoader?) =
			Mustache.compiler().escapeHTML(false).withLoader(loader)

	@Bean
	fun databaseInitializer(userRepository: UserRepository,
							articleRepository: ArticleRepository) = CommandLineRunner {
		val smaldini = User("smaldini", "Stéphane", "Maldini")
		userRepository.save(smaldini)

		articleRepository.save(Article(
				"Reactor Bismuth is out",
				"Lorem ipsum",
				"dolor **sit** amet https://projectreactor.io/",
				smaldini,
				1
		))
		articleRepository.save(Article(
				"Reactor Aluminium has landed",
				"Lorem ipsum",
				"dolor **sit** amet https://projectreactor.io/",
				smaldini,
				2
		))
	}

}

fun main(args: Array<String>) {
	runApplication<BlogApplication>(*args)
}
*/
