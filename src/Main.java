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
		int resultCircumference = 2 * a + 2 * b;
		int resultArea = a * b;

		System.out.println("A téglalap kerülete: " + resultCircumference + " cm");

		System.out.println("A téglalap területe: " + resultArea + " cm^2");


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


		/**Gömb térfogat számítás.
		 *
		 *Deklaráltam egy int típusú változót,
		 * a gömb térfogatszámítás szabálya szerint elvégeztem a műveletet,
		 * a kapott értékkel inicializáltam a sphereVolume változót,
		 * amit kiírattam konzolra.*/

		int radius = 9;
		final double PI = 3.14;
		double sphereVolume = 4 * radius * radius * radius * PI / 3;

		System.out.println("\nOutput: \n");
		System.out.println("A " + radius + " egységnyi sugarú gömb térfogata = " + sphereVolume + " egység.");


		/**Celsius -- fahrenheit átváltás.
		 *
		 *Deklaráltam két int típusú változót és két konstanst,
		 * az átváltási szabálynak megfelelően elvégeztem a műveletet,
		 * a kapott értékekkel inicializáltam a FahrenheitTemp és CelsiusTemp változókat,
		 * amit kiírattam konzolra.*/

		int tempInCelsius = 48;
		int tempInFahrenheit = 121;
		final int BASE = 32;
		final double CONVERSATION_FACTOR = 9.0 / 5.0;
		double FahrenheitTemp = tempInCelsius * CONVERSATION_FACTOR + BASE;
		double CelsiusTemp = (tempInFahrenheit - BASE) / CONVERSATION_FACTOR;

		System.out.println("\nOutput:\n");
		System.out.println(tempInCelsius + " celsius = " + FahrenheitTemp + " fahrenheit");
		System.out.println(tempInFahrenheit + " fahrenheit = " + CelsiusTemp + " celsius");


		/**Egy üdvözlet keretbe foglalva.
		 * A "Hello world in a frame" üdvözlő szöveget '*' -gal határolt
		 * keretbe írattam ki konzolra escape sequence segítségével.
		 * minden \n -nél új sorba írtam külön stringekbe a jobb átláthatóság végett.
		 * A stringeket konkatenáltam. */

		System.out.println("\n*************\n" +
				"* Hello\t\t*\n" +
				"* world\t\t*\n" +
				"* in\t\t*\n" +
				"* a\t\t\t*\n" +
				"* frame\t\t*\n" +
				"*************");


		/**Egy karakter ASCII kódjának kiíratása.
		 *
		 * Deklaráltam egy char típusú és egy int típusú változót,
		 * majd kiírattam konzolra.*/

		char charInAscii = 'é';
		int charValue = 130;

		System.out.println("\nOutput:\n");
		System.out.println("Az \'" + charInAscii + "\' karakter ASCII kódja: " + charValue );
	}
}
