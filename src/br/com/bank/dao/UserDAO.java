package br.com.bank.dao;
import br.com.bank.factory.ConnectionFactory;
import br.com.bank.model.User;
import com.mysql.cj.jdbc.JdbcPreparedStatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDAO {
    /*
     *CRUD
     * c: Create
     * r: Read
     * u: Update
     * d: Delete
     */

    public void save(User user) throws SQLException {

        String sql = "INSERT INTO users(cpf, name, agency, account) VALUES(?,?,?,?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try{
            //Criar uma conexão com banco de dados
            conn = ConnectionFactory.createConnectionToMySQL();
            //Adicionar Valores pela Query
            pstm = (PreparedStatement) conn.prepareStatement(sql);
            pstm.setInt(1, user.getCpf());
            pstm.setString(2, user.getName());
            pstm.setInt(3,user.getAgency());
            pstm.setInt(4,user.getAccount());

            pstm.execute();
        }catch (Exception e){
            e.printStackTrace();
        }finally {

            //Fechar as conexões
            try{
                if (pstm!=null){
                    pstm.close();
                }
                if(conn!=null){
                    conn.close();
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }

    }

}
