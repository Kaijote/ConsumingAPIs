import dao.FakeBookDAO;

public class Main {

    public static void main(String[] args) {
        FakeBookDAO.getBooksResults("en_GB", "20");
    }
}
