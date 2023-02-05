package comparatorOld;

import figureOld.Figure;

import java.util.Comparator;

public class SquareComparator implements Comparator<Figure> {
    @Override
    public int compare(Figure fig1, Figure fig2) {
        return Double.compare(fig1.getSquare(), fig2.getSquare());
    }
}
