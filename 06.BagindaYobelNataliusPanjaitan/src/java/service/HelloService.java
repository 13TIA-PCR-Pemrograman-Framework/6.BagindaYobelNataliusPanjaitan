/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author LabGSG
 */
public class HelloService {
    public static String sayHello(String nama, String nim, String kelas, String judul){
    return "<table>"
            + "<tr><td>Nama</td><td>:</td><td>"+nama+"</td></tr>"
            + "<tr><td>Nim</td><td>:</td><td>"+nim+"</td></tr>"
            + "<tr><td>Kelas</td><td>:</td><td>"+kelas+"</td></tr>"
            + "<tr><td>Judul</td><td>:</td><td>"+judul+"</td></tr>"
            ;
    
    }
   
}
