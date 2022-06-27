/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conexao;

import java.io.IOException;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Usuario
 */
public class ConnectionFactory {
    
    private static EntityManagerFactory factory = null;
    
    static {
        try{
           init(); 
        }catch (IOException ex){
            
        }
    }
    
    private static void init() throws IOException {
        
        try{
            factory = Persistence.createEntityManagerFactory("com.mycompany_TESTE_jar_1.0-SNAPSHOTPU");
        }catch(Exception e){
            
        }
    }
    
    public static EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
