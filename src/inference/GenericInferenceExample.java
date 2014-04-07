	public class GenericInferenceExample{
		public static void main(String []args){
			// inference based on variable type
			MyList<String> ls1 = MyList.nil();	
			// inference based on method context, won't compile under Java < 8
			MyList<Integer> ls2 = MyList.cons(42, MyList.nil());	
			// there were plans to introduce chain call/target type inference
			// but currently it is not supported so the line won't compile under Java < 8 and Java 8 
			// Integer a = MyList.nil().head(); 
			Integer a = MyList.<Integer>nil().head();	
		}
	}