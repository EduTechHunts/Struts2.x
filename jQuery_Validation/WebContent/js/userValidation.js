$(function() {
	$("#form").validate({
		rules : {
			name : {
				required : true,
				minlength : 4,
				maxlength : 20,
				customvalidation : true
			}
		},
		messages : {
			name : {
				required : "Please enter a name",
				minlength : $.format("Minimum {0} characters required!"),
				maxlength : $.format("Maximum {0} characters allowed!")

			}
		}
	});
	$.validator.addMethod("customvalidation", function(value, element) {
		return /^[A-Za-z\_ -]+$/.test(value);
	}, "Alpha Characters Only.");
});
