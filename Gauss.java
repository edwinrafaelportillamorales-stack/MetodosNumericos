package Ecuaciones_lineales;

public class Gauss {
    public static void eliminacionGaussiana(double[][] matriz){
        int n = matriz.length; // Obtiene el tamaño del sistema (numero de filas)

        //CICLO 1 (i): Selecciona el renglón pivote actual ( la diagonal principal )
        for (int i = 0; i < n; i++){
            //CICLO 2 (j): Recorre todos los renglones que estan ABAJO del pivote actual
            for (int j = i + 1; j < n; j++){

                // Calcula el factor de proporción para anular el coeficiente de esta columna
                double factor = matriz[j][i] / matriz[i][i];
                //CICLO 3 (K): Recorre COLUMNA POR COLUMNA la fila completa
                // para aplicar a operación matemática: R_j = R_j - (factor * R_i )
                for (int k = i; k <= n; k++) {
                matriz[j][k] -= factor * matriz[i][k];
                }
            }
        }
    }
//Metodo de sustitución
public static double[] sustitucionRegresiva(double[][] matriz){
        int n = matriz.length;
        double[] x = new double[n]; //Arreglo para almacenar las respuestas

        //Recorre los renglones de abajo hacia arriba
        for (int i = n - 1; i >= 0; i--){
            double suma = 0;

            //Suma los valores de las incognitas que ya conocemos en este renglon
            for (int j = i + 1; j < n; j++){
                suma += matriz[i][j] * x[j];
            }
            // Despeja la incognita actual
            x[i] = (matriz[i][n] - suma) / matriz[i][i];
        }
        return x; //Regresa el arreglo con las soluciones
    }
}
