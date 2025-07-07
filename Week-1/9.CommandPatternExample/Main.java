
public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        RemoteControl remote = new RemoteControl();

        // Turn the light ON
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: Light is ON 💡

        // Turn the light OFF
        remote.setCommand(lightOff);
        remote.pressButton();  // Output: Light is OFF 🔌
    }
}
