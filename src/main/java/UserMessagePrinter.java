public class UserMessagePrinter {

    private final UserMessageService userMessageService;

    public UserMessagePrinter(UserMessageService userMessageService) {
        this.userMessageService = userMessageService;
    }

    public void printMessage(String name) {
        userMessageService.createMessage(name);
    }
}
