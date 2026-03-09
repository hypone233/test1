package com.zzz;

public class UserSreviceImpl implements UserService{
    @Override
    public void addUser(String name) {
        System.out.println("add" + name);
    }
}
