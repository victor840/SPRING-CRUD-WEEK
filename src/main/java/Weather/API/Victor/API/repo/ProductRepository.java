package Weather.API.Victor.API.repo;

import Weather.API.Victor.API.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// import net.javaguides.springboot.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

