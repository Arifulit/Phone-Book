/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mbstu.cse.habib.phonebook;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class PhoneBook {

    public static void main(String[] args) {
        try{
            Connection connection = DBConnect.getConnection();

        }
        catch(SQLException ex){
            Logger.getLogger(PhoneBook.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(() -> {
           PhoneBookFrame formUI = new PhoneBookFrame();
             formUI.setVisible(true);
        });
    }
}
