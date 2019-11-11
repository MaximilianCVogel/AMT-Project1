package amt.project1.business.DAO;


import amt.project1.model.Person;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class PeopleManager implements PeopleManagerLocal {

    @Resource(lookup = "jdbc/people")
    private DataSource dataSource;

    @Override
    public List findAllPeople(){
        List<Person> people = new ArrayList<>();
        try {
            Connection connection = dataSource.getConnection();
            System.out.println("Schema: " + connection.getSchema());
            System.out.println("Catalog: " + connection.getCatalog());
            PreparedStatement pstmt = connection.prepareStatement("SELECT * FROM Person");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()){
                long id = rs.getLong("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                String address = rs.getString("address");
                String telephone = rs.getString("telephone");
                String email = rs.getString("email");
                people.add(new Person(id, name, password, address, telephone, email));
            }
            connection.close();
        } catch (SQLException ex){

        }
        return people;
    }
}
