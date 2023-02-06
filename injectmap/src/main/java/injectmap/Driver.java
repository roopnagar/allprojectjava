package injectmap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
	
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		FilmDirectors film = (FilmDirectors) context.getBean("filmDirectors",FilmDirectors.class);
		
		
		System.out.println(film.getMessage());
		
		

	}

}
