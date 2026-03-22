import javax.swing.JOptionPane;
public class GUI {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your name");
        JOptionPane.showMessageDialog(null, "Hello" +name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Your Age "));
        JOptionPane.showMessageDialog(null,"Your age is" + age);
    }
}
