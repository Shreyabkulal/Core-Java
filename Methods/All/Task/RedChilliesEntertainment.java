import java.util.*;
class RedChilliesEntertainment{
	static String movieActors[]={null,null,null,null,null,null,null,null,null};
	static int index;
	
	public static boolean addMovieActors(String movieActor){
		System.out.println("addMovieActors started");  
	  boolean isMovieActorAdded = false;
	  if(movieActor != null){
		 movieActors[index] = movieActor;
		 index++;
		 isMovieActorAdded = true;
	  }else System.out.println("Please enter valid name");  
	  System.out.println("addMovieActors ended");
	  return isMovieActorAdded;		
	}
	
    public static void getMovieActors(){	
		System.out.println("getMovieActors started");
	  for(String act: movieActors)
		System.out.println(act);
	  System.out.println("getMovieActors ended");
	  return;
    }
	
	public static boolean updateMovieActor(String oldActor,String newActor){
		System.out.println("updateMovieActor started");
		boolean isActorUpdated = false;
		for(int index=0;index<movieActors.length;index++){
			if(oldActor==movieActors[index]){
				movieActors[index]=newActor;
				isActorUpdated=true;
			}
		}
		if(isActorUpdated==false){
			System.out.println(oldActor+" not found");
		}
		System.out.println("updateMovieActor ended");
		return isActorUpdated;
	}

  public static boolean deleteMovieActor(String movieActorToBeDeleted){
	  System.out.println("deleteMovieActor started");
	  boolean isActorDeleted = false;
	  int newIndex, oldIndex;
	  for(newIndex=0,oldIndex=0;oldIndex<movieActors.length;oldIndex++){
		if(movieActors[oldIndex] != movieActorToBeDeleted){
			movieActors[newIndex] = movieActors[oldIndex];
			newIndex++;
		}  
	  }
	  movieActors = Arrays.copyOf(movieActors, newIndex);
	  if(movieActors != null){
		  isActorDeleted = true;
	  }
	  if(isActorDeleted == false){
		  System.out.println(movieActorToBeDeleted+" not found");
	  }
	  
	  System.out.println("deleteMovieActor ended");
	  return isActorDeleted;
  }
}