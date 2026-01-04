import controller.ShapeController;
import model.*;
import view.ShapeView;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Rectangle("Red", 4, 5),
                new Circle("Blue", 3),
                new Triangle("Green", 3, 6),
                new Rectangle("Yellow", 2, 8),
                new Circle("Red", 5),
                new Triangle("Blue", 4, 7),
                new Rectangle("Green", 6, 2),
                new Circle("Yellow", 2),
                new Triangle("Red", 5, 4),
                new Rectangle("Blue", 3, 3)
        };

        ShapeView view = new ShapeView();
        ShapeController controller = new ShapeController();

        view.printMessage("=== All shapes ===");
        view.printShapes(shapes);

        view.printMessage("\nTotal area: " + controller.calcTotalArea(shapes));
        view.printMessage("Total Rectangle area: " +
                controller.calcAreaByType(shapes, Rectangle.class));

        Arrays.sort(shapes, new ShapeAreaComparator());
        view.printMessage("\n=== Sorted by area ===");
        view.printShapes(shapes);

        Arrays.sort(shapes, new ShapeColorComparator());
        view.printMessage("\n=== Sorted by color ===");
        view.printShapes(shapes);
    }
}
