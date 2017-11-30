public class Main {

    public static void main(String[] args) {

	/**Téglalap kerület, terület számítás.
     *
     * Deklaráltam két int típusú változót,
	 * a kerület és terület számítás alapján elvégeztem a műveleteket,
     * a kapott értékekkel inicializáltam a resultCircumference és resultArea változókat,
     * amiket kiírattam konzolra*/

	    int a = 5;
	    int b = 9;
	    int resultCircumference = 2*a + 2*b;
	    int resultArea = a * b;

	    System.out.println("A téglalap kerülete: " + resultCircumference + " cm");

	    System.out.println("A téglalap területe: " + resultArea + " cm^2" );


		/**Űrtartalom átváltás.
		 *
		 *Deklaráltam egy float típusú változót,
		 * az átváltási szabálynak megfelelően elvégeztem a műveleteket,
		 * a kapott értékekkel inicializáltam a resultMilliliter, resultCentiliter,
		 * resultLiter és resultHektoliter változókat,
		 * amiket kiírattam konzolra.*/

		float dl = 60.5f;
		float resultMilliliter = dl * 100;
		float resultCentiliter = dl * 10;
		float resultLiter = dl / 10;
		float resultHektoliter = dl / 1000;

		System.out.println("\nOutput:\n ");
		System.out.println(dl + " dl = " + resultMilliliter + " ml");
		System.out.println(dl + " dl = " + resultCentiliter + " cl");
		System.out.println(dl + " dl = " + resultLiter + " l");
		System.out.println(dl + " dl = " + resultHektoliter + " hl");

    }
}
