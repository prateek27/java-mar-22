package com.prateek.javaMarchB2.functions2;

public class YoutubeMock {

    public static boolean login(String username, String password){
        // logic to check
        if(password.equals("123@")){
            return true;
        }
        return false;
    }
    public static void uploadVideo(String videoName){
        System.out.println(videoName + " successfully uploaded");
    }

    public static void main(String[] args) {
        //login + upload video



        if(login("prateek27","123@")){
                uploadVideo(" Maths-2");
        }
        else{
            System.out.println("Try logging in again");
        }

    }
}
