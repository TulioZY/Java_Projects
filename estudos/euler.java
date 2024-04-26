public class euler {
    public static void main(String[] args) {
        float E, N, K, J, fat;
        K = 1;
        E = 1;
        N = 0;
        while (E <=2){
        if (K == N){
            break;
        }
        fat = 1;
        J = K;
        while(E <=2){
        if (J <= 1){
            break;
        }
        fat = fat * J;
        J = J - 1;
        }
        E = E + 1/fat;
        K = K + 1;
    }
    System.out.println("Aproximacao do numero de Euler: E = " + E);
    }
    
}
