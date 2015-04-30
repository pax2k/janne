(function(angular) {
    var ItemController = function($scope, Item) {
        Item.query(function(response) {
            $scope.items = response ? response : [];
        });
    };

    var ImageShowController = function($scope, ImageShow) {
        ImageShow.query(function(response) {
            $scope.ImageShow = response ? response : [];
        });
    };

    ItemController.$inject = ['$scope', 'Item'];
    angular.module("blogApp.controllers").controller("ItemController", ItemController);

    ImageShowController.$inject = ['$scope', 'ImageShow'];
    angular.module("blogApp.controllers").controller("ImageShowController", ImageShowController);
}(angular));