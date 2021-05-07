
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*

 */
public class SendSalary {
    public static void SendSalary(String mailid,Double sal,String name,int t)throws Exception {
        Properties p=new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable","true");
        p.put("mail.smtp.host","smtp.hostinger.in");
        p.put("mail.smtp.port", "587");
        String myacc="help@bookbin.tech";
        String mypass="Sub@2019";
        Session ses=Session.getInstance(p, new Authenticator(){
           @Override
           protected PasswordAuthentication getPasswordAuthentication()
           {
               return new PasswordAuthentication(myacc,mypass);
               
             
           }
        });
        Message m=preparMessage(ses,myacc,mailid,sal,name,t);
        Transport.send(m);
        System.out.println("Message sent successfully");
       
       
    }

    private static Message preparMessage(Session ses, String myacc, String mailid,Double otp,String name,int t) {
       
        try {
            Message mess=new MimeMessage(ses);
            mess.setFrom(new InternetAddress(myacc));
            mess.setRecipient(Message.RecipientType.TO, new InternetAddress(mailid));
            mess.setSubject("COFFEE SHOP SALARY");
            mess.setText("Dear "+name+", \n Your This month salary is generetrd any you achived "+t+" target and according to out policy you got Rs."+otp+" within 24hrs your Salary will Cridited in your given Bank Account\nThank You!!");
            return mess;
        } catch (Exception ex) {
            Logger.getLogger(sendMail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
   
}
