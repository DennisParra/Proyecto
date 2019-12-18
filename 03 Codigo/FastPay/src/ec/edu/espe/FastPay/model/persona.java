/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.FastPay.model;

import java.io.BufferedReader;
import java.io.PrintWriter;


public class persona {
    private String ID;
    private String Nombre;
    private String Type;
    private String user;
    private String password;

    public persona(String ID, String Nombre, String Type, String user, String password) {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Type = Type;
        this.user = user;
        this.password = password;
    }

    public persona() {
        this.ID = ID;
        this.Nombre = Nombre;
        this.Type = Type;
        this.user = user;
        this.password = password;
         
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    

   

    void guardar(PrintWriter Escribe) {
        Escribe.println(ID);
        Escribe.println(Nombre);
        Escribe.println(Type);
        Escribe.println(user);
        Escribe.println(password);
    }

    public persona cargar(BufferedReader Almacen) {
        String Id, nom, type, usuari = null,pwd;
        
        try {
            Id = Almacen.readLine();
            nom = Almacen.readLine();
            type = Almacen.readLine();
            user = Almacen.readLine();
            pwd = Almacen.readLine();
            
            return new persona(Id,nom, type, usuari,pwd);
        } catch (Exception e) {
        }
        return null;
    }

    
}
