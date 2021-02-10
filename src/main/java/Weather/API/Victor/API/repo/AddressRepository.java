package Weather.API.Victor.API.repo;

import Weather.API.Victor.API.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
