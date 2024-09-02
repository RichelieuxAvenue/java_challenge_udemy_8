public class Main {
    /*
    Comparateur Décimal

Vous devez écrire une méthode appelée areEqualByThreeDecimalPlaces avec deux paramètres de type double.

La méthode doit retourner un boolean et elle doit retourner true si les deux nombres de type double sont identiques jusqu’à trois décimales. Sinon, la méthode doit retourner false.

EXEMPLES D’ENTRÉE/SORTIE :

	•	areEqualByThreeDecimalPlaces(-3.1756, -3.175); → devrait retourner true puisque les nombres sont égaux jusqu’à 3 décimales.
	•	areEqualByThreeDecimalPlaces(3.175, 3.176); → devrait retourner false puisque les nombres ne sont pas égaux jusqu’à 3 décimales.
	•	areEqualByThreeDecimalPlaces(3.0, 3.0); → devrait retourner true puisque les nombres sont égaux jusqu’à 3 décimales.
	•	areEqualByThreeDecimalPlaces(-3.123, 3.123); → devrait retourner false puisque les nombres ne sont pas égaux jusqu’à 3 décimales.

CONSEIL : Utilisez un crayon et du papier pour planifier.
CONSEIL : Utilisez le casting (conversion de types).
NOTE : La méthode areEqualByThreeDecimalPlaces doit être définie comme public static, comme nous l’avons fait jusqu’à présent dans le cours.
NOTE : N’ajoutez pas de méthode main au code de la solution.
     */
    public static boolean areEqualByThreeDecimalPlaces(double nombre1, double nombre2){
        long nombre2Entier = (long) (nombre2*1000);
        long nombre1Entier = (long) (nombre1*1000);
        return nombre1Entier == nombre2Entier;
    }
}
