enum Size{
	XS,S,M,L,XL,XXL
}

class A {

	public static void main(String[] args){

		Size size;

		size = Size.M;

		if(size == Size.M){
			System.out.println("Size is : Medium");
		}

	}

}