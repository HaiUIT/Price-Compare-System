package com.pricecompare.repositories;

import com.pricecompare.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface AgentRepository extends JpaRepository<Agent, Integer>
{
    @Query(value = "select a.* from agents a where a.code = :code", nativeQuery = true)
    Agent findAgentByCode(@Param("code") String code);
}
