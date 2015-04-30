(function(angular) {
    angular.module("blogApp.controllers", []);
    angular.module("blogApp.services", []);
    angular.module("blogApp", ["ngResource", "blogApp.controllers", "blogApp.services", "angular-carousel"]);
}(angular));
