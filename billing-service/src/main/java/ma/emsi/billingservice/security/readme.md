<h2>Partie 1 </h2>

<h2>Création d'un compte Admin </h2>
<img src="pictures\admin.jpg">

<h2>Création d'une Realm </h2>
<img src="pictures\realm.jpg">

<h2>Création d'un client à sécuriser </h2>
<img src="pictures\client.jpg">

<h2>Création des utilisateurs </h2>
<img src="pictures\user1_creation.jpg">
<img src="pictures\password_user1.jpg">
<img src="pictures\user2_creation.jpg">
<img src="pictures\user2_password.jpg">

<h2>Création des rôles </h2>
<img src="pictures\role_user.jpg">
<img src="pictures\role_admin.jpg">

<h2>Affectation des rôles aux utilisateurs</h2>
<img src="pictures\role_mapping_user1.jpg">
<img src="pictures\role_mapping_user2.jpg">

<h2>Teste l'authentification avec le mot de passe</h2>
<img src="pictures\users1.jpg">
<img src="pictures\user2.jpg">

<h2>Analyse les contenus des deux JWT</h2>
<p>Le token fourni est un JWT (JSON Web Token) signé avec l’algorithme RS256, garantissant son intégrité et son authenticité. Il est émis par Keycloak (realm Intissar-realm) et utilisé comme Bearer Token pour sécuriser l’accès aux services.

Il contient les informations essentielles d’authentification et d’autorisation, notamment l’identifiant de l’utilisateur, les rôles (realm et resource), les scopes (email, profile) ainsi que les dates de création et d’expiration, permettant un contrôle d’accès sécurisé dans une architecture microservices.</p>
<img src="pictures\user1-token1.1.jpg">
<img src="pictures\user1-token1.jpg">
<img src="pictures\user1-token2.jpg">

<p>Ce token est un JWT signé avec l’algorithme RS256 et émis par Keycloak (realm Intissar-realm). Il est utilisé comme Bearer Token pour sécuriser l’accès aux services.

Il contient les informations d’authentification et d’autorisation de l’utilisateur, notamment les rôles (ADMIN, USER), les scopes (email, profile) ainsi que les dates de création et d’expiration, permettant un contrôle d’accès basé sur les rôles dans une architecture microservices.</p>
<img src="pictures\user2-token1.1.jpg">
<img src="pictures\user2-token1.jpg">
<img src="pictures\user2-token2.jpg">

<h2>Teste l'authentification avec le  Refresh Token</h2>
<img src="pictures\user2_refresh_token.jpg">

<h2>Teste l'authentification avec Client ID et Client Secret</h2>
<img src="pictures\users_Client Secret.jpg">

<h2>Changement des paramètres </h2>
<img src="pictures\login-customization1.jpg">
<img src="pictures\login-customization2.jpg">
<img src="pictures\otp.jpg">
<img src="pictures\Password_policy.jpg">

<h1>Partie 2</h1>

<h2>Création d'un client </h2>
<img src="pictures\clientang.jpg">

<h2>test d'authentification pour GET produit </h2>
<img src="pictures\get product secur.jpg">

<h2>test d'authentification dans app angular </h2>
<img src="pictures\auth products.jpg">
<img src="pictures\product auth ang 2.jpg">
<img src="pictures\product auth ang.jpg">

<h2>Creation du copmte  USERS par defaut dans app angular </h2>
<img src="pictures\register.jpg">
<img src="pictures\register2.jpg">

<h2>OTP user2 </h2>
<img src="pictures\otp user2 anf.jpg">
