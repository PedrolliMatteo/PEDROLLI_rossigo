package org.example;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class database
{
    private static database instance;
    private Connection connection;

    private database() throws Exception {
        String url = "jdbc:sqlite:database.db";
        connection = (Connection) DriverManager.getConnection(url);
        System.out.println("Connesso al database");
    }

    public static database getInstance() throws Exception {
        if (instance == null) {
            instance = new database();
        }
        return instance;
    }

    public String selectAll() {
        String result = "";

        //Controlliamo che il database sia ancora collegato
        try {
            if (connection == null || !connection.isValid(5)) {
                System.err.println("Connessione è null/invalida");
                return null;
            }
        } catch (Exception e) {
            System.err.println("Connessione è null/invalida");
            return null;
        }

        String query = "SELECT * FROM menu";
        try {
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                result += rs.getString("id") + "\t";
                result += rs.getString("piatto") + "\t";
                result += rs.getString("prezzo") + "\t";
                result += rs.getString("quantita") + "\n";
            }


        } catch (Exception e) {
            System.err.println("Errore nella query: " + query);
            return null;
        }

        return result;
    }

    public boolean insert(String piatto, double prezzo, int quantita) {
        //Controlliamo che il database sia ancora collegato
        try {
            if (connection == null || !connection.isValid(5)) {
                System.err.println("Connessione è null/invalida");
                return false;
            }
        } catch (Exception e) {
            System.err.println("Connessione è null/invalida");
            return false;
        }



        String query = "INSERT INTO menu(piatto, prezzo, quantita) VALUES ( ?, ?, ?)";

        try {
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, piatto);
            statement.setDouble(2, prezzo);
            statement.setInt(3, quantita);
            statement.executeUpdate();




        } catch (Exception e) {
            System.err.println("Errore nella query: " + query);
            return false;
        }


        return true;

    }
}
