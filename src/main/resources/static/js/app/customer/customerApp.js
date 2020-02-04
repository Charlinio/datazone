'use strict'
angular.module('customerModule', []).controller('customerController', ['$scope', '$http', '$window',
function($scope, $http, $window) {
    $scope.customer = {
        id: null,
        codigo: null,
        nombreCliente: null,
        direccion: null,
        telefono: null
    }

    $scope.clientes = [];

    //Listar
    function listClientes() {
        $http.get('/cliente/list').then()
    }
}]);