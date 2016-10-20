SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

CREATE SCHEMA IF NOT EXISTS `projectmanagementsystem` DEFAULT CHARACTER SET utf8 ;
USE `projectmanagementsystem` ;

-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`project`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`project` (
  `project_id` INT(11) NOT NULL,
  `project_name` VARCHAR(255) NOT NULL,
  `project_type` VARCHAR(255) NOT NULL,
  `project_startdate` DATE NOT NULL,
  `project_enddate` DATE NOT NULL,
  `project_visibleduration` INT(11) NOT NULL,
  `project_status` VARCHAR(45) NOT NULL,
  `project_methodology` VARCHAR(255) NOT NULL,
  `project_description` VARCHAR(255) NOT NULL,
  `project_tools` VARCHAR(255) NOT NULL,
  `project_pm` VARCHAR(255) NOT NULL,
  `project_dm` VARCHAR(255) NOT NULL,
  `project_am` VARCHAR(255) NOT NULL,
  `project_client` VARCHAR(255) NOT NULL,
  `project_clientpoc` VARCHAR(255) NOT NULL,
  `project_consultant` VARCHAR(255) NOT NULL,
  `project_budget` VARCHAR(255) NOT NULL,
  `project_estimatedeffort` VARCHAR(255) NOT NULL,
  `project_creationdate` DATE NOT NULL,
  `project_createdby` VARCHAR(255) NOT NULL,
  `project_modificationdate` DATE NULL DEFAULT NULL,
  `project_modifiedby` VARCHAR(255) NULL DEFAULT NULL,
  PRIMARY KEY (`project_id`))
ENGINE = InnoDB
COMMENT = '	';


-- -----------------------------------------------------
-- Table `projectmanagementsystem`.`master_client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `projectmanagementsystem`.`master_client` (
  `client_id` INT NOT NULL,
  `client_name` VARCHAR(255) NOT NULL,
  `client_poc` VARCHAR(255) NOT NULL,
  `client_poc_purpose` VARCHAR(255) NOT NULL,
  PRIMARY KEY (`client_id`),
  CONSTRAINT `cname_project_client`
    FOREIGN KEY ()
    REFERENCES `projectmanagementsystem`.`project` ()
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


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
  `project_event_response` VARCHAR(255) NOT NULL,
  `project_event_respondedby` VARCHAR(255) NOT NULL,
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
  `project_log_name` VARCHAR(255) NOT NULL,
  `project_log_type` VARCHAR(255) NOT NULL,
  `project_log_startdate` DATE NOT NULL,
  `project_log_enddate` DATE NOT NULL,
  `project_log_visibleduration` VARCHAR(255) NOT NULL,
  `project_log_status` VARCHAR(255) NOT NULL,
  `project_log_methodology` VARCHAR(255) NOT NULL,
  `project_log_description` VARCHAR(255) NOT NULL,
  `project_log_tools` VARCHAR(255) NOT NULL,
  `project_log_pm` VARCHAR(255) NOT NULL,
  `project_log_dm` VARCHAR(255) NOT NULL,
  `project_log_am` VARCHAR(255) NOT NULL,
  `project_log_clientpoc` VARCHAR(255) NOT NULL,
  `project_log_consultant` VARCHAR(255) NOT NULL,
  `project_log_budget` VARCHAR(255) NOT NULL,
  `project_log_estimatedeffort` VARCHAR(255) NOT NULL,
  `project_log_modificationdate` DATE NOT NULL,
  `project_log_modifiedby` VARCHAR(255) NOT NULL,
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
