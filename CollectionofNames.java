pacote  br . com . aragia . iterador ;

public  class  CollectionofNames  implementa  Container {
	public  String  name [] = { "Roberto Aragy" , "Enilda Cáceres" , "Claudia Nasu" ,
			"Roberto Murilo" , "Estácio de Sá" };


	public  Iterator  getIterator () {

		return  new  CollectionofNamesIterate ();
	}

	 classe  privada CollectionofNamesIterate  implementa  Iterator {

		int  ; _

		public  boolean  hasNext () {
			if ( i < nome . comprimento ) {
				retorna  verdadeiro ;
			}
			retornar  falso ;
		}

		 objeto  público próximo () {
			if ( this . hasNext ()) {
				 nome de retorno [ i ++];
			}
			retornar  nulo ;
		}
	}
}
