package aula8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        ConFactory conFactory = new ConFactory(
                "jdbc:postgresql://localhost:5432/exemplo",
                "postgres",
                "postgres");

        try(Connection connection = conFactory.getConnection()){

//            PreparedStatement preparedStatement = connection
//                    .prepareStatement("INSERT INTO usuario (email, nome) VALUES (?,?)");
//
//            preparedStatement.setString(1, "joao@gmail.com");
//            preparedStatement.setString(2, "João da Silva");
//
//            System.out.println(preparedStatement.executeUpdate());

            PreparedStatement preparedStatement = connection.prepareStatement(
                    "SELECT * FROM usuario");

            ResultSet resultSet = preparedStatement.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getString("nome"));
            }


        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }

    }

}
