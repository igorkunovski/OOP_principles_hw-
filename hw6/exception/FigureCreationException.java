package exception;

public class FigureCreationException extends IllegalArgumentException{
    public FigureCreationException(){
        super("Problem with figure construction");
    }
}
