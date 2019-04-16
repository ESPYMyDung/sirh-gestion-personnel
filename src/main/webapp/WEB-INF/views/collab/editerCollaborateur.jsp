<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>

<head>
	<meta charset="UTF-8">
	<title>SGO-App</title>
	<link rel="stylesheet"
		href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
		integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
		crossorigin="anonymous">
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
		integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
		crossorigin="anonymous"></script>
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
		integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
		integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
		crossorigin="anonymous"></script>
	<title>Editer Collaborateur</title>
</head>

<body>
	<h1>Nouveau Collaborateur</h1>

	<form class="needs-validation" method="post" novalidate>
		<div class="form-group row">
			<label class="col-sm-2 col-form-label" for="nom">Nom</label>
			<input type="text" class="form-control" name="nom" required />
			<div class="invalid-feedback">Le nom est obligatoire</div>
		</div>

		<div class="form-group row">
			<label class="col-sm-2 col-form-label" for="prenom">Prenom</label>
			<input type="text" class="form-control" name="prenom" required />
			<div class="invalid-feedback">Le prenom est obligatoire</div>
		</div>

		<div class="form-group row">
			<label class="col-sm-2 col-form-label" for="DdN">Date de Naissance</label>
			<input type="text" class="form-control" name="DdN" required />
			<div class="invalid-feedback">La date de naissance est obligatoire</div>
		</div>

		<div class="form-group row">
			<label class="col-form-label" for="adresse">Adresse</label>
			<input type="text" class="form-control" name="adresse" required />
			<div class="invalid-feedback">L'adresse est obligatoire</div>
		</div>

		<div class="form-group row">
			<label class="col-form-label" for="SS">Numéro de Sécurité Sociale</label>
			<input type="text" class="form-control" name="SS" required />
			<div class="invalid-feedback">Le numéro de sécurité sociale est obligatoire</div>
		</div>

		<div class="text-right">
			<input type="submit" classe="btn" data-toggle="modal" data-target="#creerModal" value="Créer" />
		</div>

	</form>


</body>

</html>