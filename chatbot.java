import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chatbot: Hello! I am a chatbot. Type 'bye' to exit.");

        // A basic set of responses
        Map<String, String> responses = new HashMap<>();
        responses.put("hi", "Hello! How can I assist you today?");
        responses.put("hello", "Hi there! What can I do for you?");
        responses.put("how are you", "I'm just a program, but I'm doing great! How can I help?");
        responses.put("what is your name", "I am a chatbot created to assist you.");
        responses.put("bye", "Goodbye! Have a great day.");
        responses.put("thanks", "You're welcome! Let me know if you need anything else.");

        while (true) {
            System.out.print("You: ");
            String userInput = scanner.nextLine().toLowerCase();

            if (userInput.equals("bye")) {
                System.out.println("Chatbot: " + responses.get("bye"));
                break;
            }

            // Find a response based on user input
            boolean matched = false;
            for (String key : responses.keySet()) {
                if (userInput.contains(key)) {
                    System.out.println("Chatbot: " + responses.get(key));
                    matched = true;
                    break;
                }
            }

            if (!matched) {
                System.out.println("Chatbot: I'm sorry, I didn't understand that. Could you rephrase?");
            }
        }

        scanner.close();
    }
}

