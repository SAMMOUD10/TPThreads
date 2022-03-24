# TPThreads

- Ce TP est pour objectif d'implémenter une petite application Client Serveur en utilisant le principe de thread. le thread est en fait une suite linéaire
et continue d'instructions qui sont exécutées séquentiellement les unes après les autres. En fait, le langage Java est multi-thread, c'est-à-dire 
qu'il peut faire cohabiter plusieurs fils d’exécution de façon indépendante.
- Ce travail est s'inspirer de la vidéo numéro 4 et 5 du playlist intitulé la programmation réseaux.

# Classe ServerMT (Serveur Multi Threads):
Voici l'ensemble d'instruction du code utilisé pour établir la classe ServerMT:
- Premièrement j'ai créer une classe nommé ServerMT qui hérite de la classe Thread
- J'ai redéfinir la méthode run dont lequel je vais créer ServerSocket
- J'ai crée le ServerSocket et  j'attend jusqu'a la connexion est établie
- J'ai crée la classe conversation qui désigne en fait le client.
- J'implément les deux instructions bloquant (lecture et ecriture)

![class server](https://user-images.githubusercontent.com/102219821/160017857-f1d6a87c-5aa7-4c73-b8b1-84408af39d16.png)

- Suite de la classe ServerMT: ********************************************************

![class server 2](https://user-images.githubusercontent.com/102219821/160017919-2c9e2799-722d-4511-828c-edb54dbdb996.png)

# Exécution
- Lancement du serveur: ****************************************************************

![démarrage du serveur](https://user-images.githubusercontent.com/102219821/160018492-abe134ef-9d2b-4357-bc07-5b3db70a7ca2.png)

- Lancement du client telnet: ****************************************************************

![démarrage du client](https://user-images.githubusercontent.com/102219821/160018533-a28dff82-49c2-4757-b995-fdc9792edcb7.png)

- Le client envoi une chaîne du caractère au serveur et recevoir par la suite le sa longueur

![jenvoie au serveur une requete](https://user-images.githubusercontent.com/102219821/160018758-784de9fe-05f9-4062-a56d-03bbec12742b.png)

- Le serveur reçoit la chaîne dy caractère envoyé par le client et calculer sa longueur et après renvoie le résultat au client

![calculer la longueur et envoie au client](https://user-images.githubusercontent.com/102219821/160018874-d04f141f-f1d4-4826-8593-1bce026f4cf3.png)
