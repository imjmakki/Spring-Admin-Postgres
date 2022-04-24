package app.springadmin.springadmin.DAO;

import java.util.Optional;

import app.springadmin.springadmin.Entity.Role;
import app.springadmin.springadmin.enums.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleDAO extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
