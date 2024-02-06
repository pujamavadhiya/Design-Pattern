public class courseDecorator extends btechDecorator{
         public courseDecorator(btech decoratedbtech)
		{   super(decoratedbtech);   }
public void getcourse(){
decoratedbtech.getcourse();
setelective(decoratedbtech);
}
private void setelective(btech decoratedbtech){
    System.out.println("Elective course");
}}