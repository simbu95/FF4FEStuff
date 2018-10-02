package ff4fe;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FF4FE {
    static JPanel menu,tracker,dmach,grind,itemTrack,itemStat,bossStat;
    static JFrame frame;
    static int which=0;
    public static void main(String[] args) {
        frame=new JFrame();
        menu=CreateMenu();
        tracker=CreateTracker();
        dmach=CreateDmach();
        grind=CreateGrind();
        itemTrack=CreateItemTrack();
        itemStat=CreateItemStat();
        bossStat=CreateBossStat();
        frame.add(menu);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(300, 600);
    }
    
    private static JPanel CreateMenu() {
        JPanel hold=new JPanel();
        JButton track=new JButton("Tracker");
        track.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(tracker);
                frame.revalidate();
                frame.repaint();
            }
        });
        JButton dmac=new JButton("dmachine");
        dmac.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(dmach);
                frame.revalidate();
                frame.repaint();
            }
        });
        JButton grin=new JButton("grind");
        grin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(grind);
                frame.revalidate();
                frame.repaint();
            }
        });
        JButton itemtrack=new JButton("itemstrack");
        itemtrack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(itemTrack);
                frame.revalidate();
                frame.repaint();
            }
        });
        JButton items=new JButton("itemsStats");
        items.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(itemStat);
                frame.revalidate();
                frame.repaint();
            }
        });
        JButton boss=new JButton("Bosses");
        boss.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(itemTrack);
                frame.revalidate();
                frame.repaint();
            }
        });
        hold.add(track);
        hold.add(dmac);
        hold.add(grin);
        hold.add(itemtrack);
        hold.add(items);
        hold.add(boss);
        hold.setLayout(new GridLayout(3,2));
        return hold;
    }
    private static JPanel CreateTracker() {
        JPanel hold=new JPanel(new BorderLayout());
        JButton Back=new JButton("Back");
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(menu);
                frame.revalidate();
                frame.repaint();
            }
        });
        hold.add(Back,BorderLayout.PAGE_START);
        JTextArea lab=new JTextArea("This is a placeholder for an item tracker");
        lab.setLineWrap(true);
        hold.add(lab,BorderLayout.CENTER);
        return hold;
    }

    private static JPanel CreateDmach() {
        JPanel hold=new JPanel(new BorderLayout());
        JButton Back=new JButton("Back");
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(menu);
                frame.revalidate();
                frame.repaint();
            }
        });
        hold.add(Back,BorderLayout.PAGE_START);
        JTextArea lab=new JTextArea("This is a placeholder for the DMachine Step-Chart");
        lab.setLineWrap(true);
        hold.add(lab,BorderLayout.CENTER);
        return hold;
    }

    private static JPanel CreateGrind() {
        JPanel hold=new JPanel(new BorderLayout());
        JButton Back=new JButton("Back");
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(menu);
                frame.revalidate();
                frame.repaint();
            }
        });
        hold.add(Back,BorderLayout.PAGE_START);
        JTextArea lab=new JTextArea("This is a placeholder for a #Fights for x Level Calculator");
        lab.setLineWrap(true);
        hold.add(lab,BorderLayout.CENTER);
        return hold;
    }

    private static JPanel CreateItemTrack() {
        JPanel hold=new JPanel(new BorderLayout());
        JButton Back=new JButton("Back");
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(menu);
                frame.revalidate();
                frame.repaint();
            }
        });
        hold.add(Back,BorderLayout.PAGE_START);
        JTextArea lab=new JTextArea("This is a placeholder for an item tracker");
        lab.setLineWrap(true);
        hold.add(lab,BorderLayout.CENTER);
        return hold;
    }

    private static JPanel CreateItemStat() {
        JPanel hold=new JPanel(new BorderLayout());
        JButton Back=new JButton("Back");
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(menu);
                frame.revalidate();
                frame.repaint();
            }
        });
        hold.add(Back,BorderLayout.PAGE_START);
        JTextArea lab=new JTextArea("This is a placeholder for an Item Stats repository");
        lab.setLineWrap(true);
        hold.add(lab,BorderLayout.CENTER);
        return hold;
    }

    private static JPanel CreateBossStat() {
        JPanel hold=new JPanel(new BorderLayout());
        JButton Back=new JButton("Back");
        Back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.getContentPane().removeAll();
                frame.add(menu);
                frame.revalidate();
                frame.repaint();
            }
        });
        hold.add(Back,BorderLayout.PAGE_START);
        JTextArea lab=new JTextArea("This is a placeholder for a Boss Stat calculator, Maybe best agility anchor too. ");
        lab.setLineWrap(true);
        hold.add(lab,BorderLayout.CENTER);
        return hold;
    }
    
}
