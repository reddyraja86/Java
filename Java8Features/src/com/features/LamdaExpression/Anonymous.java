package com.features.LamdaExpression;


interface Anonymous {

	public void  show(String s);
}

class test {
	
	
	Anonymous a = new Anonymous() {
		
		@Override
		public void show(String s) {
			
		}
	};
	
}


