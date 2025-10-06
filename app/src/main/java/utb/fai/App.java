package utb.fai;

public class App {

    public static void main(String[] args) {
        // TODO: Implement input parameter processing
        
        try {
            EmailSender sender = new EmailSender("localhost", 9999);
            sender.send("m_vrba@utb.cz", "m_vrba@utb.cz", "Email from Java", "Funguje to?\nSnad...");
            sender.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
