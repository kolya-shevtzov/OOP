import model.Hogwarts;
import model.Grifindor;
import model.Pyfendye;
import model.Slizerin;
import model.Kogtevran;
public class Main {
    public static void main(String[] args) {
Grifindor harryPoter= new Grifindor("Гари Потер",1,1,1,1,1);
Grifindor germionaGrendger= new Grifindor("Гермиона Грэнджэр",5,5,5,5,5);
Pyfendye sedrikDigori= new Pyfendye("Седрик Диггори",2,2,2,2,2);
Pyfendye zahariaSmit= new Pyfendye("Захария Смит",6,6,6,6,6);
Slizerin drakoMalfoy= new Slizerin("Драко Малфой",3,3,3,3,3,3,3);
Slizerin gregoriGoil=new Slizerin("Грэгори Гоил",7,7,7,7,7,7,7);
Kogtevran choChang= new Kogtevran("Чжоу Чан",4,4,4,4,4,4);
Kogtevran MarcusBelbi=new Kogtevran("Маркус Бэлби",8,8,8,8,8,8);
Hogwarts leha= new Hogwarts("леха",99,99);
Hogwarts sania= new Hogwarts("саня",98,98);
        System.out.println(harryPoter);
        System.out.println(sedrikDigori);
        System.out.println(drakoMalfoy);
        System.out.println(choChang);
        System.out.println(germionaGrendger);
        System.out.println(zahariaSmit);
        System.out.println(gregoriGoil);
        System.out.println(MarcusBelbi);
        leha.printPowerDifference(sania);
        harryPoter.printPowerDifference(germionaGrendger);
        sedrikDigori.printPowerDifference(zahariaSmit);
        drakoMalfoy.printPowerDifference(gregoriGoil);
        choChang.printPowerDifference(MarcusBelbi);

    }
}