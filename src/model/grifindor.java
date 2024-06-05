package model;

public class grifindor extends hogwarts{
    private int nobility;
    private int honor;
    private int bravery;
    public grifindor(String name, int Witchcraft, int Transgress,int nobility,int honor, int bravery) {
        super(name, Witchcraft, Transgress);
        this.bravery=bravery;
        this.honor=honor;
        this.nobility=nobility;
    }
    public void printPowerDifference(hogwarts student){
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
                ", Witchcragt="+getWitchcraft()+
                ", Transgress="+getTransgress()+
                ", nobility=" + nobility +
                ", honor=" + honor +
                ", bravery=" + bravery +
                '}';
    }
}
