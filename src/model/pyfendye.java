package model;

public class pyfendye extends hogwarts {
    private int diligense;
    private int loyalty;
    private int honesty;
    public pyfendye(String name, int Witchcraft, int Transgress,int diligense,int loyalty, int honesty) {
        super(name, Witchcraft, Transgress);
        this.diligense=diligense;
        this.loyalty=loyalty;
        this.honesty=honesty;
    }
    public void printPowerDifference(hogwarts student){
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
                ", Witchcragt="+getWitchcraft()+
                ", Transgress="+getTransgress()+
                ", ditigense=" + diligense +
                ", loyalty=" + loyalty +
                ", honesty=" + honesty +
                '}';
    }
}