(function(angular) {
    var ItemFactory = function($resource) {
        return $resource('/items/:id', {
            id: '@id'
        });
    };

    var ImageShowFactory = function($resource) {
        return $resource('/imageShow/:id', {
            id: '@id'
        });
    };

    ItemFactory.$inject = ['$resource'];
    angular.module("blogApp.services").factory("Item", ItemFactory);

    ImageShowFactory.$inject = ['$resource'];
    angular.module("blogApp.services").factory("ImageShow", ImageShowFactory);
}(angular));