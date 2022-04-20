package mcpc.PhilosophyWithJosh.queRica.listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import mcpc.PhilosophyWithJosh.queRica.Main;

public class BlockBreakListener implements Listener
{
	private Main plugin;
	
	public BlockBreakListener(Main plugin)
	{
		this.plugin = plugin;
		Bukkit.getPluginManager().registerEvents(this, plugin);
	}
	
	@EventHandler
	public void playerBrokeBlock(BlockBreakEvent bbe)
	{
		
	}
}
