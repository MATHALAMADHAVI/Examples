
package com.cg.service;

import java.util.List;
import com.cg.exceptions.PlayerNotFoundException;
import com.cg.model.Player;

public interface PlayerService {
	public Player addPlayer(Player player);

	public List<Player> displayAllPlayers();

	public Player updatePlayer(int playerId, Player player) throws PlayerNotFoundException;

	public void deletePlayer(int palyerId);
}
