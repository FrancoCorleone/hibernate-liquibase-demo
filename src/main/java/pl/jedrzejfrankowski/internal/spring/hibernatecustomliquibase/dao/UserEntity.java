package pl.jedrzejfrankowski.internal.spring.hibernatecustomliquibase.dao;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserEntity {
    @Id
    @GenericGenerator(name = "random_uuid_like_generator",
            strategy = "pl.jedrzejfrankowski.internal.spring.hibernatecustomliquibase.generator.CustomGenerator",
            parameters = {
                    @Parameter(name = "prefix", value = "UE")
            })
    @GeneratedValue(generator = "random_uuid_like_generator")
    private String id;
    private String firstname;
    private String lastname;
}
