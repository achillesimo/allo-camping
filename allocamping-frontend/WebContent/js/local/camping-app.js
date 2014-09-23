var campingApp = new angular.module('campingApp', ['ngRoute','google-maps']);

campingApp.config(function ($routeProvider) {
	$routeProvider
	.when('/', {
		templateUrl: 'pages/map.htm',
		controller: 'HomeCtrl'
	})
	.when('/signup', {
		templateUrl: 'pages/signup.htm',
		controller: 'UsersCtrl'
	})
	.when('/proposer-camping', {
		templateUrl: 'pages/proposer-camping.htm',
		controller: 'CampingCtrl'
	})
	.when('/camping/:id', {
		templateUrl: 'pages/detail-camping.htm',
		controller: 'CampingCtrl'
	})
	.when('/connexion', {
		templateUrl: 'pages/connect.htm',
		controller: 'connectCtrl'
	})	
	.when('/rechercher-camping', {
		templateUrl: 'pages/rechercher-camping.htm',
		controller: 'RechcampingCtrl'
	})
	.otherwise({ redirectTo: '/' });
});

