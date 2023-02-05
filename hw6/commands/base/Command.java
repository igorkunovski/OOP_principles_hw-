package commands.base;

import commands.parameters.base.CommandParameter;

public interface Command {
    void execute(CommandParameter parameter);
}
