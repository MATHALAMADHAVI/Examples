package com.cg.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.cg.model.Player;
@Repository
public interface PlayerRepository extends MongoRepository<Player, Integer> {
	}

