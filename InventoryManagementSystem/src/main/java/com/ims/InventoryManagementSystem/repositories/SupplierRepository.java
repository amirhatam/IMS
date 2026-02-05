package com.ims.InventoryManagementSystem.repositories;

import com.ims.InventoryManagementSystem.models.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplierRepository extends JpaRepository<Supplier, Long> {
}
