package model;

public class Kogtevran extends Hogwarts {
    private int intelligense;
    private int wisdom;
    private int wit;
    private int creativity;
    public Kogtevran(String name, int witchcraft, int transgress, int intelligense, int wisdom, int wit, int creativity) {
        super(name, witchcraft, transgress);
        this.intelligense=intelligense;
        this.wisdom=wisdom;
        this.wit=wit;
        this.creativity=creativity;
    }
    public void printPowerDifference(Hogwarts student){
        if(this.getPower()>student.getPower()){
            System.out.printf("%s лудчше Когтевранец, чем %s%n",this.getName(),student.getName());}
        else if (this.getPower()<student.getPower()){
            System.out.printf("%s лудчше Когтевранец, чем %s%n", student.getName(), this.getName());}
        else {
            System.out.printf("%s такой же Когтевранец как %s%n",this.getName(),student.getName());
        }
    }
    protected int getPower(){
        return
                intelligense+wisdom+wit+creativity;
    }
    @Override
    public String toString() {
        return "grifindor{" +
                "name="+getName()+
                ", witchcragt="+getWitchcraft()+
                ", transgress="+getTransgress()+
                ", intelligense="+intelligense+
                ", creativity=" + creativity +
                ", wisdom=" + wisdom +
                ", bravery=" + wit +
                '}';
    }
}
