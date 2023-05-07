import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    FilmLibrary film0 = new FilmLibrary();
    FilmLibrary film1 = new FilmLibrary(1, "Бладшот");
    FilmLibrary film2 = new FilmLibrary(2, "Вперёд");
    FilmLibrary film3 = new FilmLibrary(3, "Отель Белград");
    FilmLibrary film4 = new FilmLibrary(4, "Джентельмены");
    FilmLibrary film5 = new FilmLibrary(5, "Человек-невидимка");
    FilmLibrary film6 = new FilmLibrary(6, "Тролли.Мировой тур");
    FilmLibrary film7 = new FilmLibrary(7, "Номер один");

    @Test
    public void shouldSetCurrentId() {
        FilmLibrary video = new FilmLibrary();
        video.setId(1);
        int expected = 1;
        int actual = video.getId();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentFilmName() {
        FilmLibrary video = new FilmLibrary();
        video.setFilmName("Бладшот");
        String expected = "Бладшот";
        String actual = video.getFilmName();
        Assertions.assertEquals(expected, actual);
    }

    // Добавление нового фильма
    FilmLibrary[] testFilm0 = new FilmLibrary[0];
    FilmLibrary[] testFilm1 = {film1};
    FilmLibrary[] testFilm2 = {film1, film2};
    FilmLibrary[] testFilm3 = {film1, film2, film3};
    FilmLibrary[] testFilm4 = {film1, film2, film3, film4};
    FilmLibrary[] testFilm5 = {film1, film2, film3, film4, film5};
    FilmLibrary[] testFilm6 = {film1, film2, film3, film4, film5, film6};
    FilmLibrary[] testFilm7 = {film1, film2, film3, film4, film5, film6, film7};

    FilmManager manager = new FilmManager();

    @Test
    public void shouldSetCurrentFilmLibrary() {
        FilmLibrary[] expected = {film0};
        manager.setFilms(testFilm0);
        manager.add(film0);
        FilmLibrary[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetFilm1FilmLibrary() {
        FilmLibrary[] expected = {film1};
        manager.setFilms(testFilm0);
        manager.add(film1);
        FilmLibrary[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetFilm2FilmLibrary() {
        FilmLibrary[] expected = {film1, film2};
        manager.setFilms(testFilm1);
        manager.add(film2);
        FilmLibrary[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSetFilm7FilmLibrary() {
        FilmLibrary[] expected = {film1, film2, film3, film4, film5, film6, film7};
        manager.setFilms(testFilm6);
        manager.add(film7);
        FilmLibrary[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    // Вывод всех фильмов в порядке добавления (findAll)
    @Test
    void shouldSetFilmLibraryCurrent() {
        FilmLibrary[] expected = {};
        manager.setFilms(testFilm0);
        manager.findAll();
        FilmLibrary[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test02shouldSetFilmLibraryFilms4() {
        FilmLibrary[] expected = {film1, film2, film3, film4};
        manager.setFilms(testFilm4);
        manager.findAll();
        FilmLibrary[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void test02shouldSetFilmLibraryFilms5() {
        FilmLibrary[] expected = {film1, film2, film3, film4, film5};
        manager.setFilms(testFilm5);
        manager.findAll();
        FilmLibrary[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSetFilmLibraryFilms7() {
        FilmLibrary[] expected = {film1, film2, film3, film4, film5, film6, film7};
        manager.setFilms(testFilm7);
        manager.findAll();
        FilmLibrary[] actual = manager.getFilms();
        Assertions.assertArrayEquals(expected, actual);
    }

    //Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке (findLast).
    @Test
    void shouldSetFindLastFilmLibraryFilms1() {
        FilmLibrary[] expected = {film1};
        manager.setFilms(testFilm1);
        manager.findLast();
        FilmLibrary[] actual = manager.getFilmsReverse();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSetFindLastFilmLibraryFilms3() {
        FilmLibrary[] expected = {film3, film2, film1};
        manager.setFilms(testFilm3);
        manager.findLast();
        FilmLibrary[] actual = manager.getFilmsReverse();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSetFindLastFilmLibraryFilms6() {
        FilmLibrary[] expected = {film6, film5, film4, film3, film2, film1};
        manager.setFilms(testFilm6);
        manager.findLast();
        FilmLibrary[] actual = manager.getFilmsReverse();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    void shouldSetFilmLibraryCount2() {
        FilmLibrary[] expected = {film2, film1};
        manager.setFilms(testFilm2);
        manager.findLast();
        FilmLibrary[] actual = manager.getFilmsReverse();
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    void shouldSetFilmLibraryCount5() {
        FilmLibrary[] expected = {film5, film4, film3, film2, film1};
        manager.setFilms(testFilm5);
        manager.findLast();
        FilmLibrary[] actual = manager.getFilmsReverse();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSetFilmLibraryCount4() {
        FilmLibrary[] expected = {film4, film3, film2, film1};
        manager.setCountFilms(4);
        manager.setFilms(testFilm4);
        manager.findLast();
        FilmLibrary[] actual = manager.getFilmsReverse();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSetFilmLibraryCount7() {
        FilmLibrary[] expected = {film7, film6, film5, film4, film3, film2, film1};
        manager.setCountFilms(7);
        manager.setFilms(testFilm7);
        manager.findLast();
        FilmLibrary[] actual = manager.getFilmsReverse();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSetFilmLibraryCountMoreFilms() {
        FilmLibrary[] expected = {film3, film2, film1};
        manager.setCountFilms(10);
        manager.setFilms(testFilm3);
        manager.findLast();
        FilmLibrary[] actual = manager.getFilmsReverse();
        Assertions.assertArrayEquals(expected, actual);
    }

}

