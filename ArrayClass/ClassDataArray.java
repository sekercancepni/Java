class ClassDataArray
   {
   private Person[] a;               // reference to array
   private int nElems;               // number of data items
 
   public ClassDataArray(int max)    // constructor
      {
      a = new Person[max];               // create the array
      nElems = 0;                        // no items yet
      }
//--------------------------------------------------------------
   public Person find(String searchName)
      {                              
	 //to be implemented
	   return null;
      }  // end find()
//--------------------------------------------------------------                                    // put person into array
   public void insert(String last, String first, int age)
      {
	 //to be implemented                
      }
//--------------------------------------------------------------
   public boolean delete(String searchName)
      {                              // delete person from array
      int j;
      for(j=0; j<nElems; j++)            // look for it
         if( a[j].getLast().equals(searchName) )
            break;
      if(j==nElems)                      // can't find it
         return false;
      else                               // found it
         {
         for(int k=j; k<nElems; k++)     // shift down
            a[k] = a[k+1];
         nElems--;                       // decrement size
         return true;
         }
      }  // end delete()
//--------------------------------------------------------------
   public void displayA()            // displays array contents
      {
      for(int j=0; j<nElems; j++)       // for each element,
         a[j].displayPerson();          // display it
      }
//--------------------------------------------------------------
   public void insertion_sort(){
	   //to be implemented
	   
   } //end insertion_sort()
 //--------------------------------------------------------------
   }  // end class ClassDataArray 
