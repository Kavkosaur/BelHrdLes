package by.belhard.j18.les12.jdbcExample;

import java.sql.*;

public class Main  {
    private static final String PATH = "jdbc:mysql://127.0.0.1/bh18db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASS = "31-@id@p@M.";
    //private static final String  = "";

    private static Connection connection;

    static{
        try {
            connection = DriverManager.getConnection(PATH,USER,PASS);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SQLException {


        Statement statement = connection.createStatement();

        /*String name = "Oleg";
        statement.execute(String.format("insert into employees value (null,'%s','2019-02-01',%d,%d)",name,1,1500));
        */

       // statement.executeUpdate(("update employees set salary = salary + 100 where salary < 1500"));

        ResultSet resultSet = statement.executeQuery("select * from employees");

        while (resultSet.next()){

           int id =  resultSet.getInt(1);
           String name = resultSet.getString("name");
           Date date = resultSet.getDate(3);
           Specialty specialty=getSpecialtyEntity(resultSet.getInt("specialty_id"));
        }









        statement.close();
        connection.close();
    }

    private static Specialty getSpecialtyEntity(int specialty_id) throws SQLException {
        PreparedStatement statement = connection.prepareStatement("select * from specialties where id = ?");
        statement.setInt(1,specialty_id);
        ResultSet resultSet = statement.executeQuery();
        Specialty result = null;
        while (resultSet.next()){

        }

        statement.executeQuery();

        return result;
    }
}
