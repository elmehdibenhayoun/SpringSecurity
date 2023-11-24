package ma.mundiapolis.hospitalapp.security.repo;

import ma.mundiapolis.hospitalapp.security.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppUserRepository extends JpaRepository<AppUser,String> {
    AppUser findByUsername(String username);
}
