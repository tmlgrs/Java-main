package accesBaseDeDonnees;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;


import static java.sql.DriverManager.getConnection;

public class BDD {
    public JTable tAlbum;
    public static JTable tArtiste;
    public JTable tBeatmaker;
    public JTable tLabel;
    public JTable tPlaylist;
    public JTable tPodcast;

    private static Connection cn=null;
    public void addArtiste(){
        String url = "jdbc:mysql://mysql2.pedago.local.enit.fr/Projet_musique";
        String login = "student";
        String password ="Enit@65";

        try{
            Class.forName("java.sql.Driver");
            cn= getConnection(url, login, password);
            String query_insert = "insert into Artiste (nom, prenom, pseudo, dateDeNaissance)" + "values (?,?,?,?)";
            PreparedStatement preparedStmt_insert = cn.prepareStatement(query_insert);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
    public static void getArtiste(){
        String url = "jdbc:mysql://mysql2.pedago.local.enit.fr/Projet_musique";
        String login = "student";
        String password ="Enit@65";
        try{
            Class.forName("java.sql.Driver");
            cn= getConnection(url, login, password);
            Statement stmt = cn.createStatement();
            // SQL Request
            String sql = "SELECT * FROM Artiste";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData rsmd = rs.getMetaData();


            String columns[]= {"nom", "prenom", "pseudo", "dateDeNaissance"};
            rs.last();
            int nbrows = rs.getRow();
            rs.beforeFirst();
            int nbcolumn = rsmd.getColumnCount();
            String[][] data = new String[nbrows][nbcolumn];
            int i = 0;
            while(rs.next()) {
                String nom = rs.getString("nom");
                String prenom = rs.getString("prenom");
                String pseudo = rs.getString("pseudo");
                String dateDeNaissance = rs.getString("dateDeNaissance");
                data[i][0] = nom;
                data[i][1] = prenom;
                data[i][2] = pseudo;
                data[i][3] = dateDeNaissance;
                i++;
            }
            DefaultTableModel model = new DefaultTableModel(data, columns);
            tArtiste = new JTable(model);
            tArtiste.setShowGrid(true);
            tArtiste.setShowVerticalLines(true);

            tArtiste.setModel(model);
            tArtiste.setAutoResizeMode(0);
            tArtiste.getColumnModel().getColumn(0).setPreferredWidth(40);
            tArtiste.getColumnModel().getColumn(1).setPreferredWidth(40);
            tArtiste.getColumnModel().getColumn(2).setPreferredWidth(40);
            tArtiste.getColumnModel().getColumn(3).setPreferredWidth(40);


            cn.close();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
//          Tests d'injection dans la base de donnée (fonctionne)
/*
        String url = "jdbc:mysql://mysql2.pedago.local.enit.fr/Projet_musique";
        String login = "student";
        String password ="Enit@65";
        try{
            //Etape 1 : Changement du driver
            Class.forName("java.sql.Driver");
            //Etape 2 : récupération de la connexion
            cn= getConnection(url, login, password);
            // Ajouter un Artiste
            //Etape 1 : créer la requete insert
            String query_insert = "insert into Artiste (nom, prenom, pseudo, dateDeNaissance)" + "values (?,?,?,?)";
            //Etape 2 : créer le preparedstatement
//            try (PreparedStatement preparedStmt_insert = cn.prepareStatement(query_insert)) {
//                preparedStmt_insert.setString(1, "Wann");
//                preparedStmt_insert.setString(2, "Alpha");
//                preparedStmt_insert.setString(3, "Alpha Wann");
//                preparedStmt_insert.setDate(4, Date.valueOf("1989-07-02")); // Date : yyyy-mm-dd
//                //Etape 3 : exécuter le preparedstatement
//                preparedStmt_insert.execute();
//            }


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                cn.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }*/
    }
}
