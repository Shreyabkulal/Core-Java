class Netflix{
	
	static String top10Movies[]={"Hit Man","Godzilla Minus One","Anyone But You","The Night Comes for Us","The Power of the Dog","Spider-Man: Across the Spider-Verse","Mysteries of the Terracotta Warriors","The Lego Movie","Shrek","Crazy Rich Asians"};
	static String englishMovies[]={"The Farewell","Knives Out","The Adam Project","Enola Holmes","When They See Us","The Ballad of Buster Scruggs","The Mitchells vs. the Machines","I Am Mother","Marriage Story","The Grand Budapest Hotel","Pulp Fiction","The Big Lebowski","Blade Runner","The Princess Bride","Inception","Hit Man","Godzilla Minus One","Anyone But You","The Night Comes for Us","The Power of the Dog","Spider-Man","The Irishman","The Shawshank Redemption","The Departed","The Matrix"};
	static String kannadaMovies[]={"Kantara (2022)","Govinda Govinda (2022)","Kavaludaari (2019)","Dia (2017)","Nathicharami (2018)","Thithi (2015)","U Turn (2016)","Mungaru Male (2006)","Kirik Party (2016)","Ondu Motteya Kathe (2017)","Raksha (2022)","777 Charlie (2022)","Vikrant Rona (2022)","James (2022)","Gaalipata 2 (2022)","Old Monk (2022)","Guru Shishyaru (2022)","Avatara Purusha (2022)","Ek Love Ya (2022)","Love Mocktail 2 (2022)","Window Seat (2022)","Petromax (2022)","Harikathe Alla Girikathe (2022)","Family Pack (2022)","Kavacha (2017)"};
	static String hindiMoviesOrSeries[]={"Sacred Games (2018)","Delhi Crime (2019)","The Family Man (2019)","AK vs AK (2020)","Bulbul (2020)","Lootcase (2020)","Serious Men (2021)","The White Tiger (2021)","Aranyak (2020)","Mai (2022)","She (2020)","Selection Day (2018)","Leila (2019)","Typewriter (2019)","Bard of Blood (2019)","Taj Mahal 1989 (2020)","Hasmukh (2020)","Betaal (2020)","Masaba Masaba (2020)","Bhaag Beanie Bhaag (2020)","Paava Kadhaigal (2020)","Pitta Kathalu (2021)","Bombay Begums (2021)","Ray (2021)","Feels Like Ishq (2021)"};
	static String koreanSeries[]={"Squid Game (2021)","Crash Landing on You (2019-2020)","Goblin: The Great and Lonely God (2016-2017)","Mr. Sunshine (2018)","Guardian: The Lonely and Great God (2016)","Descendants of the Sun (2016)","Kingdom (2019-2021)","Extraordinary Attorney Woo (2022)","Vincenzo (2021)","Hometown Cha Cha Cha (2021)","Weightlifting Fairy Kim Bok-joo (2016-2017)","Start-Up (2020)","Reply 1988 (2015-2016)","Hospital Playlist (2020-2021)","Prison Playbook (2017-2018)","Fight for My Way (2017)","Her Private Life (2019)","What's Wrong with Secretary Kim (2018)","While You Were Sleeping (2017)","Strong Woman Do Bong-soon (2017)"};
	
	public static void main(String[] ott){
		
	 System.out.println("Top 10 Movies are:"+top10Movies.length);
	 for(String top10Movie:top10Movies){
		 System.out.println(top10Movie);
	 };
	 
	 System.out.println("\nEnglish Movies are:"+englishMovies.length);
	 for(String englishMovie:englishMovies){
		 System.out.println(englishMovie); 
	 };
	  
	 System.out.println("\nKannada Movies are:"+kannadaMovies.length);
	 for(String kannadaMovie:kannadaMovies){
		 System.out.println(kannadaMovie);		 
	 };
	 
	 System.out.println("\nHindi Movies Or Series are:"+hindiMoviesOrSeries.length);
	 for(String hindiMovieOrSeries:hindiMoviesOrSeries){
		 System.out.println(hindiMovieOrSeries);
	 };
	 
	 System.out.println("\nKorean Series are:"+koreanSeries.length);
	 for(String koreanSeries:koreanSeries){
		 System.out.println(koreanSeries);
	 };
	 
		
	}

}