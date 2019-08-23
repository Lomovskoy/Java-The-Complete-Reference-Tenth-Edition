package chapter18;

/**
 * Класс демонстрирующий применение
 * класса Package.
 *
 * @author Ломовской К.Ю.
 * @since 23.08.2019
 */
class PkgTest {

    public static void main(String[] args) {

        Package[] pkgs;

        pkgs = Package.getPackages();

        for (Package pkg : pkgs) {
            System.out.println(pkg.getName() + " " +
                    pkg.getImplementationTitle() + " " +
                    pkg.getImplementationVendor() + " " +
                    pkg.getImplementationVersion()
            );
        }

    }

}
