package mcpc.PhilosophyWithJosh.queRica;

import org.bukkit.command.PluginCommand;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

import mcpc.PhilosophyWithJosh.queRica.commands.ActivatePluginCommand;
import mcpc.PhilosophyWithJosh.queRica.listeners.BlockBreakListener;

public class Main extends JavaPlugin
{
	@Override
	public void onEnable()
	{
		new ActivatePluginCommand(this);
		new BlockBreakListener(this);
	}
}
