package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        String [] divide;
        for (String record : records) {
            divide = record.split(":");
            if (divide[0].equals(email)) {
                return (Integer.parseInt(divide[1]));
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
