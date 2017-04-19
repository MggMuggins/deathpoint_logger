package com.mggmuggins.deathpointlogger.commands;

import net.minecraft.command.ICommand;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

import java.util.ArrayList;
import java.util.List;

public class CommandDeathpoint implements ICommand {
    private final List aliases;

    public CommandDeathpoint() {
        aliases = new ArrayList();
        aliases.add("deathpoint");
        aliases.add("death");
        aliases.add("dea");
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String getCommandName() {
        return "deathpoint";
    }

    @Override
    public String getCommandUsage(ICommandSender var) {
        return "deathpoint";
    }

    @Override
    public List getCommandAliases() {
        return this.aliases;
    }

    @Override
    public void processCommand(ICommandSender sender, String[] argString) {
        String message = "Command Executed";
        sender.addChatMessage(new ChatComponentText(message));
    }

    @Override
    public boolean canCommandSenderUseCommand(ICommandSender var1)
    {
        return true;
    }

    @Override
    public List addTabCompletionOptions(ICommandSender var1, String[] var2)
    {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isUsernameIndex(String[] var1, int var2)
    {
        // TODO Auto-generated method stub
        return false;
    }
}
