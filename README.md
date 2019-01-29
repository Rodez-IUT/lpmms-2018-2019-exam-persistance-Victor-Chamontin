#### NOM CHAMONTIN Prénom VICTOR 


## LP MMS / 2018-2019 /Examen pratique / Persistance des données

Vous disposez de 2h00 pour réaliser le TP. 

- L'usage des téléphones mobiles est interdit.
- Les documents papiers sont interdits.
- Il est strictement interdit de communiquer de manière directe ou indirecte, de quelque manière que ce soit
(messagerie instantanée, SMS, forum, réseaux sociaux, communication orale, etc.) avec une personne autre
que les enseignants en charge de la surveillance.
Toute violation de cet interdit entraînera **une sanction lourde immédiate et est susceptible de poursuite
pour fraude à examen**.

### Préliminaire

Inscrivez votre nom et votre prénom en tête de ce fichier et effectuez **un push contenant cette unique modification** sur votre projet Github.

Pour cette épreuve, vous allez travailler à partir d'un repository Github contenant un projet très fortement inspiré du projet OurbusinessProject.
Pour créer et accéder à votre repository Github, vous devez vous connecter à l'adresse communiquée par votre surveillant et suivre les instructions affichées.
Votre travail s'effectuera sur votre machine local après avoir cloné le repository Github qui a été créé pour vous.
Le rendu de votre travail s'effectura via  un **_push_ unique**  de vos modifications sur votre repository Github **en fin de séance** :
- une pénalité de 5 points sera appliquée à toute personne effectuant un *push* de son projet avant la fin de la séance ;
- toute personne ayant terminé son projet avant les 2 heures allouées devra tout de même attendre la fin de l'épreuve pour effectuer son *push*.

Vous devez répondre aux questions ouvertes directement dans ce fichier là où apparaissent les commentaires **"// A COMPLETER"**.

Il est strictement interdit de modifier le code contenu dans les classes _Bootstrap_, _InitializationService_ et _OurBusinessprojectApplication_.

Il est strictement interdit de modifier le code contenu dans les classes de test.  

### Prise en main du projet

1. Naviguez dans le projet, vérifiez qu'il a bien été reconnu votre IDE comme un projet Maven. Étudiez les classes du projet.
2. Lancez l'ensemble des tests est vérifiez que tous les tests passent exceptés ceux de la classe _"ZEvaluationM2DLTest"_.

Récupérez le contenu du fichier ENONCE.md disponible à l'URL fourni par votre enseignant et insérez le à la suite de ce fichier 

Question 1 :
La garanti qu'apporte flush dans le bon fonctionnement de la requète est que flush va permettre de
synchroniser le contexte persistant avec la base de données sous-jacante. Ainsi les modifications détectés par ce mécanisme 
sont envoyées vers la base de données sous de forme de requète SQL. Lorsque une instance d'entité  entre dans l'état "détaché"
, ses modifications ne sont plus prises en comptes    


Question 2 :
La méthode merge permet d'attacher l'entity à l'entité Manager courante. Ainsi cette opération permet d'associer
une entité à une autre entity manager que celui qui a été utiliser pour créer ou lire. Ainsi cela permet
d'insérer de nouveaux objets et de mettre à jour ceux existants.   

Question 3 :
Dans cette méthode, on essaye de faire un vérouillage lors de modification simultanée des projets.
On prend un projet existante que l'on charge dans le contexte peristant actuel, puis on les modifies
avec la transaction jdbc pour simuler l'accès courrant. Puis on modifie le projet de l'entity manager.
On espère qu'il n'y ai pas d'exception.
On modifie le projet en lui attribuant le titre de "New Title" puis avec une requète préparer on lui
attribye l'id du projet 1.






