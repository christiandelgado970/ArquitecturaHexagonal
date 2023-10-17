package Principal.core.driven_ports;
import Principal.core.domain.Book;

public interface BookRepository {
	Book findById(Long id);
}
