import com.sona.imbd.ui.AdminActions;
import com.sona.imbd.users.User;

public class UserTest {
    public static void main(String[] args) {
        new AdminActions();
        UserTest movieRatingTest = new UserTest();
        movieRatingTest.testRateMovie();
    }

    void testRateMovie() {
        User user = new User();
        user.rateMovie(1, 5);
        user.rateMovie(1, 4);
        user.rateMovie(1, 5);
        double result = user.rateMovie(1, 5);
        Assert.equals(result, 4.75);
    }
}