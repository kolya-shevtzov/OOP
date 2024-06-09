package model;

public class Pyfendye extends Hogwarts {
    private int diligense;
    private int loyalty;
    private int honesty;
    public Pyfendye(String name, int witchcraft, int transgress, int diligense, int loyalty, int honesty) {
        super(name, witchcraft, transgress);
        this.diligense=diligense;
        this.loyalty=loyalty;
        this.honesty=honesty;
    }
    public void printPowerDifference(Hogwarts student){
        if(this.getPower()>student.getPower()){
            System.out.printf("%s лудчше Пуфендуец, чем %s%n",this.getName(),student.getName());}
        else if (this.getPower()<student.getPower()){
            System.out.printf("%s лудчше Пуфендуец, чем %s%n", student.getName(), this.getName());}
        else {
            System.out.printf("%s такой же Пуфендуец как %s%n",this.getName(),student.getName());
        }
    }
    protected int getPower(){
        return
                diligense+loyalty+honesty;
    }
    @Override
    public String toString() {
        return "grifindor{" +
                "name="+getName()+
                ", witchcragt="+getWitchcraft()+
                ", transgress="+getTransgress()+
                ", ditigense=" + diligense +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}