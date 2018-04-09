-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le :  lun. 09 avr. 2018 à 22:30
-- Version du serveur :  10.1.31-MariaDB
-- Version de PHP :  7.2.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `gestionetablissement`
--
CREATE DATABASE IF NOT EXISTS `gestionetablissement` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `gestionetablissement`;

-- --------------------------------------------------------

--
-- Structure de la table `adresse`
--

CREATE TABLE `adresse` (
  `idadresse` int(11) NOT NULL,
  `noAdresse` int(11) DEFAULT NULL,
  `rueAdresse` varchar(45) DEFAULT NULL,
  `cpAdresse` int(11) DEFAULT NULL,
  `villeAdresse` varchar(45) DEFAULT NULL,
  `paysAdresse` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `affectation`
--

CREATE TABLE `affectation` (
  `idaffectation` int(11) NOT NULL,
  `loginaffectation` varchar(45) DEFAULT NULL,
  `motDePasse` varchar(45) DEFAULT NULL,
  `dateEntreAffectation` datetime DEFAULT NULL,
  `dateSortieAffect` date DEFAULT NULL,
  `commAffect` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `assiduité`
--

CREATE TABLE `assiduité` (
  `idassiduité` int(11) NOT NULL,
  `idetudiant` int(11) DEFAULT NULL,
  `idsenace` int(11) DEFAULT NULL,
  `etatassiduité` varchar(45) DEFAULT NULL,
  `dateRelance` datetime DEFAULT NULL,
  `commentaire` varchar(45) DEFAULT NULL,
  `docassid` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `category`
--

CREATE TABLE `category` (
  `category_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `charge`
--

CREATE TABLE `charge` (
  `idcharge` int(11) NOT NULL,
  `nomCharge` varchar(45) DEFAULT NULL,
  `typeCharge` varchar(45) DEFAULT NULL,
  `montantCharge` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `charges`
--

CREATE TABLE `charges` (
  `idcharges` int(11) NOT NULL,
  `libellecharge` varchar(45) DEFAULT NULL,
  `montantHT` float DEFAULT NULL,
  `montantTTC` float DEFAULT NULL,
  `qtecharge` decimal(10,0) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `conseiladmin`
--

CREATE TABLE `conseiladmin` (
  `idconseilAdmin` int(11) NOT NULL,
  `libelleConseilAdmin` varchar(45) DEFAULT NULL,
  `objetConseilAdmin` varchar(45) DEFAULT NULL,
  `decisConseilAdmin` varchar(45) DEFAULT NULL,
  `pvcConseilAdmin` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `conseilpedgogique`
--

CREATE TABLE `conseilpedgogique` (
  `idconseilPedgogique` int(11) NOT NULL,
  `libelleConseilPedag` varchar(45) DEFAULT NULL,
  `decisionConseilPedag` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `contart`
--

CREATE TABLE `contart` (
  `idcontart` int(11) NOT NULL,
  `status` varchar(45) DEFAULT NULL,
  `fonction` varchar(45) DEFAULT NULL,
  `etudiant` int(11) DEFAULT NULL,
  `enseignant` int(11) DEFAULT NULL,
  `libellecontrat` varchar(45) DEFAULT NULL,
  `dateEntre` datetime DEFAULT NULL,
  `dateSortie` datetime DEFAULT NULL,
  `salaire` float DEFAULT NULL,
  `indemnité` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

CREATE TABLE `cours` (
  `idcours` int(11) NOT NULL,
  `libellecours` varchar(45) DEFAULT NULL,
  `nbrLeçon` int(11) DEFAULT NULL,
  `avancement` varchar(45) DEFAULT NULL,
  `niveauCours` varchar(45) DEFAULT NULL,
  `partieCours` varchar(45) DEFAULT NULL,
  `volHorraire` int(11) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `enseignant`
--

CREATE TABLE `enseignant` (
  `idenseignant` int(11) NOT NULL,
  `nomenseignant` varchar(45) DEFAULT NULL,
  `prenomenseignant` varchar(45) DEFAULT NULL,
  `matiere1enseignant` varchar(45) DEFAULT NULL,
  `matiere2enseigant` varchar(45) DEFAULT NULL,
  `matiere2enseigant_2` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

CREATE TABLE `etudiant` (
  `idetudiant` int(11) NOT NULL,
  `nometudiant` varchar(45) DEFAULT NULL COMMENT ' ',
  `prenometudiant` varchar(45) DEFAULT NULL,
  `numetudiant` int(11) DEFAULT NULL,
  `sexe` varchar(45) DEFAULT NULL,
  `domaine` varchar(45) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `tel` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `moduleValide` int(11) DEFAULT NULL,
  `listemodule` int(11) DEFAULT NULL,
  `inscription` int(11) DEFAULT NULL,
  `listeAbsence` int(11) DEFAULT NULL,
  `listeEvaluation` int(11) DEFAULT NULL,
  `listePresence` int(11) DEFAULT NULL,
  `adresse` int(11) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='									';

-- --------------------------------------------------------

--
-- Structure de la table `evaluation`
--

CREATE TABLE `evaluation` (
  `idevaluation` int(11) NOT NULL,
  `idEtudiant` int(11) DEFAULT NULL,
  `dateEvaluation` datetime DEFAULT NULL,
  `moyenneEval` float DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `examen`
--

CREATE TABLE `examen` (
  `idexamen` int(11) NOT NULL,
  `formeExamen` varchar(45) DEFAULT NULL,
  `bareme` int(11) DEFAULT NULL,
  `description` varchar(45) DEFAULT NULL,
  `typeexamen` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `groupe`
--

CREATE TABLE `groupe` (
  `idgroupe` int(11) NOT NULL,
  `nomgroupe` varchar(45) DEFAULT NULL,
  `idetudiant` int(11) DEFAULT NULL,
  `idsalle` int(11) DEFAULT NULL,
  `idhorraire` int(11) DEFAULT NULL,
  `idsession` int(11) DEFAULT NULL,
  `salle_idsalle` int(11) DEFAULT NULL,
  `matiere_idmatiere` int(11) DEFAULT NULL,
  `horraire_idhorraire` int(11) DEFAULT NULL,
  `capacité` int(11) DEFAULT NULL,
  `competence` varchar(45) DEFAULT NULL,
  `libelleGroupe` varchar(45) DEFAULT NULL,
  `commentaire` varchar(45) DEFAULT NULL,
  `effSupGroupe` varchar(45) DEFAULT NULL,
  `planning` int(11) DEFAULT NULL,
  `enseignant` int(11) DEFAULT NULL,
  `module` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `groupe_has_inscription`
--

CREATE TABLE `groupe_has_inscription` (
  `groupe_salle_idsalle` int(11) DEFAULT NULL,
  `groupe_idgroupe` int(11) DEFAULT NULL,
  `inscription_etudiant_idetudiant` int(11) DEFAULT NULL,
  `inscription_idinscription` int(11) DEFAULT NULL,
  `groupe_matiere_idmatiere` int(11) DEFAULT NULL,
  `groupe_horraire_idhorraire` int(11) DEFAULT NULL,
  `groupe_seesion_idsession` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `horraire`
--

CREATE TABLE `horraire` (
  `idhorraire` int(11) NOT NULL,
  `idsession` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `inscription`
--

CREATE TABLE `inscription` (
  `idinscription` int(11) NOT NULL,
  `idetudiant` int(11) DEFAULT NULL,
  `idgroupe` int(11) DEFAULT NULL,
  `idpaiement` int(11) DEFAULT NULL,
  `idsession` int(11) DEFAULT NULL,
  `dateinscription` date DEFAULT NULL,
  `etudiant_idetudiant` int(11) DEFAULT NULL,
  `listeachat` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `materiel`
--

CREATE TABLE `materiel` (
  `idmateriel` int(11) NOT NULL,
  `libelleMateriel` varchar(45) DEFAULT NULL,
  `marqueMateriel` varchar(45) DEFAULT NULL,
  `referMateriel` varchar(45) DEFAULT NULL,
  `dateAcquiseMateriel` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

CREATE TABLE `matiere` (
  `idmatiere` int(11) NOT NULL,
  `module` int(11) DEFAULT NULL,
  `libelleMatiere` varchar(45) DEFAULT NULL,
  `cours` int(11) DEFAULT NULL,
  `examen` int(11) DEFAULT NULL,
  `listeSeance` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `module`
--

CREATE TABLE `module` (
  `idmodule` int(11) NOT NULL,
  `libelleModule` varchar(45) DEFAULT NULL,
  `listeMatière` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `paiement`
--

CREATE TABLE `paiement` (
  `idpaiement` int(11) NOT NULL,
  `montanttotalHT` float DEFAULT NULL,
  `montanttotalTTC` float DEFAULT NULL,
  `restantdu` float DEFAULT NULL,
  `dateecheance1` date DEFAULT NULL,
  `dateecheance2` date DEFAULT NULL,
  `dateecheance3` date DEFAULT NULL,
  `reçu1echeance1` varchar(45) DEFAULT NULL,
  `reçu2echeance2` varchar(45) DEFAULT NULL,
  `reçu3echeance3` varchar(45) DEFAULT NULL,
  `commentaire` varchar(45) DEFAULT NULL,
  `modepaiement` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `planning`
--

CREATE TABLE `planning` (
  `idplanning` int(11) NOT NULL,
  `libellePlanning` varchar(45) DEFAULT NULL,
  `horLunPlanning` int(11) DEFAULT NULL,
  `horMarPlanning` int(11) DEFAULT NULL,
  `horMercPlanning` int(11) DEFAULT NULL,
  `horJeuPlanning` int(11) DEFAULT NULL,
  `horVenPlanning` int(11) DEFAULT NULL,
  `horSamPlanning` int(11) DEFAULT NULL,
  `horDimPlanning` int(11) DEFAULT NULL,
  `session` int(11) DEFAULT NULL,
  `groupe` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `repartition`
--

CREATE TABLE `repartition` (
  `idrepartition` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `reunion`
--

CREATE TABLE `reunion` (
  `idreunion` int(11) NOT NULL,
  `idseance` int(11) DEFAULT NULL,
  `libellereunion` varchar(45) DEFAULT NULL,
  `participantreunion` int(11) DEFAULT NULL,
  `horrairereunion` int(11) DEFAULT NULL,
  `conseilAdmin` int(11) DEFAULT NULL,
  `conseilPedagogique` int(11) DEFAULT NULL,
  `tachaAfaire` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

CREATE TABLE `salle` (
  `idsalle` int(11) NOT NULL,
  `nomsalle` varchar(45) DEFAULT NULL,
  `capacitesalle` int(11) DEFAULT NULL,
  `disponobilitesalle` varchar(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `seance`
--

CREATE TABLE `seance` (
  `idseance` int(11) NOT NULL,
  `rattrapageSeance` varchar(45) DEFAULT NULL,
  `annulationSeance` varchar(45) DEFAULT NULL,
  `support` int(11) DEFAULT NULL,
  `groupe` int(11) DEFAULT NULL,
  `horraire` int(11) DEFAULT NULL,
  `matiere` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `session`
--

CREATE TABLE `session` (
  `idsession` int(11) NOT NULL,
  `anneesession` int(11) DEFAULT NULL,
  `nomsession` varchar(45) DEFAULT NULL,
  `datedebutsession` date DEFAULT NULL,
  `datefinsession` date DEFAULT NULL,
  `idGroupe` int(11) DEFAULT NULL,
  `produit` int(11) DEFAULT NULL,
  `charge` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `suivipedagogique`
--

CREATE TABLE `suivipedagogique` (
  `idsuivipedagogique` int(11) NOT NULL,
  `s1` varchar(45) DEFAULT NULL,
  `s2` varchar(45) DEFAULT NULL,
  `s3` varchar(45) DEFAULT NULL,
  `s4` varchar(45) DEFAULT NULL,
  `s5` varchar(45) DEFAULT NULL,
  `s6` varchar(45) DEFAULT NULL,
  `s7` varchar(45) DEFAULT NULL,
  `s8` varchar(45) DEFAULT NULL,
  `s9` varchar(45) DEFAULT NULL,
  `s10` varchar(45) DEFAULT NULL,
  `s11` varchar(45) DEFAULT NULL,
  `s12` varchar(45) DEFAULT NULL,
  `sexamen` varchar(45) DEFAULT NULL,
  `matieregroupevalide` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `tacheafaire`
--

CREATE TABLE `tacheafaire` (
  `idtacheAfaire` int(11) NOT NULL,
  `libelleTache` varchar(45) DEFAULT NULL,
  `echTacheAfaire` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `tarifs`
--

CREATE TABLE `tarifs` (
  `idtarifs` int(11) NOT NULL,
  `montant1groupe` float DEFAULT NULL,
  `montant2groupe` float DEFAULT NULL,
  `montant3groupe` float DEFAULT NULL,
  `anneeRef` varchar(45) DEFAULT NULL,
  `sessionRef` int(11) DEFAULT NULL,
  `remiseImediat` float DEFAULT NULL,
  `remise3groupe` float DEFAULT NULL,
  `remiseannuelle` float DEFAULT NULL,
  `idpaiement` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `timestamps`
--

CREATE TABLE `timestamps` (
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `username` varchar(16) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(32) NOT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `adresse`
--
ALTER TABLE `adresse`
  ADD PRIMARY KEY (`idadresse`);

--
-- Index pour la table `affectation`
--
ALTER TABLE `affectation`
  ADD PRIMARY KEY (`idaffectation`);

--
-- Index pour la table `assiduité`
--
ALTER TABLE `assiduité`
  ADD PRIMARY KEY (`idassiduité`);

--
-- Index pour la table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`category_id`);

--
-- Index pour la table `charge`
--
ALTER TABLE `charge`
  ADD PRIMARY KEY (`idcharge`);

--
-- Index pour la table `charges`
--
ALTER TABLE `charges`
  ADD PRIMARY KEY (`idcharges`);

--
-- Index pour la table `conseiladmin`
--
ALTER TABLE `conseiladmin`
  ADD PRIMARY KEY (`idconseilAdmin`);

--
-- Index pour la table `conseilpedgogique`
--
ALTER TABLE `conseilpedgogique`
  ADD PRIMARY KEY (`idconseilPedgogique`);

--
-- Index pour la table `contart`
--
ALTER TABLE `contart`
  ADD PRIMARY KEY (`idcontart`);

--
-- Index pour la table `cours`
--
ALTER TABLE `cours`
  ADD PRIMARY KEY (`idcours`);

--
-- Index pour la table `enseignant`
--
ALTER TABLE `enseignant`
  ADD PRIMARY KEY (`idenseignant`);

--
-- Index pour la table `etudiant`
--
ALTER TABLE `etudiant`
  ADD PRIMARY KEY (`idetudiant`),
  ADD KEY `fk_etudiant_module1_idx` (`listemodule`),
  ADD KEY `fk_etudiant_inscription1_idx` (`inscription`),
  ADD KEY `fk_etudiant_assiduité1_idx` (`listeAbsence`),
  ADD KEY `fk_etudiant_evaluation1_idx` (`listeEvaluation`),
  ADD KEY `fk_etudiant_assiduité2_idx` (`listePresence`),
  ADD KEY `fk_etudiant_adresse1_idx` (`adresse`);

--
-- Index pour la table `evaluation`
--
ALTER TABLE `evaluation`
  ADD PRIMARY KEY (`idevaluation`);

--
-- Index pour la table `examen`
--
ALTER TABLE `examen`
  ADD PRIMARY KEY (`idexamen`);

--
-- Index pour la table `groupe`
--
ALTER TABLE `groupe`
  ADD PRIMARY KEY (`idgroupe`),
  ADD KEY `fk_groupe_session1_idx` (`idsession`),
  ADD KEY `fk_groupe_planning1_idx` (`planning`),
  ADD KEY `fk_groupe_enseignant1_idx` (`enseignant`),
  ADD KEY `fk_groupe_etudiant1_idx` (`idetudiant`),
  ADD KEY `fk_groupe_module1_idx` (`module`);

--
-- Index pour la table `groupe_has_inscription`
--
ALTER TABLE `groupe_has_inscription`
  ADD KEY `fk_groupe_has_inscription_groupe1_idx` (`groupe_idgroupe`),
  ADD KEY `fk_groupe_has_inscription_groupe2_idx` (`groupe_salle_idsalle`),
  ADD KEY `fk_groupe_has_inscription_inscription1_idx` (`inscription_etudiant_idetudiant`),
  ADD KEY `fk_groupe_has_inscription_inscription2_idx` (`inscription_idinscription`),
  ADD KEY `fk_groupe_has_inscription_groupe3_idx` (`groupe_matiere_idmatiere`),
  ADD KEY `fk_groupe_has_inscription_groupe4_idx` (`groupe_horraire_idhorraire`);

--
-- Index pour la table `horraire`
--
ALTER TABLE `horraire`
  ADD PRIMARY KEY (`idhorraire`);

--
-- Index pour la table `inscription`
--
ALTER TABLE `inscription`
  ADD PRIMARY KEY (`idinscription`),
  ADD KEY `fk_inscription_module1_idx` (`listeachat`),
  ADD KEY `fk_inscription_groupe1_idx` (`idgroupe`),
  ADD KEY `fk_inscription_paiement1_idx` (`idpaiement`);

--
-- Index pour la table `materiel`
--
ALTER TABLE `materiel`
  ADD PRIMARY KEY (`idmateriel`);

--
-- Index pour la table `matiere`
--
ALTER TABLE `matiere`
  ADD PRIMARY KEY (`idmatiere`),
  ADD KEY `fk_matiere_module1_idx` (`module`),
  ADD KEY `fk_matiere_cours1_idx` (`cours`),
  ADD KEY `fk_matiere_examen1_idx` (`examen`),
  ADD KEY `fk_matiere_seance1_idx` (`listeSeance`);

--
-- Index pour la table `module`
--
ALTER TABLE `module`
  ADD PRIMARY KEY (`idmodule`),
  ADD KEY `fk_module_matiere1_idx` (`listeMatière`);

--
-- Index pour la table `paiement`
--
ALTER TABLE `paiement`
  ADD PRIMARY KEY (`idpaiement`);

--
-- Index pour la table `planning`
--
ALTER TABLE `planning`
  ADD PRIMARY KEY (`idplanning`),
  ADD KEY `fk_planning_horraire1_idx` (`horLunPlanning`),
  ADD KEY `fk_planning_horraire2_idx` (`horMarPlanning`),
  ADD KEY `fk_planning_horraire3_idx` (`horMercPlanning`),
  ADD KEY `fk_planning_horraire4_idx` (`horJeuPlanning`),
  ADD KEY `fk_planning_horraire5_idx` (`horVenPlanning`),
  ADD KEY `fk_planning_horraire6_idx` (`horSamPlanning`),
  ADD KEY `fk_planning_horraire7_idx` (`horDimPlanning`),
  ADD KEY `fk_planning_session1_idx` (`session`),
  ADD KEY `fk_planning_groupe1_idx` (`groupe`);

--
-- Index pour la table `repartition`
--
ALTER TABLE `repartition`
  ADD PRIMARY KEY (`idrepartition`);

--
-- Index pour la table `reunion`
--
ALTER TABLE `reunion`
  ADD PRIMARY KEY (`idreunion`);

--
-- Index pour la table `salle`
--
ALTER TABLE `salle`
  ADD PRIMARY KEY (`idsalle`);

--
-- Index pour la table `seance`
--
ALTER TABLE `seance`
  ADD PRIMARY KEY (`idseance`),
  ADD KEY `fk_seance_groupe1_idx` (`groupe`),
  ADD KEY `fk_seance_horraire1_idx` (`horraire`),
  ADD KEY `fk_seance_matiere1_idx` (`matiere`);

--
-- Index pour la table `session`
--
ALTER TABLE `session`
  ADD PRIMARY KEY (`idsession`),
  ADD KEY `fk_session_charge1_idx` (`charge`),
  ADD KEY `fk_session_groupe1_idx` (`idGroupe`);

--
-- Index pour la table `suivipedagogique`
--
ALTER TABLE `suivipedagogique`
  ADD PRIMARY KEY (`idsuivipedagogique`);

--
-- Index pour la table `tacheafaire`
--
ALTER TABLE `tacheafaire`
  ADD PRIMARY KEY (`idtacheAfaire`);

--
-- Index pour la table `tarifs`
--
ALTER TABLE `tarifs`
  ADD PRIMARY KEY (`idtarifs`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `adresse`
--
ALTER TABLE `adresse`
  MODIFY `idadresse` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `affectation`
--
ALTER TABLE `affectation`
  MODIFY `idaffectation` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `assiduité`
--
ALTER TABLE `assiduité`
  MODIFY `idassiduité` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `charge`
--
ALTER TABLE `charge`
  MODIFY `idcharge` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `charges`
--
ALTER TABLE `charges`
  MODIFY `idcharges` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `conseiladmin`
--
ALTER TABLE `conseiladmin`
  MODIFY `idconseilAdmin` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `conseilpedgogique`
--
ALTER TABLE `conseilpedgogique`
  MODIFY `idconseilPedgogique` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `contart`
--
ALTER TABLE `contart`
  MODIFY `idcontart` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `cours`
--
ALTER TABLE `cours`
  MODIFY `idcours` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `enseignant`
--
ALTER TABLE `enseignant`
  MODIFY `idenseignant` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `etudiant`
--
ALTER TABLE `etudiant`
  MODIFY `idetudiant` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `evaluation`
--
ALTER TABLE `evaluation`
  MODIFY `idevaluation` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `examen`
--
ALTER TABLE `examen`
  MODIFY `idexamen` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `groupe`
--
ALTER TABLE `groupe`
  MODIFY `idgroupe` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `horraire`
--
ALTER TABLE `horraire`
  MODIFY `idhorraire` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `inscription`
--
ALTER TABLE `inscription`
  MODIFY `idinscription` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `materiel`
--
ALTER TABLE `materiel`
  MODIFY `idmateriel` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `matiere`
--
ALTER TABLE `matiere`
  MODIFY `idmatiere` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `module`
--
ALTER TABLE `module`
  MODIFY `idmodule` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `paiement`
--
ALTER TABLE `paiement`
  MODIFY `idpaiement` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `planning`
--
ALTER TABLE `planning`
  MODIFY `idplanning` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `repartition`
--
ALTER TABLE `repartition`
  MODIFY `idrepartition` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `reunion`
--
ALTER TABLE `reunion`
  MODIFY `idreunion` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `salle`
--
ALTER TABLE `salle`
  MODIFY `idsalle` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `seance`
--
ALTER TABLE `seance`
  MODIFY `idseance` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `session`
--
ALTER TABLE `session`
  MODIFY `idsession` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `suivipedagogique`
--
ALTER TABLE `suivipedagogique`
  MODIFY `idsuivipedagogique` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `tacheafaire`
--
ALTER TABLE `tacheafaire`
  MODIFY `idtacheAfaire` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `tarifs`
--
ALTER TABLE `tarifs`
  MODIFY `idtarifs` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
