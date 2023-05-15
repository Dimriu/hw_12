import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    FilmManager manager = new FilmManager(4);
    @BeforeEach
    public void setup(){
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
    }
    @Test
    public void shouldAllFilms() {
        String[] expected = {"Бладшот", "Вперёд", "Отель Белград"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFilms() {
        FilmManager manager = new FilmManager();
        manager.add("Бладшот");
        manager.add("Вперёд");
        manager.add("Отель Белград");
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        manager.add("Film 8");
        manager.add("Film 9");
        manager.add("Film 10");
        String[] expected = {"Film 10", "Film 9", "Film 8", "Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLimit() {
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        String[] expected = {"Человек-невидимка", "Джентельмены", "Отель Белград", "Вперёд"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMoreLimit() {
        manager.add("Джентельмены");
        manager.add("Человек-невидимка");
        manager.add("Тролли.Мировой тур");
        manager.add("Номер один");
        String[] expected = {"Номер один", "Тролли.Мировой тур", "Человек-невидимка", "Джентельмены"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldLessLimit() {
        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}

















//    FilmLibrary film0 = new FilmLibrary();
//    FilmLibrary film1 = new FilmLibrary(1, "Бладшот");
//    FilmLibrary film2 = new FilmLibrary(2, "Вперёд");
//    FilmLibrary film3 = new FilmLibrary(3, "Отель Белград");
//    FilmLibrary film4 = new FilmLibrary(4, "Джентельмены");
//    FilmLibrary film5 = new FilmLibrary(5, "Человек-невидимка");
//    FilmLibrary film6 = new FilmLibrary(6, "Тролли.Мировой тур");
//    FilmLibrary film7 = new FilmLibrary(7, "Номер один");


    // Добавление нового фильма
//    FilmLibrary[] testFilm0 = new FilmLibrary[0];
//    FilmLibrary[] testFilm1 = {film1};
//    FilmLibrary[] testFilm2 = {film1, film2};
//    FilmLibrary[] testFilm3 = {film1, film2, film3};
//    FilmLibrary[] testFilm4 = {film1, film2, film3, film4};
//    FilmLibrary[] testFilm5 = {film1, film2, film3, film4, film5};
//    FilmLibrary[] testFilm6 = {film1, film2, film3, film4, film5, film6};
//    FilmLibrary[] testFilm7 = {film1, film2, film3, film4, film5, film6, film7};
//
//    FilmManager manager = new FilmManager();





