public class İndirim {
    public static void main(String[] args) {
        double  sipariştutarı =800.0;
        double indirimEksik=400;
        double indirimyüzdesi= 0.25;
        if (indirimEksik <= sipariştutarı ) {
            double indrimiktarı=sipariştutarı * indirimyüzdesi;
             double indirimlitolamı= sipariştutarı - indrimiktarı;
            System.out.println("indirimtoplamı:"+indirimlitolamı);
        }else {
            System.out.println("normal tutar"+ sipariştutarı);
        }
    }
}