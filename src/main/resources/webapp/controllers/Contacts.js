var demoApp = angular.module('demoApp',['ngTable']);

demoApp.controller('ContactsCtrl',function($scope){
    $scope.names=[
    {name:'Ben Lai', suburb:'Wantirna'},
    {name:'Joyce Luc', suburb:'Scoresby'}
    ];


$scope.addPerson = function(){

    $scope.names.push({
    name: $scope.person_name,
    suburb: $scope.person_suburb
    })
    $scope.person_name = "";
    $scope.person_suburb = "";

    };
});