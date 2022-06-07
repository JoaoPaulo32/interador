pacote  br . com . aragia . iterador ;

public  class  IteratorPatternDemo {  
    public  static  void  main ( String [] args ) {  
        CollectionofDesignation  cmpnyRepository = new  CollectionofDesignation ();  

        for ( Iterator  iter = cmpnyRepository . getIterator (); iter . hasNext ();){  
            String  designação = ( String ) iter . próximo ();  
            Sistema . fora . println ( "Designação:" + designação );  
         }      
  }  
}
