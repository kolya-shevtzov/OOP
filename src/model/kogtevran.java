package model;

public class kogtevran extends hogwarts{
    private int intelligense;
    private int wisdom;
    private int wit;
    private int creativity;
    public kogtevran(String name, int Witchcraft, int Transgress,int intelligense,int wisdom, int wit,int creativity) {
        super(name, Witchcraft, Transgress);
        this.intelligense=intelligense;
        this.wisdom=wisdom;
        this.wit=wit;
        this.creativity=creativity;
    }
    public void printPowerDifference(hogwarts student){
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
                ", Witchcragt="+getWitchcraft()+
                ", Transgress="+getTransgress()+
                ", intelligense="+intelligense+
                ", creativity=" + creativity +
                ", wisdom=" + wisdom +
                ", bravery=" + wit +
                '}';
    }
}
