package Ecuaciones_lineales;

public class Lanzador_gaus {
    public static void main(String[] args){
        //1.  Mandamos a llamar a la función que nos entrega la matriz aumentada [A | b]

        double[][] matriz = defmatrizz.defmatriz();
        //2. Aplicar la eliminación gaussiana (fase de tripulación superior)
        //Convierte los elementos debajo de la diagonal principal en ceros.
        Gauss.eliminacionGaussiana(matriz);

        //3. Obtener los resultados mediante sustitución regresiva (la bajada)
        // Despeja las incognitas de abajo hacia arriba a partir de la matriz triangular

        double[] solucionea = Gauss.sustitucionRegresiva(matriz);

        // 4. Imprimir resultados finales en consola de manera limpia
        System.out.println("Soluciones del sistema: ");
        for (int i = 0; i < solucionea.length; i++){
            System.out.println("x" + (i + 1) + " = " + solucionea[i]);
        }
    }
}
