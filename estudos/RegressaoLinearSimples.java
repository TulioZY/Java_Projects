import javax.swing.JOptionPane;

public class RegressaoLinearSimples {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // programa de regressão linear simples
        int i,n;
        double Y_z,somaX,somaY,somaX2,somaY2,somaXY,b0,b1,Z,R,R2;
        boolean erro;
        double X[] = new double[1000];
        double Y[] = new double[1000];
        n = Integer.parseInt(JOptionPane.showInputDialog("Informe o total de pares X,Y: "));
        
        for(i=0; i < n; i++){
            X[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe valor de X: "));
            Y[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe valor de Y: "));
        }
        somaX  = 0; somaY  = 0; somaX2 = 0; somaY2 = 0; somaXY = 0;
        for(i=0; i < n; i++){
            somaX  = somaX + X[i]; 
            somaY  = somaY + Y[i]; 
            somaX2 = somaX2 + Math.pow(X[i],2);
            somaY2 = somaY2 + Math.pow(Y[i],2);
            somaXY = somaXY + X[i]*Y[i];
        }

        b1 = (somaX*somaY - n*somaXY)/(Math.pow(somaX,2) - n*somaX2);
        b0 = (somaY - b1*somaX)/n;
        R = n*somaXY - somaX*somaY;
        R = R/(Math.sqrt(n*somaX2 - Math.pow(somaX,2))*Math.sqrt(n*somaY2 - Math.pow(somaY,2)));
        R2 = Math.pow(R,2);

        System.out.println("Intercepto = "+b0);
        System.out.println("Inclinação da reta = "+b1);
        System.out.println("Coeficiente de determinação (r2) = "+R2);
        
        Z = Double.parseDouble(JOptionPane.showInputDialog("Informe um valor (z) para usar na equação: "));
        Y_z = b0 + b1*Z;
        System.out.println("resultado: para Z = "+Z+" o valor de Y = " + Y_z);
    }
    
}