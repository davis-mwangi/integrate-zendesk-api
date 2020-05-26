package com.equitybank.zendesk.repository;

import com.equitybank.zendesk.entities.Status;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StatusDao  extends JpaRepository<Status, String> {
}
