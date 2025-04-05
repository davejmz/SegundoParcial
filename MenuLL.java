import java.util.Scanner;

public class MenuLL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList lista = new LinkedList();
        int opcion;

        do {
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Agregar número al inicio");
            System.out.println("2. Agregar número al final");
            System.out.println("3. Agregar número en posición");
            System.out.println("4. Eliminar número");
            System.out.println("5. Mostrar lista");
            System.out.println("6. Verificar si existe número");
            System.out.println("7. Revertir lista");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el número: ");
                    int numInicio = scanner.nextInt();
                    lista.agregarAlInicio(numInicio);
                    System.out.println("Número agregado al inicio.");
                    break;
                case 2:
                    System.out.print("Ingrese el número: ");
                    int numFinal = scanner.nextInt();
                    lista.agregarAlFinal(numFinal);
                    System.out.println("Número agregado al final.");
                    break;
                case 3:
                    System.out.print("Ingrese el número: ");
                    int numPosicion = scanner.nextInt();
                    System.out.print("Ingrese la posición: ");
                    int posicion = scanner.nextInt();
                    lista.agregarEnPosicion(numPosicion, posicion);
                    System.out.println("Número agregado en posición " + posicion + ".");
                    break;
                case 4:
                    System.out.print("Ingrese el número a eliminar: ");
                    int numEliminar = scanner.nextInt();
                    lista.eliminarPorValor(numEliminar);
                    System.out.println("Número eliminado.");
                    break;
                case 5:
                    System.out.println("Lista actual:");
                    lista.mostrarLista();
                    break;
                case 6:
                    System.out.print("Ingrese el número a verificar: ");
                    int numVerificar = scanner.nextInt();
                    if (lista.contieneValor(numVerificar)) {
                        System.out.println("El número " + numVerificar + " existe en la lista.");
                    } else {
                        System.out.println("El número " + numVerificar + " no existe en la lista.");
                    }
                    break;
                case 7:
                    lista.invertirLista();
                    System.out.println("Lista invertida.");
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 8);

        scanner.close();
    }
}