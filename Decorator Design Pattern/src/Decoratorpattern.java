public class Decoratorpattern{
    public static void main(String args[]){
        btech coursecse = new CSE();
        btech courseict = new ICT();

        btech electiveCSE = new courseDecorator(new CSE());
        btech electiveICT = new courseDecorator(new ICT());

        System.out.println("CSE course without elective");
        coursecse.getcourse();
        System.out.println("CSE course with elective");
        electiveCSE.getcourse();

        System.out.println("ICT course without elective");
        courseict.getcourse();
        System.out.println("ICT course with elective ");
        electiveICT.getcourse();
    }}