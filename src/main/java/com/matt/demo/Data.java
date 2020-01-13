package com.matt.demo;

import java.sql.*;
import java.util.ArrayList;

public class Data {

    public ArrayList<People> API = new ArrayList<>();

    public Data(){


        Connection connect = null;

        try {
            // directs to driver (added in the dependencies)
            Class.forName("com.mysql.jdbc.Driver");
            connect = DriverManager
                    //info from workbench - port/schemaName, user, password
                    .getConnection("jdbc:mysql://localhost:3306/JavaProjectDatabase",
                            "root","password");

            System.out.println("DB Opened Successfully");

            // sets up statement through which the db can be queried
            Statement stmt=connect.createStatement();
            ResultSet rs=stmt.executeQuery("select * from info");

            while(rs.next())

                API.add(new People(rs.getInt(1), rs.getString(2), rs.getString(3)));

                //concat each column into a ln and sys out
                //System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));
            connect.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<People> getApi(){
        return API;
    }
}
