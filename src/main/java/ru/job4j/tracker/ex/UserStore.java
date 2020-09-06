package ru.job4j.tracker.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User some = new User("", true);
        for (User user: users) {
            if(user == null){
                throw new UserNotFoundException("User is not founded");
            }
                if (user.getUsername().contains(login)) {
                    some = user;
                }
        }
        return some;
    }

    public static boolean validate(User user) throws UserInvalidException {
           if (!(user.isValid()) || user.getUsername().length() < 3) {
               throw new UserInvalidException("User is invalid");
           }
        return true;
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
