package designpatterns.creational.factory;

/**
 * Object Creation based on Condition then use Factory Pattern
 *
 *          Shape Factory        HAS-A             Shape
 *         - Shape getFactory()  =======>       - void draw()
 *                                           ^       ^      ^
 *                                          /        |       \
 *                                        /          |        \
 *                                      Circle     Square     Rectangle
 *                                     - draw()   - draw()    - draw()
 *
 *
 */
public class FactoryPattern {
}
