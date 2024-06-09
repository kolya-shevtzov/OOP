package model;

public class Grifindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    public Grifindor(String name, int witchcraft, int transgress, int nobility, int honor, int bravery) {
        super(name, witchcraft, transgress);
        this.bravery=bravery;
        this.honor=honor;
        this.nobility=nobility;
    }
    public void printPowerDifference(Hogwarts student){
        if(this.getPower()>student.getPower()){
            System.out.printf("%s лудчше Грифиндорец, чем %s%n",this.getName(),student.getName());}
        else if (this.getPower()<student.getPower()){
            System.out.printf("%s лудчше Грифиндорец, чем %s%n", student.getName(), this.getName());}
        else {
            System.out.printf("%s такой же Грифиндорец как %s%n",this.getName(),student.getName());
        }
    }
    protected int getPower(){
        return
                bravery+honor+nobility;
    }

    @Override
    public String toString() {
        return "grifindor{" +
                "name="+getName()+
                ", witchcragt="+getWitchcraft()+
                ", transgress="+getTransgress()+
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
