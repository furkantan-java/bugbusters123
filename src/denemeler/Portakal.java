package denemeler;

public class Portakal{

    static String portakalinSekli;
    int portakalinAgirligi;
    String portakalinRengi;
    char portakalinIcindekiVitamin;

    //Şimdi bu objemizle ilgili biraz aksiyon alalım ki daha iyi anlayalım
//portakalımızda hangi özellikler olacağını belirttik portakal classımızda belirttik
//şimdi portakalımızın fonksiyonlarından bahsedelim
//belirteceğimiz methodlar yarattığımız bütün portakalların özünde olacak
//benim portakalımda da sizin portakalınızda da
//kullanıp kullanmamak portakalla yapmak istediğimiz şeye göre bize kalacak

//Portakalımızı yemek için yarattık diyelim
//yememiz içinde kesmemiz gerekiyor diye tasarladık
//bu fonksiyonu bu classımızın içine koyunca, bu kesme fonksiyonunu portakalın kullanıldığı heryerde kullanabiliyoruz

        public void portakalKesmeMethodu(){
            System.out.println("Portakalınız yemeniz için kesiliyor");
        }

//yukarıdaki methoudu portakalımız vasıtasıyla çağırdığımızda kesme printini verecek

        //aynı şekilde sıkma methodu da ekleyelim, ben methodları fonksiyon olarak da değerlendiriyorum kafada daha güzel canlanıyor
        public void portakalSıkmaMethodu () {
            System.out.println("Portakalınız sıkılıyor");
        }
//yukarıdaki methoudu portakalımız vasıtasıyla çağırdığımızda sıkma printini verecek




//tartma methodu ekleyelim tartmak için portakalımızın ağırlığına bakmak istiyoruz o yüzden ağırlık field ını çağırmamız gerekecek

        public int portakalTartma(int portakalınAgirligi){
            return portakalınAgirligi;
        }

//yukarıdaki methoudu portakalımız vasıtasıyla çağırdığımızda bize ağırtlığı int cinsinden verecek




        //ve aşılama methoduyla portakalımızın içindeki vitamini değiştirebilme fonksiyonu olsun mesela
        public void portakalAsilama(){
            portakalinIcindekiVitamin = 'A';
        }

//yukarıdaki methoudu portakalımız vasıtasıyla çağırdığımızda portakalımız içindeki vitamin değişmiş olacak
public static void main(String[] args) {
    Portakal a = new Portakal();
    a.portakalAsilama();
    System.out.println(a.portakalinIcindekiVitamin);
}


    }



