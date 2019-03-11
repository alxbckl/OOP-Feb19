public class ChatSpammerMain{
    public static void main(String args[]){

        Sender sende = new Sender();

        ChatSpammerKonstruktor frm = new ChatSpammerKonstruktor(sende);

        frm.setLayout(null);

        frm.setVisible(true);
        frm.setSize(500,300);
        frm.setDefaultCloseOperation(ChatSpammerKonstruktor.EXIT_ON_CLOSE);
        frm.setResizable(false);

    }

}