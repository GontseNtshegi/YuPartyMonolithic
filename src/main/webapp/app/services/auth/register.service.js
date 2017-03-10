(function () {
    'use strict';

    angular
        .module('yuPartyMonolithicApp')
        .factory('Register', Register);

    Register.$inject = ['$resource'];

    function Register ($resource) {
        return $resource('api/register', {}, {});
    }
})();
