package ma.mundiapolis.hospitalapp.security.repo;

import ma.mundiapolis.hospitalapp.security.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRole,String> {
}
