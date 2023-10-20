import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddressBook extends JFrame implements ActionListener{
    private JMenuBar menuBar;
    private JMenu menu;
    private ArrayList<BuddyInfo> myBuddies;


    private DefaultListModel<BuddyInfo> listBuddies = new DefaultListModel<BuddyInfo>();
    private JList<BuddyInfo> BuddyList = new JList<BuddyInfo>(listBuddies);

    private JButton display,remove,add;
    private ButtonGroup all;
    public AddressBook(){
        super("AddressBook");
        menu = new JMenu("Menu Bar");
        menuBar = new JMenuBar();
        menu.add(menuBar);
        this.add(menuBar);
        myBuddies=new ArrayList<>();
        myBuddies.add(new BuddyInfo("Ash", "Lastname"));
        menu.addActionListener(this);
        createButtons();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setVisible(true);
    }
    }
//Add Buddy to Addressbook
    public void addBuddy(BuddyInfo buddy){
        if(buddy != null) {
            myBuddies.add(buddy);
        }
    }
    //Remove buddy from addressbook
    public BuddyInfo removeBuddy(int buddy){
        if(buddy >= 0 && buddy < myBuddies.size()){
            return myBuddies.remove(buddy);
        }
        return null;
    }

    public static void main(String[] args) {
        JFrame p = new AddressBook();
        System.out.println();
        System.out.println("Address Book");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == display){
            JScrollPane scroll = new JScrollPane();
            this.getContentPane().add(scroll);
            System.out.print(scroll);
        }
        display.setText(" ");

        if(e.getSource() == add){
            JScrollPane scroll = new JScrollPane(new JList<BuddyInfo>(myBuddies.toArray(new BuddyInfo[0])));
            this.getContentPane().add(scroll);
        }
        if(e.getSource() == remove){
            JScrollPane scroll = new JScrollPane(new JList<BuddyInfo>(myBuddies.toArray(new BuddyInfo[0])));
            this.getContentPane().add(scroll);
        }
    }

    private void createButtons(){
        display = new JButton("Display AddressBook");
        menuBar.add(display);
        display.addActionListener(this);

        add = new JButton("Add BuddyInfo");
        menuBar.add(add);
        add.addActionListener(this);

        remove = new JButton("Remove BuddyInfo");
        menuBar.add(remove);
        remove.addActionListener(this);

    }
}
