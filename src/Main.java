import model.hogwarts;
import model.grifindor;
import model.pyfendye;
import model.slizerin;
import model.kogtevran;
public class Main {
    public static void main(String[] args) {
grifindor harryPoter= new grifindor("Гари Потер",1,1,1,1,1);
grifindor germionaGrendger= new grifindor("Гермиона Грэнджэр",5,5,5,5,5);
pyfendye sedrikDigori= new pyfendye("Седрик Диггори",2,2,2,2,2);
pyfendye zahariaSmit= new pyfendye("Захария Смит",6,6,6,6,6);
slizerin drakoMalfoy= new slizerin("Драко Малфой",3,3,3,3,3,3,3);
slizerin gregoriGoil=new slizerin("Грэгори Гоил",7,7,7,7,7,7,7);
kogtevran choChang= new kogtevran("Чжоу Чан",4,4,4,4,4,4);
kogtevran MarcusBelbi=new kogtevran("Маркус Бэлби",8,8,8,8,8,8);
hogwarts leha= new hogwarts("леха",99,99);
hogwarts sania= new hogwarts("саня",98,98);
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