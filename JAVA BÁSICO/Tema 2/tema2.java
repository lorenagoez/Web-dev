public class tema2{
    public static void main(String[] args) {
        System.out.println(iva(2000));
    }

    public static double iva(double valor){
            double iva = valor * 0.19;
            double total = iva + valor;
            return total;
        }
}