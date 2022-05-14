import javax.swing.*;
import java.awt.event.*;
public class QQ {
    public static void main(String[] args) {
        Login login = new Login();
    }
}
class Register {
    public Register() {
        JFrame register =new JFrame("QQ注册");
        register.setSize(500,400);
        register.setVisible(true);
    }
}
class Zjm {
    public Zjm() {
        JFrame zjm = new JFrame("QQ");
        zjm.setSize(300, 800);
        zjm.setVisible(true);
    }
}
class Login{
    public Login() {
        JFrame login = new JFrame("QQ登录");
        login.setSize(300,150);
        JLabel l_username = new JLabel("用户名:");
        JLabel l_password = new JLabel("密码:    ");
        JTextField t_username = new JTextField(20);
        JPasswordField t_password = new JPasswordField(20);
        JButton b1 = new JButton("登录");
        JButton b2 = new JButton("注册");
        JButton b3 = new JButton("取消");
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String PASS = "fzyadmin";
                String USER = "admin";
                String a;
                String b;
                a = t_username.getText();
                b = t_password.getText();
                if ((a.equals(USER)) && (b.equals(PASS))) {
                    JOptionPane.showMessageDialog(null, "登陆成功！");
                    Zjm zjm = new Zjm();
                } else {
                    JOptionPane.showMessageDialog(null, "账号密码错误！");
                }
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Register register = new Register();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                login.dispatchEvent(new WindowEvent(login,WindowEvent.WINDOW_CLOSING));
            }
        });
        JPanel p1 = new JPanel();
        login.add(p1);
        p1.add(l_username);
        p1.add(t_username);
        p1.add(l_password);
        p1.add(t_password);
        p1.add(b1);
        p1.add(b2);
        p1.add(b3);
        login.setVisible(true);
        p1.add(b2);
        p1.add(b3);
        login.setVisible(true);
        login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
