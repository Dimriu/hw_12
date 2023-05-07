public class FilmManager {
    private FilmLibrary[] films = new FilmLibrary[0];
    private FilmLibrary[] filmsReverse = new FilmLibrary[0];
    private int countFilms = 7;

    public FilmManager() {
    }

    public FilmLibrary[] getFilms() {
        return films;
    }

    public void setFilms(FilmLibrary[] films) {
        this.films = films;
    }

    public FilmLibrary[] getFilmsReverse() {
        return filmsReverse;
    }

    public void setCountFilms(int countFilms) {
        this.countFilms = countFilms;
    }

    public void add(FilmLibrary film) {
        FilmLibrary[] tmp = new FilmLibrary[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public void findAll() {
        getFilms();
    }

    public void findLast() {
        if (countFilms > films.length) {
            countFilms = films.length;
        }

        FilmLibrary[] tmp = new FilmLibrary[countFilms];
        int i = 0;
        int temp = films.length;
        for (i = 0; i < films.length; i++) {
            temp = temp - 1;
            tmp[i] = films[temp];
        }
        filmsReverse = tmp;
    }

}



