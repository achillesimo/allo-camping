campingApp.directive('markerss', function (){
	var marker = {};
	return {
		restrict :  'E',
		scope : {
			markersModels : '='
		}
	};
});