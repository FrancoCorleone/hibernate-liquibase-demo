package pl.jedrzejfrankowski.internal.spring.hibernatecustomliquibase

import org.junit.ClassRule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest
import org.testcontainers.containers.PostgreSQLContainer
import pl.jedrzejfrankowski.internal.spring.hibernatecustomliquibase.dao.UserEntity
import pl.jedrzejfrankowski.internal.spring.hibernatecustomliquibase.dao.UserRepository
import spock.lang.Shared
import spock.lang.Specification

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class SchemeValidationSpec extends Specification {


    @Shared
    @ClassRule
    PostgreSQLContainer postgreSQLContainer = TestPostgreSqlContainer.getInstance()

    @Autowired
    UserRepository repository

    def "Should run database"() {
        expect:
        true
    }

    def "Should save with random uuid string id"() {
        given:
        def userEntity = UserEntity.builder()
                .firstname("firstname")
                .lastname("lastname")
                .build()

        when:
        repository.save(userEntity)

        then:
        println repository.findAll()
        true
    }
}
