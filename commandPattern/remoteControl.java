package commandPattern;

import java.util.ArrayList;
import java.util.List;
public class remoteControl {
    
    private List<command> commands = new ArrayList<>();

    public void addCommand(command command){
        commands.add(command);
    }
    public void pushButton(){
        for(command command : commands){
            command.execute();
        }
        commands.clear();
    }
}