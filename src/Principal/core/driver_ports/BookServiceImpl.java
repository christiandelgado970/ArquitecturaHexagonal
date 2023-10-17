package Principal.core.driver_ports;

import Principal.core.domain.Book;
import Principal.core.driven_ports.BookRepository;

public class BookServiceImpl implements BookService {
	
private BookRepository bookRepository;
public BookServiceImpl(BookRepository bookRepository) {
	
        this.bookRepository = bookRepository;
}
public Book getBook(Long id) {
	
        return bookRepository.findById(id);
}
}