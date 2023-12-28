package Variable_package4;


	class Dog
	{
		String name;
		String breed;
		float cost;
	}
	class V1{
		public static void main(String[] args) {
			Dog d1=new Dog();
			Dog d2=new Dog();
			Dog d3=new Dog();
			d1.name="Happy";
			d1.breed="shitzu";
			d1.cost=13000.23f;
			d2.name="Maddy";
			d2.breed="Golden retriever";
			d2.cost=15000.23f;
			d3.name="Rony";
			d3.breed="Pug";
			d3.cost=10000.2f;
			System.out.println("Name: "+ d1.name);
			System.out.println("Breed: "+ d1.breed);
			System.out.println("Cost: "+ d1.cost);
			System.out.println("Name: "+ d2.name);
			System.out.println("Breed: "+ d2.breed);
			System.out.println("Cost: "+ d2.cost);
			System.out.println("Name: "+ d3.name);
			System.out.println("Breed: "+ d3.breed);
			System.out.println("Cost: "+ d3.cost);
			
	}


	}


