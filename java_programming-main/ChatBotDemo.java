import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class ChatBot extends JFrame{
    private JTextArea ca=new JTextArea();
    private JTextField cf=new JTextField();
    private JButton btn=new JButton();
    private JLabel l=new JLabel();
    ChatBot(){
        JFrame f=new JFrame();
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        f.setLayout(null);
        f.setSize(400,400);
        f.getContentPane().setBackground(Color.green);
        f.setTitle("Chat Bot");
        f.add(ca);
        f.add(cf);
        btn.setBackground(Color.YELLOW);
        ca.setSize(300,300);
        ca.setLocation(1,1);
        ca.setBackground(Color.green);
        cf.setSize(300,30);
        cf.setLocation(1,320);   
        f.add(btn);
        f.add(l);
        l.setText("  Send  ");
        btn.add(l);
        
        btn.setSize(400,30);
        btn.setBorderPainted(true);
        btn.setLocation(300,320);
        btn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(e.getSource()==btn){
                    String text=cf.getText().toLowerCase();
                    ca.append("me : "+text+"\n");
                    cf.setText("");
                    switch(text){
                        case "hi" : 
                        reply("Hi There its me chatBot");
                        break;
                        case "hello":
                        reply("Hi There its me chatBot");
                        break;
                        case "how are you":
                        reply("I'm fine what about you");
                        break;
                        case "":
                        reply("Type Something");
                        break;
                        case "ok":
                        reply("Hmm. . 🙃");
                        case "im fine":
                        reply("Good To Here From You");
                        break;
                        case "what is your name":
                        reply("I don't have name i'm just a chatbot"+"\nWhat's your name  🤗");
                        break;
                        case "yes":
                        reply("Good name...😍");
                        break;
                        case "play music":

                        case "exit":
                        reply("Have a good day");
                        try {
                            wait(100);
                        } catch (InterruptedException e1) {
                            reply("Gonna exit");
                        }
                        System.exit(0);
                        break;
                        default:
                        reply("I didn't get that can you rephase the sentence");
                        reply("Is it your name ?  🤔🤔");
                        reply("If you wanna exit type Exit");
                    }
                }
            }
        });

    }
    public void reply(String s){
        ca.append("Bot : "+s+"\n");
    }
}
public class ChatBotDemo {
    public static void main(String[] args) {
        new ChatBot();
    }
}
