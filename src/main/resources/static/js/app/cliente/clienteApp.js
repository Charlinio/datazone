'use strict'
angular.module('clienteModule', []).controller('clienteController', ['$scope', '$http', '$window',
function($scope, $http, $window) {
    $scope.cliente = {
        id: null,
        codigo: null,
        nombreCliente: null,
        direccion: null,
        telefono: null
    }

    $scope.clientes = [];

    //Listar
    function listClientes() {
        $http.get('/cliente/listar').then(
            (response) => {
                $scope.clientes = response.data;
            }
        );
    }

    $scope.save = (cliente) => {
        $http.post('/cliente/agregar', cliente).then(
            (response) => {
                $window.alert('Cliente guardado con exito');
            }
        );
    }

    listClientes();
}]);