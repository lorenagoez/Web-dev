public class SmartPhone extends SmartDevice{
    int wifi, password;

    public SmartPhone(int numSerie, int precio, String marca, int wifi, int password){
        super(numSerie, precio, marca);
        this.wifi = wifi;
        this.password = password;
    }
}
