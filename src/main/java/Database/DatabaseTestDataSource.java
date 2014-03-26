package Database;

import com.jolbox.bonecp.BoneCPDataSource;
import javax.sql.DataSource;

public class DatabaseTestDataSource {

    DataSource dataSource;

    public DatabaseTestDataSource() {

        BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
        boneCPDataSource.setDriverClass("org.h2.Driver");
        boneCPDataSource.setUsername("sa");
        boneCPDataSource.setPassword("");
        boneCPDataSource.setJdbcUrl("jdbc:h2:tcp://localhost/~/test");

        dataSource = boneCPDataSource;
    }

    public DataSource getDataSource() {
        return dataSource;
    }
}
