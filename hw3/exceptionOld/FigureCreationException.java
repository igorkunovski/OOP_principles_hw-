package exceptionOld;

public class FigureCreationException extends IllegalArgumentException{
    public FigureCreationException(){
        super("Problem with figure construction");
    }
}
