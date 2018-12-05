package com.codeclan.folders.folderservice.components;

import com.codeclan.folders.folderservice.models.File;
import com.codeclan.folders.folderservice.models.Folder;
import com.codeclan.folders.folderservice.models.User;
import com.codeclan.folders.folderservice.repositories.FileRepository;
import com.codeclan.folders.folderservice.repositories.FolderRepository;
import com.codeclan.folders.folderservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

        @Autowired
        UserRepository userRepository;
        @Autowired
        FolderRepository folderRepository;
        @Autowired
        FileRepository fileRepository;

        public DataLoader(){ }
        public void run(ApplicationArguments args) {
            User user1 = new User("Peter Black");
            userRepository.save(user1);

            User user2 = new User("Susie Smith");
            userRepository.save(user2);

            Folder folder1 = new Folder("Bank", user1);
            folderRepository.save(folder1);

            Folder folder2 = new Folder("Bills", user2);
            folderRepository.save(folder2);

            File file1 = new File("Statements", "PDF", 50, folder1);
            fileRepository.save(file1);

            File file2 = new File("Invoices", "PDF", 20, folder2);
            fileRepository.save(file1);

        }


        }
