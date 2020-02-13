package hk.edu.cuhk.ie.iems5722.a1_1155130475;

public class Message {
    private String message;
    private String timestamp;
    public Message(String message, String timestamp){
        this.message = message;
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return message;
    }

    public String getTimestamp() {
        return timestamp;
    }
}
