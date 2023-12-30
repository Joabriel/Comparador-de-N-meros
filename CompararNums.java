import javax.swing.JOptionPane;
class CompararNums{
    public static void main(String[]args){
        int nums = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Números: "));
        int repNums = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese Verificación de Números: "));
        if(nums == repNums){
            JOptionPane.showMessageDialog(null, "Coinciden: "+nums+" == "+ repNums);
        }else{
            JOptionPane.showMessageDialog(null, "No Coinciden: "+nums+" != "+repNums);
        }
    }
}