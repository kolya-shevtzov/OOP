package model;

public class slizerin extends hogwarts{
    private int determined;
    private int cunning;
    private int ambitious;
    private int powerHungry;
    private int resourceful;
    public slizerin(String name, int Witchcraft, int Transgress,int determined,int cunning, int ambitious,int powerHungry,int resourceful) {
        super(name, Witchcraft, Transgress);
        this.determined=determined;
        this.cunning=cunning;
        this.ambitious=ambitious;
        this.powerHungry=powerHungry;
        this.resourceful=resourceful;

    }
    public void printPowerDifference(hogwarts student){
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
                ", Witchcragt="+getWitchcraft()+
                ", Transgress="+getTransgress()+
                ", determined="+determined+
                ", cunning=" + cunning +
                ", ambitious=" + ambitious +
                ", powerHungry=" + powerHungry +
                ", resourcegul"+resourceful+
                '}';
    }
}
