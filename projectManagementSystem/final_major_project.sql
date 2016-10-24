SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `projectmanagementsystem` DEFAULT CHARACTER SET utf8 ;
USE `projectmanagementsystem` ;

-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`master_client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`master_client` (
  `client_id` INT NOT NULL,
  `client_name` VARCHAR(255) ,
  `client_poc` VARCHAR(255) ,
  `client_poc_purpose` VARCHAR(255) ,
  PRIMARY KEY (`client_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`project`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`project` (
  `project_id` INT(11) NOT NULL,
  `project_name` VARCHAR(255) ,
  `project_type` VARCHAR(255) ,
  `project_startdate` DATE ,
  `project_enddate` DATE,
  `project_visibleduration` INT(11),
  `project_status` VARCHAR(45),
  `project_methodology` VARCHAR(255),
  `project_description` VARCHAR(255),
  `project_tools` VARCHAR(255),
  `project_pm` VARCHAR(255),
  `project_dm` VARCHAR(255),
  `project_am` VARCHAR(255),
  `project_client` INT ,
  `project_clientpoc` VARCHAR(255),
  `project_consultant` VARCHAR(255) ,
  `project_budget` VARCHAR(255) ,
  `project_estimatedeffort` VARCHAR(255),
  `project_creationdate` DATE ,
  `project_createdby` VARCHAR(255) ,
  `project_modificationdate` DATE NULL DEFAULT NULL,
  `project_modifiedby` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`project_id`),
  INDEX `client_project_client_idx` (`project_client` ASC),
  CONSTRAINT `client_project_client`
    FOREIGN KEY (`project_client`)
    REFERENCES `projectmanagementsystem`.`master_client` (`client_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB
COMMENT = '	';


-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`portfolio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`portfolio` (
  `project_id` INT NOT NULL,
  `name` VARCHAR(255) NOT NULL,
  `projects` VARCHAR(255) NOT NULL,
  `budget` DOUBLE NOT NULL,
  `owner` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`project_id`),
  CONSTRAINT `projectid`
    FOREIGN KEY (`project_id`)
    REFERENCES `projectmanagementsystem`.`project` (`project_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`project_event`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`project_event` (
  `project_event_id` INT(11) NOT NULL,
  `project_event_description` VARCHAR(255) NOT NULL,
  `project_event_typre` VARCHAR(255) NOT NULL,
  `project_event_response` VARCHAR(255) ,
  `project_event_respondedby` VARCHAR(255) ,
  PRIMARY KEY (`project_event_id`),
  CONSTRAINT `projectid_project_project_event`
    FOREIGN KEY (`project_event_id`)
    REFERENCES `projectmanagementsystem`.`project` (`project_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`login`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`login` (
  `username` INT NOT NULL,
  `password` VARCHAR(255) NOT NULL,
  `role` INT NOT NULL,
  PRIMARY KEY (`username`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`resource`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`resource` (
  `resource_id` INT NOT NULL AUTO_INCREMENT,
  `resource_name` VARCHAR(255) NOT NULL,
  `resource_role` INT NOT NULL,
  PRIMARY KEY (`resource_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`master_gender`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`master_gender` (
  `gender_id` INT NOT NULL,
  `gender_type` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`gender_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`master_role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`master_role` (
  `role_id` INT NOT NULL,
  `role_desc` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`role_id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`project_log`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`project_log` (
  `project_log_log_id` INT NOT NULL AUTO_INCREMENT,
  `project_log_project_id` INT NOT NULL,
  `project_log_name` VARCHAR(255),
  `project_log_type` VARCHAR(255),
  `project_log_startdate` DATE,
  `project_log_enddate` DATE,
  `project_log_visibleduration` VARCHAR(255),
  `project_log_status` VARCHAR(255),
  `project_log_methodology` VARCHAR(255) ,
  `project_log_description` VARCHAR(255),
  `project_log_tools` VARCHAR(255) ,
  `project_log_pm` VARCHAR(255),
  `project_log_dm` VARCHAR(255),
  `project_log_am` VARCHAR(255),
  `project_log_clientpoc` VARCHAR(255),
  `project_log_consultant` VARCHAR(255),
  `project_log_budget` VARCHAR(255),
  `project_log_estimatedeffort` VARCHAR(255),
  `project_log_modificationdate` DATE ,
  `project_log_modifiedby` VARCHAR(255),
  PRIMARY KEY (`project_log_log_id`),
  INDEX `fk_project_id_idx` (`project_log_project_id` ASC),
  CONSTRAINT `fk_project_id`
    FOREIGN KEY (`project_log_project_id`)
    REFERENCES `projectmanagementsystem`.`project` (`project_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
