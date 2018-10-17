package pl.jedrzejfrankowski.internal.spring.hibernatecustomliquibase

import org.testcontainers.containers.PostgreSQLContainer

class TestPostgreSqlContainer extends PostgreSQLContainer {

    private static TestPostgreSqlContainer instance
    private static VERSION = "postgres:9.6"

    TestPostgreSqlContainer() {
        super(VERSION)
    }

    static getInstance() {
        if (instance == null) {
            instance = new TestPostgreSqlContainer()
        }
        return instance
    }

    @Override
    void start() {
        super.start()
        System.setProperty("DB_URL", getJdbcUrl())
        System.setProperty("DB_USER", getUsername())
        System.setProperty("DB_PASSWORD", getPassword())
    }

    @Override
    void close() {
        super.close()
    }
}
