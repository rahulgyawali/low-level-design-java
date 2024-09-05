package designpatterns.creational.abstractfactory;

/**
 * This is used when we need Factory of Factories
 *
 * Different Type of Objects that can be grouped together in a Category
 *
 *  Vehicle Factory                             ======>         VEHICLE FACTORY
 *  - VehicleFactory getVehicleFactory()                    - Vehicle getVehicle()
 *
 *                                                          /                       \
 *                                                         /                         \
 *                                                        /                           \
 *                                                 Luxury Factory                   Ordinary Factory
 *                                                      ^             Vehicle               ^
 *                                                      |      /                     \      |
 *                                                      |     /                      \      |
 *                                                     LuxuryV1                     OrdinaryV1
 *                                                     LuxuryV2                     OrdinaryV2
 *
 */
public class AbstractFactory {
}
