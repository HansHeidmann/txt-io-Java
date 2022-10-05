import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int turn = 0;
        int totalTurns = 50;
        ArrayList<String> eventsToPublish = new ArrayList<>();

        for (int i=0; i<totalTurns; i++) {
            String fileName = "file" + i;
            Logger logger = new Logger();
            logger.fileName = fileName;
            logger.createFile();

            for (int k=0; k<10; k++) {
                eventsToPublish.add("This is an event, here's a random #: " + (int) (Math.random() * 1000));
            }

            for (String event: eventsToPublish) {
                logger.linesToWrite.add(event);
            }
            eventsToPublish.clear();

            logger.writeToFile();
        }
    }
}

/*
// sort of prepared formatting as correct style for project submission

eventsToPublish.add("AdventurerObject" + " enters room: " + "room.id");
eventsToPublish.add("CreatureObject" + " enters room: " + "room.id");
eventsToPublish.add("AdventurerObject" + " defeats: " + "CreatureObject");
eventsToPublish.add("CreatureObject" + " defeats: " + "AdventurerObject");
eventsToPublish.add("AdventurerObject" + "celebration(s) array?");
eventsToPublish.add("AdventurerObject" + " damage changed from " + "oldDamage" + " to " + "newDamage");
eventsToPublish.add("AdventurerObject" + "was defeated and removed from the game");
eventsToPublish.add("CreatureObject" + "was defeated and removed from the game");
eventsToPublish.add("Treasure was found by: " + "AdventurerObject" + " - Type: " + "TreasureObject");
 */