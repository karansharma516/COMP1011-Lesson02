public	class Person{
		
		float height;
		float weight;
		
		public Person(){
		     this.height = 6;
             this.weight = 200;
		}
		
		public void walks(){
			this.weight *= 0.9;
		System.out.println("you lost weight!");
		System.out.println("You weigh: " + this.weight + "lbs");	
		
		}
		
		public void eats(){
			this.weight *= 1.2;
			System.out.println("You gained weight!");
			System.out.println("You weigh: " + this.weight + "lbs");
			
		}
	}
