/**
 * Created by rajgopal on 20/11/16.
 */
var UserApp = angular.module('UserApp',[]);
UserApp.controller('UserAppCtrl',function($scope, userFactory) {

    $scope.userData;
    $scope.genderList = ["Male","Female"];

    /**
     * function which sends the link address entered by the user and in response gets the details of the issue
     */
    $scope.getData = function() {
        var data = {};
        //$scope.loading = true; //enabling loading
        data["firstName"] = $scope.firstName;
        data["lastName"] = $scope.lastName;
        data["age"] = $scope.age;
        data["dob"] = $scope.dob;
        data["gender"] = $scope.gender;
        data["contact"] = $scope.contact;
        data["info"] = $scope.info;
        userFactory.getData(data).success(function(response) {
            console.log(response);
            $scope.loading = false; //disabling loading
        });
    };

    $scope.getUserData = function() {
        var data = {};
        $scope.loading = true; //enabling loading
        data["search"] = $scope.search;
        userFactory.getUserData(data).success(function(response) {
            console.log(response);
            $scope.userData = response;
        });
    };
    $scope.getData();
});

UserApp.factory('userFactory', ['$http', function($http) {
    var userFactory = {};

    var config = {
        headers : {
            'Content-Type': 'application/json;charset=utf-8;'
        }
    };

    /**
     * http request which call the api for getting the details
     */
    userFactory.getData = function(data) {
        return $http.post('/adduser', data, config);
    };

    userFactory.getUserData = function(data) {
        return $http.post('/searchuser', data, config);
    };

    return userFactory;
}]);