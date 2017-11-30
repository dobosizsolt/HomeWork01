public class Main {

    public static void main(String[] args) {

	/**Téglalap kerület, terület számítás.
     *
     * Deklaráltam két int típusú változót,
	 * a kerület és terület számítás alapján elvégeztem a műveletet,
     * a kapott értékkel inicializáltam a resultKer és resultTer változókat,
     * amiket kiírattam konzolra*/

	    int a = 5;
	    int b = 9;
	    int resultCircumference = 2*a + 2*b;
	    int resultArea = a * b;

	    System.out.println("A téglalap kerülete: " + resultCircumference + " cm");

	    System.out.println("A téglalap területe: " + resultArea + " cm^2" );

    }
}
