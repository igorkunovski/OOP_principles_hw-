package comparator;

import figure.CircleLength;
import figure.Figure;
import java.util.Comparator;

public class CircleLengthComparator implements Comparator<Figure> {

    @Override
    public int compare(Figure fig1, Figure fig2) {

        if (fig1 instanceof CircleLength && fig2 instanceof CircleLength) {
            return Double.compare(((CircleLength) fig1).getCircleLength(), ((CircleLength) fig2).getCircleLength());
        }
        return 0;
    }
}
