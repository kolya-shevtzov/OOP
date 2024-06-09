package model;

public class Slizerin extends Hogwarts {
    private int determined;
    private int cunning;
    private int ambitious;
    private int powerHungry;
    private int resourceful;
    public Slizerin(String name, int witchcraft, int transgress, int determined, int cunning, int ambitious, int powerHungry, int resourceful) {
        super(name, witchcraft, transgress);
        this.determined=determined;
        this.cunning=cunning;
        this.ambitious=ambitious;
        this.powerHungry=powerHungry;
        this.resourceful=resourceful;

    }
    public void printPowerDifference(Hogwarts student){
        if(this.getPower()>student.getPower()){
            System.out.printf("%s лудчше Слизериновиц, чем %s%n",this.getName(),student.getName());}
        else if (this.getPower()<student.getPower()){
            System.out.printf("%s лудчше Слизериновиц, чем %s%n", student.getName(), this.getName());}
        else {
            System.out.printf("%s такой же Слизериновиц как %s%n",this.getName(),student.getName());
        }
    }
    protected int getPower(){
        return
                determined+cunning+ambitious+powerHungry+resourceful;
    }
    public String toString() {
        return "grifindor{" +
                "name="+getName()+
                ", witchcragt="+getWitchcraft()+
                ", transgress="+getTransgress()+
                ", determined="+determined+
                ", cunning=" + cunning +
                ", ambitious=" + ambitious +
                ", powerHungry=" + powerHungry +
                ", resourcegul"+resourceful+
                '}';
    }
}
