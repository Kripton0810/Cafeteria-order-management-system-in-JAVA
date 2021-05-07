/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * 
 */
public class sendMail {
    public static void sendMail(String mailid,String otp)throws Exception {
        Properties p=new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable","true");
        p.put("mail.smtp.host","<SMTP.HOST_NAME>");
        p.put("mail.smtp.port", "587");
        String myacc="<Email>";
        String mypass="<PASSWORD>";
        Session ses=Session.getInstance(p, new Authenticator(){
           @Override
           protected PasswordAuthentication getPasswordAuthentication()
           {
               return new PasswordAuthentication(myacc,mypass);
               
             
           }
        });
        Message m=preparMessage(ses,myacc,mailid,otp);
        Transport.send(m);
        System.out.println("Message sent successfully");
       
       
    }

    private static Message preparMessage(Session ses, String myacc, String mailid,String otp) {
       
        try {
            Message mess=new MimeMessage(ses);
            mess.setFrom(new InternetAddress(myacc));
            mess.setRecipient(Message.RecipientType.TO, new InternetAddress(mailid));
            mess.setSubject("COFFEE SHOP OTP VALADITION");
            mess.setText("Dear Employes, \n Your OTP for Password Updation is: "+otp+"\nThank You!!");
            return mess;
        } catch (Exception ex) {
            Logger.getLogger(sendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
       
   
}

