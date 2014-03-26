package Database;

import com.googlecode.flyway.core.Flyway;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseMain {
    public static void main(String[] args) {

        DatabaseTestDataSource databaseTestDataSource = new DatabaseTestDataSource();
        DataSource testDataSource = databaseTestDataSource.getDataSource();
        //doQuery(testDataSource);

        Flyway flyway = new Flyway();
        flyway.setDataSource(testDataSource);
        flyway.migrate();

    }

    private static void doQuery(DataSource dataSource) {

        String query = "Select FirstName, LastName from Names Where FirstName = ?";

        try {
            Connection dbConnection = dataSource.getConnection();
            PreparedStatement preparedStatement = dbConnection.prepareStatement(query);
            preparedStatement.setString(1, "Ben");

            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {

                String firstName = rs.getString("FIRSTNAME");
                String lastName = rs.getString("LASTNAME");

                System.out.println("First Name : " + firstName);
                System.out.println("Last Name : " + lastName);

            }

            preparedStatement.close();
            dbConnection.close();

        } catch (SQLException e) {
            e.printStackTrace();

        }
    }
}