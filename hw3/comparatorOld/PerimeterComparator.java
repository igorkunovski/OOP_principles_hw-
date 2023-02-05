package comparatorOld;

import figureOld.Figure;
import figureOld.Perimeterable;
import java.util.Comparator;

public class PerimeterComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure fig1, Figure fig2) {

        if (fig1 instanceof Perimeterable && fig2 instanceof Perimeterable) {
            return Double.compare(((Perimeterable) fig1).getPerimeter(), ((Perimeterable) fig2).getPerimeter());
        }
        return 0;
    }
}
