package com.dio.collection;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploOrderSet {
    public static void main(String[] args) {
        System.out.println("--\tRandom Order\t---");
        Set<Serie> mySeries = new HashSet<>(){{
            add(new Serie("The good place", "sitcom", 22));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("That '70s show", "comedy", 22));
        }};
        for (Serie serie : mySeries) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeDuration());

        System.out.println("--\tOrder of Insertion\t---");
        Set<Serie> mySeries2 = new LinkedHashSet<>(){{
            add(new Serie("The good place", "sitcom", 22));
            add(new Serie("Dark", "drama", 60));
            add(new Serie("That '70s show", "comedy", 22));
        }};
        for (Serie serie : mySeries2) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeDuration());

        System.out.println("--\tNatural Order\t---");
        Set<Serie> mySeries3 = new TreeSet<>(mySeries);
        for (Serie serie : mySeries3) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeDuration());
        System.out.println(mySeries3);

        System.out.println("--\tName/Genre/EpisodeDuration Order\t---");
        Set<Serie> mySeries4 = new TreeSet<>(new ComparatorNameGenreEpisodeDuration());
        mySeries4.addAll(mySeries);
        for (Serie serie : mySeries4) System.out.println(serie.getName() + " - " + serie.getGenre() + " - " + serie.getEpisodeDuration());
    }

}

class Serie implements Comparable<Serie>{
    private String name;
    private String genre;
    private Integer episodeDuration;
    
    public Serie(String name, String genre, Integer episodeDuration) {
        this.name = name;
        this.genre = genre;
        this.episodeDuration = episodeDuration;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getEpisodeDuration() {
        return episodeDuration;
    }

    @Override
    public String toString() {
        return "Serie [name=" + name + ", genre=" + genre + ", episodeDuration=" + episodeDuration + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((genre == null) ? 0 : genre.hashCode());
        result = prime * result + ((episodeDuration == null) ? 0 : episodeDuration.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Serie other = (Serie) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (genre == null) {
            if (other.genre != null)
                return false;
        } else if (!genre.equals(other.genre))
            return false;
        if (episodeDuration == null) {
            if (other.episodeDuration != null)
                return false;
        } else if (!episodeDuration.equals(other.episodeDuration))
            return false;
        return true;
    }

    @Override
    public int compareTo(Serie serie) {
        int episodeDuration = Integer.compare(this.getEpisodeDuration(), serie.getEpisodeDuration());
        if (episodeDuration != 0) return episodeDuration;

        return this.getGenre().compareTo(serie.getGenre());
        
    }

    
}
class ComparatorNameGenreEpisodeDuration implements Comparator<Serie>{

    @Override
    public int compare(Serie s1, Serie s2) {
        int name = s1.getName().compareTo(s2.getName());
        if (name != 0) return name;

        int genre = s1.getGenre().compareTo(s2.getGenre());
        if (genre != 0) return genre;

        return Integer.compare(s1.getEpisodeDuration(), s2.getEpisodeDuration());
    }
        
}