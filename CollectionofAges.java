pacote  br . com . aragia . iterador ;

public  class  CollectionofAges  implementa  Container {

	public  int  idade [] = { 21 , 38 , 46 , 967 , 99 };


	public  Iterator  getIterator () {

		return  new  CollectionofAgeIterate ();
	}

	 classe  privada CollectionofAgeIterate  implementa  Iterator {

		int  ; _

		public  boolean  hasNext () {
			if ( i < idade . comprimento ) {
				retorna  verdadeiro ;
			}
			retornar  falso ;
		}

		 objeto  público próximo () {
			if ( this . hasNext ()) {
				 idade de retorno [ i ++];
			}
			retornar  nulo ;
		}
	}
}
