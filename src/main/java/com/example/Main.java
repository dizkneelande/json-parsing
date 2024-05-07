package com.example;

public class Main {
    public static void main(String[] args) {
        DummyUserFetcher fetcher = new DummyUserFetcher();
        DummyUser[] users = fetcher.fetchDummyUsers();
        for (DummyUser user : users) {
            System.out.println(user);
        }

    }
}