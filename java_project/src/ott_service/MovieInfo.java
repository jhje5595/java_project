package ott_service;

public class MovieInfo{
	String title = null;
	String movie_director = null;
	String release_day = null; 
	String genre = null;
	int is_liked = 0;
	
	public MovieInfo(String t,String d,String r,String g) { // init movie_info
		this.title = t;
		this.movie_director = d;
		this.release_day = r;
		this.genre = g;
	}
}