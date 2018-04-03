package server;

public class Message {
    String id;        //holds peer ID
    String ip;        //holds peer IP
    String command;   //holds action (to be used for the course project, not now).
    String data;      //holds message data or file name
    public Message(String id, String ip, String command, String data)
    {
        this.id=id;
        this.command=command;
        this.ip=ip;
        this.data=data;
    }
}
