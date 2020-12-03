package core.basesyntax;

import core.basesyntax.exception.UserNotFoundException;

public class UserService {

    public int getUserScore(String[] records, String email) {
        String[][] che = new String[records.length][1];
        for (int i = 0; i < records.length; i++) {
            che[i] = records[i].split(":");
        }
        for (String[] check : che) {
            if (check[0].equals(email)) {
                return (Integer.parseInt(check[1]));
            }
        }
        throw new UserNotFoundException("User with given email doesn't exist");
    }
}
