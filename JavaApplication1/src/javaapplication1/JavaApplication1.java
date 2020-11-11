package javaapplication1;

public class JavaApplication1 {
    


    public static void main(String[] args) {
        // TODO code application logic here
        float d = 0f;
        d = dividir(5,2);
        System.out.println(d);
        
    }
    
    public static float dividir(int num1, int num2) {
        float resultado = 0;
        
        resultado =  num1/num2;
        return resultado;
    }

}
