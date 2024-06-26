package model;

public class Hogwarts {
   private String name;
    private int witchcraft;
    private int transgress;

    public Hogwarts(String name, int witchcraft, int transgress) {
        this.name = name;
        this.witchcraft=witchcraft;
        this.transgress=transgress;
    }

    protected String getName() {
        return name;
    }

    protected int getWitchcraft() {
        return witchcraft;
    }

    protected int getTransgress() {
        return transgress;
    }
    public void printPowerDifference(Hogwarts student){
        if(this.getPower()>student.getPower()){
            System.out.printf("%s обладает большей мощностью магии, чем %s%n",this.getName(),student.getName());}
        else if (this.getPower()<student.getPower()){
            System.out.printf("%s обладает меньшей мощностью магии, чем %s%n", student.getName(), this.getName());}
        else {
            System.out.printf("%s обладает такой же мощностью магии как %s%n",this.getName(),student.getName());
        }
    }
    protected int getPower(){
        return
        transgress+witchcraft;
    }
    @Override
    public String toString() {
        return "hogwarts{" +
                "name='" + name + '\'' +
                ", witchcraft=" + witchcraft +
                ", transgress=" + transgress +
                '}';
    }
}
