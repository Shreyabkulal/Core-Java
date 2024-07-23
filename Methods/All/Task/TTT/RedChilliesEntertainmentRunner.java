class RedChilliesEntertainmentRunner{
	public static void main(String[] actor){
		System.out.println("main started");
		RedChilliesEntertainment.addMovieActors("Yash");
		
		
		RedChilliesEntertainment.addMovieActors("Radhika Pandit");
		
		
		RedChilliesEntertainment.addMovieActors("Prajwal");
	
		
		RedChilliesEntertainment.addMovieActors("Darshan");
		
		
		RedChilliesEntertainment.addMovieActors("Sudeep");
		
		
		RedChilliesEntertainment.addMovieActors("Ganesh");
		
		
		RedChilliesEntertainment.addMovieActors("Krish");
		
		
		RedChilliesEntertainment.addMovieActors("Darling Krishna");
		
		
		RedChilliesEntertainment.addMovieActors("Milana");
		RedChilliesEntertainment.getMovieActors();
		
		RedChilliesEntertainment.updateMovieActor("Krish","Ishwarya");
		RedChilliesEntertainment.getMovieActors();
		
		RedChilliesEntertainment.deleteMovieActor("Milana");
		RedChilliesEntertainment.getMovieActors();
		
		System.out.println("main ended");
		
	}
   
}