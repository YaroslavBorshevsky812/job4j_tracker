package ru.job4j.tracker.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User some = new User("", true);
        for (User user: users) {
            try {
                if (user.getUsername().contains(login)) {
                    some = user;
                }
            } catch  (UserNotFoundException e){
                e.printStackTrace();
            }
        }
        return some;
    }

    public static boolean validate(User user) throws UserInvalidException {
        boolean valid = true;
       try {
           if (!(user.isValid()) || user.getUsername().length() < 3) {
               valid = false;
           }
       } catch (UserInvalidException e){
           e.printStackTrace();
       }
        return valid;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
