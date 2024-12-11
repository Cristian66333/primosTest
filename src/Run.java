import javax.swing.JOptionPane;

public class Run{
    public static void main(String[] args) {
        int caso = 1;

        switch (caso) {
            case 1:
                int numeroAdivinar = numAleatorio(13, 35);
                double numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a adivinar"));
                while (numeroAdivinar != numeroUsuario) {
                    numeroUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a adivinar"));
                } 
                JOptionPane.showMessageDialog(null,"Número "+numeroAdivinar+" adivinado");
                break;
        
            default:
                break;
        }
    }
    public static int numAleatorio(int inf, int sup){
        return (int)(inf + (Math.random()*sup)+1);
    }

    public static boolean esPrimo(int numero) {
        if (numero % 2 == 0) {
          if (numero == 2) {
            return true;
          }
          return false;
        }
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
          if (numero % i == 0) {
            return false;
          }
        }
        return true;
      }
}