package Principal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import Principal.core.driven_ports.BookRepository;
import Principal.core.driver_ports.BookService;
import Principal.core.driver_ports.BookServiceImpl;

@Configuration
public class SpringBeans {
        @Bean
        BookService bookService(final BookRepository bookRepository) {
            return new BookServiceImpl(bookRepository);
}
}
