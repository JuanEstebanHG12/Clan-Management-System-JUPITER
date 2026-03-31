package services;

import models.User;
import repository.UserRepository;

public class UserServices {
    public static User LoginService(String email, String password){
        User user = UserRepository.findByEmail(email);

        if (user != null && user.getPassword().trim().equals(password)){
            System.out.println(user);
            return user;
        }
        return null;
    }
}
