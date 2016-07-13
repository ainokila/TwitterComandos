/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twitterComandos;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

/**
 *
 * @author Cristian Velez Ruiz
 */
public class TwitterComandos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String consumerKey = ""; //Introducir
        String consumerSecret = ""; //Introducir
        String acessToken = ""; //Introducir
        String secretToken = ""; //Introducir
        String usuario = ""; //Introducir @tuUsuario
        
        ConfigurationBuilder cb = new ConfigurationBuilder();
        cb.setDebugEnabled(true);
        cb.setOAuthConsumerKey(consumerKey);
        cb.setOAuthConsumerSecret(consumerSecret);
        cb.setOAuthAccessToken(acessToken);
        cb.setOAuthAccessTokenSecret(secretToken);
        
        TwitterFactory tf = new TwitterFactory(cb.build());
        Twitter tt = tf.getInstance();
        
    
        while(true){
            try{
             
       
           
           Status st = tt.getUserTimeline().get(0);
               
               String orden = st.getText();
               if(orden.subSequence(0, usuario.length()).equals(usuario)){
      
                   orden = orden.substring(usuario.length()+1, orden.length());

                   try {
                       Process pro = Runtime.getRuntime().exec(orden);
                       //pro = Runtime.getRuntime().exec(orden);
                       InputStream in =  pro.getInputStream();
                       BufferedInputStream bis = new BufferedInputStream(in);
                       
                       byte[] buffer = new byte[1024];
                       int leidos= 0;
                       String ejecucion = "";
                       while ((leidos= bis.read(buffer)) != -1) {
                          ejecucion+= new String(buffer, 0, leidos);
                          
                       }
                       
                       ejecucion ="Salida: " +  ejecucion.substring(0,127) + "...";
                               
                       System.out.println(ejecucion);
                       tt.updateStatus(ejecucion);
                       
                   } catch (IOException ex) {
                       System.err.println(ex.toString());
                   }
               }
            
            Thread.sleep (10000);

        }catch(Exception e){
            System.err.print("Error en la excepcion");
        }
            
            
        }
        
        
        
        
          
        
        
        
    }
    
}
