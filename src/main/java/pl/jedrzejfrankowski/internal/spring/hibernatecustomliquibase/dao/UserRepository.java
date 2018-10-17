package pl.jedrzejfrankowski.internal.spring.hibernatecustomliquibase.dao;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserEntity, String> {
}
