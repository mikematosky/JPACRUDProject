-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema hp_characters_db
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `hp_characters_db` ;

-- -----------------------------------------------------
-- Schema hp_characters_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hp_characters_db` DEFAULT CHARACTER SET utf8 ;
USE `hp_characters_db` ;

-- -----------------------------------------------------
-- Table `hp_characters`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `hp_characters` ;

CREATE TABLE IF NOT EXISTS `hp_characters` (
  `id` INT NOT NULL,
  `first_name` VARCHAR(45) NOT NULL,
  `last_name` VARCHAR(45) NULL,
  `description` VARCHAR(1000) NOT NULL,
  `type` VARCHAR(45) NOT NULL,
  `gender` TINYINT(1) NOT NULL,
  `house` VARCHAR(45) NULL,
  `number_of_books` INT NOT NULL,
  `dead` TINYINT(1) NOT NULL,
  `death_eater` TINYINT(1) NOT NULL,
  `trivia` VARCHAR(1000) NULL,
  `image_link` VARCHAR(1000) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SET SQL_MODE = '';
DROP USER IF EXISTS dumbledore@localhost;
SET SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';
CREATE USER 'dumbledore'@'localhost' IDENTIFIED BY 'dumbledore';

GRANT SELECT, INSERT, TRIGGER, UPDATE, DELETE ON TABLE * TO 'dumbledore'@'localhost';

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `hp_characters`
-- -----------------------------------------------------
START TRANSACTION;
USE `hp_characters_db`;
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (1, 'Harry', 'Potter', 'The boy who lived. Main protagonist and target of Death Eaters.', 'Human', 1, 'Gryffindor', 7, 0, 0, 'Harry received a (P) for \"Poor\" in Divination.', 'https://assets.readbrightly.com/wp-content/uploads/2015/09/harry_potter_featured-768x550.gif');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (2, 'Dobby', NULL, 'Helpful house-elf who admires Harry Potter and his friends.', 'Elf', 1, NULL, 3, 1, 0, 'The only chore he couldn\'t do for the Malfoys was the laundry.', 'https://vignette.wikia.nocookie.net/harrypotter/images/9/9b/Dobby_2.jpg/revision/latest/top-crop/width/360/height/360?cb=20161215055153');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (3, 'Luna', 'Lovegood', 'One year behind Harry and loves and respects whimsical creatures and tales.', 'Human', 0, 'Ravenclaw', 3, 0, 0, 'Luna marries Rolf Scamander and becomes a Magizoologist. Harry\'s daughter\'s middle name is Luna.', 'https://i.etsystatic.com/7650241/r/il/14509f/1820242643/il_570xN.1820242643_cl3r.jpg');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (4, 'Draco', 'Malfoy', 'A cowardly bully that is proud of his pure-blood heritage and loyal to his family and house.', 'Human', 1, 'Slytherin', 7, 0, 1, 'Despite being a Death Eater, It is unclear if he ever aided their cause.', 'https://secure.i.telegraph.co.uk/multimedia/archive/03163/Draco---Jim-Kay_3163746k.jpg');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (5, 'Nymphadora', 'Tonks', 'An Aura and eventual Order member who studied under Mad-Eye Moody. She marries Remus Lupin and has a child before dying in the Battle for Hogwarts. ', 'Human', 0, 'Hufflepuff', 3, 1, 0, 'She hates her first name and, as a metamorphmagus, can change her appearance at will.', 'https://i.pinimg.com/originals/1d/1f/df/1d1fdf4ac9d0d2f75b98e4a7209558fc.jpg');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (6, 'Hermione', 'Granger', 'Smartest in Harry\'s year and one of his two best friends', 'Human', 0, 'Gryffindor', 7, 0, 0, 'She is the first of her age to cast non-verbal spells.', 'https://i.pinimg.com/236x/70/6a/8d/706a8d72fd3b0e405588abcbb2a604ca--best-sleep-night-parties.jpg');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (7, 'Rubeus', 'Hagrid', 'Half-Giant and Gameskeeper for Hogwarts who loves Magical Creatures', 'Half-Giant', 1, 'Gryffindor', 7, 0, 0, 'After being expelled from Hogwarts, the Ministry destroys his wand which Hagrid keeps in an umbrella to perform small spells.', 'https://cdna.artstation.com/p/assets/images/images/004/316/118/large/nicolas-morales-challenge-hagrid-final.jpg?1482348300');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (8, 'Severus', 'Snape', 'Teacher of Potions, Occlumency, Defense Against the Dark Arts and Temporary Headmaster of Hogwarts. His love for Lilly Potter and Unbreakable Vows guides his choices.', 'Human', 1, 'Slytherin', 7, 1, 1, 'His Patronous Charm is famously a doe after Lilly\'s.', 'https://design4users.com/wp-content/uploads/2017/07/harry-potter-charachter-illustration.png.pagespeed.ce.pmHT-NTqoD.png');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (9, 'Buckbeak', NULL, 'A proud Hippogriff who befriends Harry and the Order of the Phoenix', 'Hipogriff', 1, NULL, 5, 0, 0, 'Buckbeak travels with Sirius after being rescued by Harry and Hermione and takes up residence in Sirius\'s mother\'s room at 12 Grimmauld Place. He also leads the Thestrals in the Battle of Hogwarts.', 'https://f0.pngfuel.com/png/984/176/gray-creature-illustration-png-clip-art.png');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (10, 'Ron', 'Weasley', 'One of Harry\'s closest friends. A ginger boy of a large poor and eccentric wizarding family. Gryffindore\'s star keeper.', 'Human', 1, 'Gryffindor', 7, 0, 0, 'After Prizoner of Azkaban Ron replaces Scabbers with Pigwidgeon, a dopey owl given to him by Sirius.', 'https://live.staticflickr.com/3153/2959625393_6d9455b4b4.jpg');
INSERT INTO `hp_characters` (`id`, `first_name`, `last_name`, `description`, `type`, `gender`, `house`, `number_of_books`, `dead`, `death_eater`, `trivia`, `image_link`) VALUES (11, 'Hedwig', NULL, 'A white Snow Owl that is Harry\'s companion pet', 'Owl', 0, NULL, 7, 1, 0, 'Saint Hedwig is the patron saint of Orphans and a Sweedish female warrior.', 'https://i7.pngguru.com/preview/264/457/187/harry-potter-and-the-philosopher-s-stone-owl-harry-potter-and-the-chamber-of-secrets-ron-weasley-harry-potter.jpg');

COMMIT;

