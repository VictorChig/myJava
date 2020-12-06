import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MainClass {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Final Lesson App");
        jFrame.setBounds(300,300,400,200);
        jFrame.setLayout(new BorderLayout());
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JFrame jFrame2 = new JFrame();
        jFrame2.setTitle("Frame 2");
        jFrame2.setBounds(300,150,300,75);
        jFrame2.setLayout(new BorderLayout());
        JRadioButton redButton = new JRadioButton("RED",false);
        JRadioButton blueButton = new JRadioButton("BLUE",false);
        JRadioButton grayButton = new JRadioButton("GRAY",false);
        JPanel jPanel2 = new JPanel();
        redButton.addActionListener(new ColorMenuRadioBtn(Color.RED,jPanel2));
        grayButton.addActionListener(new ColorMenuRadioBtn(Color.GRAY,jPanel2));
        blueButton.addActionListener(new ColorMenuRadioBtn(Color.BLUE,jPanel2));
        jPanel2.add(redButton);
        jPanel2.add(blueButton);
        jPanel2.add(grayButton);
        jFrame2.add(jPanel2);
        JPanel jPanel = new JPanel();
        jPanel.setBackground(Color.GRAY);
        JButton jButtonRed=new JButton("Background Color RED");
        JButton jButtonBlue=new JButton("Background Color BLUE");
        JButton jButtonGray=new JButton("Background Color GRAY");
        JButton jButtonExit=new JButton("Exit");
        JButton jButtonFrm2=new JButton("Show Frame 2");
        jPanel.add(jButtonRed);
        jPanel.add(jButtonBlue);
        jPanel.add(jButtonGray);
        jPanel.add(jButtonExit);
        jPanel.add(jButtonFrm2);
        jButtonRed.addMouseListener(new ColorMenuMouseListener(Color.RED,jPanel));
        jButtonBlue.addMouseListener(new ColorMenuMouseListener(Color.BLUE,jPanel));
        jButtonGray.addMouseListener(new ColorMenuMouseListener(Color.GRAY,jPanel));
        jButtonExit.addMouseListener(new ExitMouseListener());
        jButtonFrm2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                jFrame2.setVisible(true);
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jFrame.add(jPanel,BorderLayout.CENTER);
        JMenuBar jMenuBar = new JMenuBar();
        jFrame.add(jMenuBar, BorderLayout.NORTH);
        JMenu jMenu1 = new JMenu("File");
        JMenuItem exit = jMenu1.add (new JMenuItem ("Exit"));
        JMenu jMenu = new JMenu("Background Color");
        JMenuItem red = jMenu.add(new StyledEditorKit.ForegroundAction("Red", Color.RED));
        JMenuItem blue = jMenu.add(new StyledEditorKit.ForegroundAction("Blue", Color.BLUE));
        JMenuItem gray = jMenu.add(new StyledEditorKit.ForegroundAction("Gray", Color.GRAY));
        red.addMouseListener(new ColorMenuMouseListener(Color.RED,jPanel));
        blue.addMouseListener(new ColorMenuMouseListener(Color.BLUE,jPanel));
        gray.addMouseListener(new ColorMenuMouseListener(Color.GRAY,jPanel));
        exit.addMouseListener(new ExitMouseListener());
        jMenuBar.add(jMenu1);
        jMenuBar.add(jMenu);
        jFrame.setVisible(true);
    }
}
