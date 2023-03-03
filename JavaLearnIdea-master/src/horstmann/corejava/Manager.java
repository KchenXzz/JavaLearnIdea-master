package horstmann.corejava;

public class Manager extends Employee {
    /**
     * 继承员工类的经理类
     */

    protected double bonus;
    public Manager(String name,double salary,int year,int month,int day){
        super(name,salary,year,month,day);
        bonus=0;
    }
    public Manager(String name,double s){
        super(name,s);
        bonus=0;
    }
    public Manager(double s) {
        super(s);
        bonus=0;
    }
    public Manager(String n){
       super(n);
       bonus=0;
    }
    public Manager(){
        super();
        bonus=0;
    }
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double b){
        bonus=b;
    }


    public double getSalary(){
        double baseSalary=super.getSalary();
        return baseSalary+bonus;
    }
    public boolean equals(Object otherObject){
        if(!super.equals(otherObject)) return false;
        Manager other=(Manager)otherObject;
        return bonus==other.bonus;
    }
    public String toString(){
        return super.toString()+"[bonus="+bonus+"]";
    }
}
