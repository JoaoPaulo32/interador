pacote  br . com . aragia . iterador ;
;

public  class  CollectionofAddress  implementa  Container {

	public  String  address [] = { "Céu" , "Coordenação" , "ProReitoria" , "Trabalho" , "Campo Grande" };

	public  Iterator  getIterator () {

		return  new  CollectionofAddressIterate ();
	}

	 classe  privada CollectionofAddressIterate  implementa  Iterator {

		int  ; _

		public  boolean  hasNext () {
			if ( i < endereço . comprimento ) {
				retorna  verdadeiro ;
			}
			retornar  falso ;
		}

		 objeto  público próximo () {
			if ( this . hasNext ()) {
				 endereço de retorno [ i ++];
			}
			retornar  nulo ;
		}

	}

}
