public abstract class btechDecorator implements btech{
    protected btech decoratedbtech;
    public btechDecorator(btech decoratedbtech){

        this.decoratedbtech = decoratedbtech;
    }
    public void getcourse(){
        decoratedbtech.getcourse();
    }}