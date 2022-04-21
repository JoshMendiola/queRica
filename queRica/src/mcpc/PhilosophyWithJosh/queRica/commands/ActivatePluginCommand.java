package mcpc.PhilosophyWithJosh.queRica.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

import mcpc.PhilosophyWithJosh.queRica.Main;

public class ActivatePluginCommand implements CommandExecutor
{
	private Main plugin;
	private static boolean commandIsActive = false;
	public ActivatePluginCommand(Main plugin)
	{
		this.plugin = plugin;
		plugin.getCommand("qrtoggle").setExecutor(this);
	}
	
	public boolean onCommand(CommandSender sender, Command beblockhunter, String label, String[] args)
	
	{
		plugin.getServer().broadcastMessage("plugin toggled");
		commandIsActive = !commandIsActive;
		return true;
	}

	public static boolean commandIsActive() {
		return commandIsActive;
	}

}
	

