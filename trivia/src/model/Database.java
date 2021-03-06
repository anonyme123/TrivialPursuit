//AUTEUR : Hugo TALBOT


//DESCRIPTION:
//Base de données permettant de gérer les questions à poser au joueur


//INFO :
//
//
package model;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import org.apache.derby.jdbc.EmbeddedDriver;

public class Database {

   public void Derby() {
      Connection conn = null;
      PreparedStatement pstmt;
      Statement stmt;
      ResultSet rs = null;
      
      String createSQL = "create table questions ("
      + "id integer not null generated always as"
      + " identity (start with 1, increment by 1),   "
      + "question varchar(100) not null, "
      + "answer1 varchar(100),"
      + "answer2 varchar(100),"
      + "answer3 varchar(100),"
      + "category varchar(100),"
      + "correctanswer integer,"
      + "constraint primary_key primary key (id))";
 
      try {
         Driver derbyEmbeddedDriver = new EmbeddedDriver();
         DriverManager.registerDriver(derbyEmbeddedDriver);
         conn = DriverManager.getConnection("jdbc:derby:database;create=true");
         conn.setAutoCommit(false);
         stmt = conn.createStatement();
         
         try { ///on ne créé la database que si elle n'existe pas déjà
        	 stmt.execute(createSQL);

             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel bar se situe Place des Terreaux et à une enseigne verte ?");
             pstmt.setString(2, "L'Ayers Rock");
             pstmt.setString(3, "Le Boston");
             pstmt.setString(4, "Les Poupées Russes");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Où se situe le bar Le Johnny Walsh");
             pstmt.setString(2, "Fourvière");
             pstmt.setString(3, "Vieux Lyon");
             pstmt.setString(4, "Bellecour");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Depuis quand célèbre-t-on la fête des Lumières ?");
             pstmt.setString(2, "1997");
             pstmt.setString(3, "1998");
             pstmt.setString(4, "1999");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Dans quel bar peut on voir des concerts les jeudis, vendredis et samedi ?");
             pstmt.setString(2, "L'Eden Rock");
             pstmt.setString(3, "Le Court-Circuit");
             pstmt.setString(4, "Le malting pot");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel quartier est réputé pour ses \"bouchons\" ?");
             pstmt.setString(2, "Les Quais du Rhône");
             pstmt.setString(3, "Confluences");
             pstmt.setString(4, "Le Vieux Lyon");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quelle rue surnomme-t-on la rue de la soif ?");
             pstmt.setString(2, "Rue de la République");
             pstmt.setString(3, "Rue Sainte Catherine");
             pstmt.setString(4, "Rue Mercière");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel est le quartier idéal pour avoir une belle vue de Lyon ?");
             pstmt.setString(2, "Fourvière");
             pstmt.setString(3, "Etats-Unis");
             pstmt.setString(4, "Monplaisir");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel est le plus grand parc de Lyon ?");
             pstmt.setString(2, "Blandan");
             pstmt.setString(3, "Tête-d'Or");
             pstmt.setString(4, "Miribel");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Comment s'appellent les vélos disponibles en libre service ?");
             pstmt.setString(2, "Vélib'");
             pstmt.setString(3, "Vélibe");
             pstmt.setString(4, "Vélo'v");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Où se déroulent les \"HH\" de l'école CPE ?");
             pstmt.setString(2, "Foyer");
             pstmt.setString(3, "Double Mixte");
             pstmt.setString(4, "Oxxo");
             pstmt.setString(5, "LyonByNight");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "La commande sh sous linux permet de :");
             pstmt.setString(2, "Exécuter un programme");
             pstmt.setString(3, "Supprimer un fichier");
             pstmt.setString(4, "Supprimer un dossier");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Comment s'écrit 40 en binaire ?");
             pstmt.setString(2, "00010000");
             pstmt.setString(3, "00000001");
             pstmt.setString(4, "00101000");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "L'éditeur de configuration système est aussi appelé :");
             pstmt.setString(2, "sysedit");
             pstmt.setString(3, "msconfig");
             pstmt.setString(4, "configms");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "PHP est un langage exécuté côté :");
             pstmt.setString(2, "Client");
             pstmt.setString(3, "Serveur");
             pstmt.setString(4, "Des deux côtés");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Les partitions permettent :");
             pstmt.setString(2, "De conserver ses données");
             pstmt.setString(3, "De classer plus efficacement vos données");
             pstmt.setString(4, "Toutes ces réponses");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Qu'est-ce que le pagerank ?");
             pstmt.setString(2, "Un algorithme qui classe les résultats sur Google");
             pstmt.setString(3, "Un site qui recense des pages et leur attribue une notation");
             pstmt.setString(4, "Un critère qui baisse lorsque le poids de la page dépasse une certaine valeur");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Le port AGP est apparu en :");
             pstmt.setString(2, "1996");
             pstmt.setString(3, "1997");
             pstmt.setString(4, "1999");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Que fait le code : <?php extract($_POST); ?>");
             pstmt.setString(2, "Il extrait toutes les variables dans un tableau");
             pstmt.setString(3, "Il créer des variables du nom de chaque valeur contenu dans le tableau $_POST");
             pstmt.setString(4, "Il ne fonctionne pas");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Que signifie l'acronyme IBM ? :");
             pstmt.setString(2, "International business management");
             pstmt.setString(3, "International business market");
             pstmt.setString(4, "International business machines");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "L'Hyper Threading est une technologie :");
             pstmt.setString(2, "Qui simule deux processeurs logiques au sein d'un même processeur physique");
             pstmt.setString(3, "Active sur les processeurs AMD");
             pstmt.setString(4, "Qui permet d'aller deux fois plus vite");
             pstmt.setString(5, "Informatique");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel est le titre du second album studio de Stromae, sorti en 2013 ?");
             pstmt.setString(2, "Cheese");
             pstmt.setString(3, "Formidable");
             pstmt.setString(4, "Racine carrée ");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel groupe a interprété la chanson « C.R.E.A.M. » ?");
             pstmt.setString(2, "Public Enemy ");
             pstmt.setString(3, "Cypress Hill");
             pstmt.setString(4, "Wu-Tang Clan");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel titre Robin Thicke a-t-il interprété aux côtés de T.I et Pharell Williams ?");
             pstmt.setString(2, "Blurred Lines");
             pstmt.setString(3, "Everytime");
             pstmt.setString(4, "Call On Me");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quelle chanteuse a pris « le large » dans l’une de ses chansons ?");
             pstmt.setString(2, "Tal");
             pstmt.setString(3, "Vitaa");
             pstmt.setString(4, "Alizée");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel groupe est formé par Thomas Bangalter et Guy-Manuel de Homem-Christo ?");
             pstmt.setString(2, "Poney Poney Run Run");
             pstmt.setString(3, "Daft Punk");
             pstmt.setString(4, "Phoenix");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel groupe a interprété le tube « Do I wanna know » ?");
             pstmt.setString(2, "Oasis");
             pstmt.setString(3, "Maroon 5");
             pstmt.setString(4, "Arctic Monkeys");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel artiste interprète le tube \"Berzerk\" ?");
             pstmt.setString(2, "Kanye West");
             pstmt.setString(3, "Soprano");
             pstmt.setString(4, "Eminem");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Comment était surnommé le saxophoniste Charlie Parker ?");
             pstmt.setString(2, "The Duke");
             pstmt.setString(3, "The Bird");
             pstmt.setString(4, "The Boss");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel chanteur a interprété la chanson « Rue des étoiles » ?");
             pstmt.setString(2, "Calogero");
             pstmt.setString(3, "Roch Voisine ");
             pstmt.setString(4, "Grégoire");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel DJ a créé l’événement avec son tube «Wake me up ! » ?");
             pstmt.setString(2, "David Guetta ");
             pstmt.setString(3, "Avicii");
             pstmt.setString(4, "Calvin Harris");
             pstmt.setString(5, "Musique");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quelle est la monnaie officielle de la Colombie ?");
             pstmt.setString(2, "Le Peso");
             pstmt.setString(3, "Le Peso Colombien");
             pstmt.setString(4, "Le dollar");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel pays a la plus grande superficie ?");
             pstmt.setString(2, "Canada");
             pstmt.setString(3, "Chine");
             pstmt.setString(4, "Russie");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Où a vécu Pablo Escobar ?");
             pstmt.setString(2, "Colombie");
             pstmt.setString(3, "Argentine");
             pstmt.setString(4, "Espagne");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quelle est la religion majoritaire en Inde ?");
             pstmt.setString(2, "Le bouddhisme");
             pstmt.setString(3, "L'hindouisme");
             pstmt.setString(4, "Le jainisme");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quels sont les pays provenant du continent Océanie ?");
             pstmt.setString(2, "Bolivie et USA");
             pstmt.setString(3, "Australie et Nouvelle Zelande");
             pstmt.setString(4, "Bresil et Chili");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quelle est la capitale de Madagascar ?");
             pstmt.setString(2, "Tanarivo");
             pstmt.setString(3, "Antanarivo");
             pstmt.setString(4, "Antananarivo");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quelle province du Canada a une autonomie energetique en pétrole?");
             pstmt.setString(2, "Alberta");
             pstmt.setString(3, "Manitoba");
             pstmt.setString(4, "Quebec");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Lequel de ces pays a l’espagnol comme langue officielle ?");
             pstmt.setString(2, "Portugal");
             pstmt.setString(3, "Bresil");
             pstmt.setString(4, "Cuba");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Laquelle de ces villes n’est pas d’Allemagne ?");
             pstmt.setString(2, "Dresde");
             pstmt.setString(3, "Munich");
             pstmt.setString(4, "Zurich");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel pays n’a pas de vert sur son drapeau national?");
             pstmt.setString(2, "Tunisie");
             pstmt.setString(3, "Mexique");
             pstmt.setString(4, "Madagascar");
             pstmt.setString(5, "Voyage");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Qui a terminé en tant que numero un mondial au tennis en 2013 ?");
             pstmt.setString(2, "Rafael Nadal");
             pstmt.setString(3, "Roger Federer");
             pstmt.setString(4, "Djokovic");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quelle équipe de handball a gagné les jeux Olympiques de 2008 et 2012 ?");
             pstmt.setString(2, "Danemark");
             pstmt.setString(3, "France");
             pstmt.setString(4, "Espagne");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quand est-ce que le Mexique a gagne la coupe du monde de football ?");
             pstmt.setString(2, "1970");
             pstmt.setString(3, "1986");
             pstmt.setString(4, "Ils ne l'ont jamais gagne");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "La marque Jordan est une derivee de laquelle de ces marques ?");
             pstmt.setString(2, "Adidas");
             pstmt.setString(3, "Nike");
             pstmt.setString(4, "Puma");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Qui a gagne la coupe Stanley en 1993 ?");
             pstmt.setString(2, "Rangers De New York");
             pstmt.setString(3, "Penguin De Pittsburgh");
             pstmt.setString(4, "Canadiens De Montreal");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Combien de periodes y a t-il dans une partie de Hockey ?");
             pstmt.setString(2, "1");
             pstmt.setString(3, "2");
             pstmt.setString(4, "3");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quelle est la discipline olympique de Charles Hamelin ?");
             pstmt.setString(2, "Le Patinage de Vitesse");
             pstmt.setString(3, "Le Bobsleigh");
             pstmt.setString(4, "Le Hockey");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Le Superbowl est la finale de quel sport ?");
             pstmt.setString(2, "Soccer");
             pstmt.setString(3, "Football");
             pstmt.setString(4, "Hockey");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Combien de combats Mohammed Ali a-t-il remporté durant sa carrière ?");
             pstmt.setString(2, "50");
             pstmt.setString(3, "56");
             pstmt.setString(4, "48");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel est le sport joué par les Soeurs Williams?");
             pstmt.setString(2, "Le Tennis ");
             pstmt.setString(3, "Le Football");
             pstmt.setString(4, "Le Basketball");
             pstmt.setString(5, "Sport");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Comment se nomme le mechant dans les schtroumpfs ?");
             pstmt.setString(2, "Gargamez");
             pstmt.setString(3, "Gargamel");
             pstmt.setString(4, "Gourgamel");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel est le nom du chien dans la bande dessinée Garfield? ");
             pstmt.setString(2, "Ozie");
             pstmt.setString(3, "Odile");
             pstmt.setString(4, "Odie");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Qui interprète le génie dans Aladdin dans la version originale du film ?");
             pstmt.setString(2, "Robin Williams");
             pstmt.setString(3, "Wil Weaton");
             pstmt.setString(4, "Jerry Seinfeld");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Qui est le réalisateur de Kill Bill ?");
             pstmt.setString(2, "Tim Burton");
             pstmt.setString(3, "Woody Allen");
             pstmt.setString(4, "Quentin Tarantino");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Quel est l’acteur principal de Titanic ?");
             pstmt.setString(2, "Brad Pitt");
             pstmt.setString(3, "George Clonney");
             pstmt.setString(4, "Leonardi Di Caprio");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Qui est le personnage principal de la série The Walking Dead?");
             pstmt.setString(2, "Rick");
             pstmt.setString(3, "Daryl");
             pstmt.setString(4, "Glenn");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Comment s’appelle le troisième roman d’Harry Potter ?");
             pstmt.setString(2, "Harry Potter et la Coupe de Feu");
             pstmt.setString(3, "Harry Potter et le Prisonnier d'Azkaban");
             pstmt.setString(4, "Harry Potter et la Chambre des secrets");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 2);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Qui sont les principaux personnages de Narnia ?");
             pstmt.setString(2, "Peter, Edmund, Susan & Lucy");
             pstmt.setString(3, "Violet, Klaus & Sunny");
             pstmt.setString(4, "Alvin, Theodore & Simon");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 1);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "Qui chante ‘Baby One More Time’ ?");
             pstmt.setString(2, "Madonna");
             pstmt.setString(3, "Lady Gaga");
             pstmt.setString(4, "Britney Spears");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             pstmt = conn.prepareStatement("insert into questions (question,answer1,answer2,answer3,category,correctanswer) values(?,?,?,?,?,?)");
             pstmt.setString(1, "De quelle couleur est la robe de la princesse dans “la belle et la bete” ?");
             pstmt.setString(2, "Rose");
             pstmt.setString(3, "Bleue");
             pstmt.setString(4, "Jaune");
             pstmt.setString(5, "Divertissement");
             pstmt.setInt(6, 3);
             pstmt.executeUpdate();
             
             conn.commit();
            
         } catch (SQLException se) {
             if (!se.getSQLState().equals("X0Y32"))
             throw se;
         } 
         

         /*rs = stmt.executeQuery("select * from questions");
         while (rs.next()) {
            System.out.printf("%d %s %s %s %s %s %d\n",
            rs.getInt(1), rs.getString(2),
            rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
         }*/
         
         rs = stmt.executeQuery("select * from questions where category like 'Divertissement' order by random() fetch first row only");
         while (rs.next()) {
            System.out.printf("%d %s %s %s %s %s %d\n",
            rs.getInt(1), rs.getString(2),
            rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7));
         }         

      } catch (SQLException ex) {
         System.out.println("in connection" + ex);
      }

      try {
         DriverManager.getConnection
            ("jdbc:derby:;shutdown=true");
      } catch (SQLException ex) {
         if (((ex.getErrorCode() == 50000) &&
            ("XJ015".equals(ex.getSQLState())))) {
               System.out.println("Derby shut down normally");
         } else {
            System.err.println("Derby did not shut down normally");
            System.err.println(ex.getMessage());
         }
      }
   }
}
