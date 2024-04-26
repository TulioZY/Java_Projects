import javax.swing.JOptionPane;
public class example1 {
    public static void main(String args[]) {
        //Leitura
    String nome = JOptionPane.showInputDialog("Nome");
    int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade"));
    double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
    char sexo = JOptionPane.showInputDialog("Sexo M/F").charAt(0);
    boolean f = Boolean.parseBoolean(JOptionPane.showInputDialog("formando?true/false"));

    //Escrita
    String msg = "Nome: " + nome + "\nIdade: " + idade + " anos" + "\nPeso: " + peso + " kg" +"\nSexo: "+sexo+ "\nFormando: "+f;
    JOptionPane.showMessageDialog(null, msg);

    }
}
