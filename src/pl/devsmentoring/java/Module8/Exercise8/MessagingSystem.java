package pl.devsmentoring.java.Module8.Exercise8;

public abstract class MessagingSystem {

    protected int counter = 0;
    abstract void Message();
     protected void execute(){
        Message();
        counter++;
    }


}