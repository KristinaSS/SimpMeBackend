-- liquibase formatted sql

-- Changeset kristina:2024-06-05-create-acc-table
CREATE TABLE `simpme`.`account` (
                                    `id` BINARY(16) NOT NULL,
                                    `first_name` VARCHAR(128) NOT NULL,
                                    `last_name` VARCHAR(128) NOT NULL,
                                    `email` VARCHAR(256) NOT NULL,
                                    `password` VARCHAR(45) NOT NULL,
                                    `terms` TINYINT(1) NOT NULL,
                                    `is_active` TINYINT(1) NOT NULL,
                                    PRIMARY KEY (`id`),
                                    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE,
                                    UNIQUE INDEX `id_UNIQUE` (`id` ASC) VISIBLE);

-- Changeset kristina:2024-06-05-create-skin-table
CREATE TABLE `simpme`.`skin` (
                                 `id` VARCHAR(45) NOT NULL,
                                 `acc_id` BINARY(16) NOT NULL,
                                 `liked` TINYINT(1) NOT NULL,
                                 `owned` TINYINT(1) NOT NULL,
                                 PRIMARY KEY (`id`, `acc_id`),
                                 INDEX `acc_skin_fk_idx` (`acc_id` ASC) VISIBLE,
                                 CONSTRAINT `acc_skin_fk`
                                     FOREIGN KEY (`acc_id`)
                                         REFERENCES `simpme`.`account` (`id`)
                                         ON DELETE NO ACTION
                                         ON UPDATE NO ACTION);


