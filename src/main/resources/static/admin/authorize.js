var app = angular.module("app", []);
app.controller("ctrl", function ($scope, $http) {
    console.log("dsadas");
    $http
        .get("/admin/authorities")
        .then((response) => {
            $scope.db = response.data;
            console.log(response.data);
            console.log();
        })
        .catch((error) => {
            // Handle errors if the requet fails
            console.error("Error fetching data:", error);
        });

    $scope.index_of = function (username, role) {
        try {
            return $scope.db.authorities.findIndex(
                (a) => a.account.userName == username && a.role.roleId == role
            );
        } catch (error) {
            console.log(error);
        }
    };
    $scope.update = function (username,aid, role) {
        var index = $scope.index_of(username, role);
        if (index >= 0) {
            var id = $scope.db.authorities[index].authId;
            $http.delete(`/admin/authorities/${id}`).then((result) => {
                $scope.db.authorities.splice(index, 1);
            });
        } else {
            var authority = {
                account: {
                    accountId: aid
                },
                role: {
                    roleId: role
                },
            };
            $http.post(`/admin/authorities`, authority).then((result) => {
                $scope.db.authorities.pus(resp.data);
            });
        }
    };
});