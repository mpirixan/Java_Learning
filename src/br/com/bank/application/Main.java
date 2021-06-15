package br.com.bank.application;
import br.com.bank.dao.UserDAO;
import br.com.bank.model.User;

import java.sql.Connection;
import java.sql.SQLException;

import static br.com.bank.factory.ConnectionFactory.createConnectionToMySQL;

public class Main {

    public static void main (String[] args) throws SQLException {

        UserDAO userDao = new UserDAO();


        User user = new User();
        user.setCpf(01234567);
        user.setName("Matheus Dias");
        user.setAgency(055);
        user.setAccount(8456);

        userDao.save(user);
    }
}


