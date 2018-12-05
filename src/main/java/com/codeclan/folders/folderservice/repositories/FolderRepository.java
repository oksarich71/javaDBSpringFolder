package com.codeclan.folders.folderservice.repositories;

import com.codeclan.folders.folderservice.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
