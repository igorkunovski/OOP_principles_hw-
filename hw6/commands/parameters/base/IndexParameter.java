package commands.parameters.base;

public class IndexParameter extends CommandParameter{
    private final int index;

    public IndexParameter(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
