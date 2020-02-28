package co.gc.relationshipdemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import co.gc.relationshipdemo.entity.Trainer;

public interface TrainerRepo extends JpaRepository<Trainer, Long> {

	Trainer findByUsernameIgnoreCase(String username);

}
