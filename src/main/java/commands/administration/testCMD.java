package commands.administration;

import commands.Command;
import core.SSSS;
import net.dv8tion.jda.client.managers.EmoteManager;
import net.dv8tion.jda.core.entities.Emote;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.entities.impl.EmoteImpl;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.requests.Route;
import utils.STATICS;

import java.io.IOException;
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Ringo Hoffmann on 20.02.2017.
 */

public class testCMD implements Command {
    @Override
    public boolean called(String[] args, MessageReceivedEvent event) {
        return false;
    }

    @Override
    public void action(String[] args, MessageReceivedEvent event) {

        Message msg = event.getTextChannel().sendMessage("TEST").complete();
        msg.addReaction("\uD83D\uDE29").queue();

    }

    @Override
    public void executed(boolean success, MessageReceivedEvent event) {

    }

    @Override
    public String help() {
        return null;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public String commandType() {
        return STATICS.CMDTYPE.administration;
    }
}
