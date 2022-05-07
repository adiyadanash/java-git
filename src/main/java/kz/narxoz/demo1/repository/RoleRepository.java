package kz.narxoz.demo1.repository;

import kz.narxoz.demo1.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
