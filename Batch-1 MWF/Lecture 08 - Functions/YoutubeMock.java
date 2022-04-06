package com.prateek.javaMarchB2.functions1;

public class YoutubeMock {

    public static boolean login(String username, String password){
        if(password.equals("123")){
            return false;
        }
        return true;
    }
    public static void uploadVideo(String videoname){
        System.out.println(videoname + "upload succesfully");
    }

    public static void main(String[] args) {
        String N ="prateek27";
        String P ="1234r";

        if(login(N,P)==true){
            uploadVideo("Maths Session");
        }
        else{
            System.out.println("login again");
        }
    }

}
