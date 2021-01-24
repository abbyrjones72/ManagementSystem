package com.managementsystem.database;
import java.sql.Connection;
import java.sql.DriverManager;

public class PostgresJDBC {
    Connection c = null;
    try
    {
        Class.forName("org.postgres.Driver");
        c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/testdb","postgres", "123");
    }
    catch(ClassNotFoundException cnfe)
    {

    }
    catch(Exception err)
    {
        err.printStackTrace();
        System.err.println(err.getClass().getName() + ": " + err.getMessage());
    }
    System.out.println("Connected to database successfully.");
}
