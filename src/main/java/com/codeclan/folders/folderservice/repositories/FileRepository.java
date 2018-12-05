package com.codeclan.folders.folderservice.repositories;

import com.codeclan.folders.folderservice.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
