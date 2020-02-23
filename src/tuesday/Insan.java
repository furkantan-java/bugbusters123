package tuesday;

class muhendis extends Insan{
    int maas;

    public muhendis(int boy, int kilo){
        super(boy,kilo);
    }

    public muhendis(int boy, int kilo,int maas){
        super(boy,kilo);

    }


    public  muhendis(){
        this(7000);
    }
    public muhendis(int maas){
        if(maas>1000){
            this.maas=maas;
        }else{
            this.maas=7000;
        }
    }
    int zam(){
        maas++;
        return maas;
    }
    int zam(int zamMiktari){
        maas+=zamMiktari;
        return maas;
    }
    int zam(double zamOrani){
        maas*=zamOrani;
        return maas;
    }
    @Override
    void yemek(){
        kilo=kilo+2;
    }
    void yemek(int kilo ){
        this.kilo+=kilo;
    }
}
public class Insan {
    int kilo =20;
        int boy;
    void yemek(){
        kilo++;
    }

public Insan(){}

    public Insan(int kilo, int boy){
        this.kilo = kilo;
        this.boy = boy;
    }
    public static void main(String[] args) {
        Insan ali= new Insan();
        muhendis ayse=new muhendis(1000);


        muhendis mehmet = new muhendis();

        System.out.println("-----------------------");
        System.out.println("ayse.boy = " + ayse.boy);
        System.out.println("ayse.kilo = " + ayse.kilo);

        System.out.println();
        System.out.println("--------------------------");
        ayse.boy=170;
        System.out.println("muhendis classdaki aysenin boyu: "+ayse.boy);
        ayse.kilo=69;
        ayse.yemek();
        System.out.println("muhendis classdaki aysenin kilosu: "+ayse.kilo);
        //ayse.maas=10000;
        // ayse.zam(2000);
        System.out.println("muhendis classdaki aysenin maasi: "+ayse.maas);
        ayse.zam(1.5);
        System.out.println(ayse.maas);
    }
}
