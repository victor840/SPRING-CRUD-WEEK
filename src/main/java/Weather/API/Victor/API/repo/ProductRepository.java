package Weather.API.Victor.API.repo;

import Weather.API.Victor.API.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}

