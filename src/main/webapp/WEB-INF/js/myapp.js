/* global menu */
$(function(){
    //creating the active menu 
    switch (menu){
        case'About Us':
            $('#about').addClass('active');
            break;
        case'Contact Us':
            $('#contact').addClass('active');
            break; 
            case 'All Products':
             $('#listProducts').addClass('active');
            break; 
        default :
            if(menu == "Home")
                break;
            $('#listProd').addClass('active');
            $('#a_'+menu).addClass('active');
            break;
    }
    // Jquery dataTable code
    var products = [
        ['1','A'],
        ['2','AB'],
        ['3','ABC'],
        ['4','ABCD'],
        ['5','ABCDE']
        ['6','ABCDEF']
    ];
    var $table = $('#productListTable');
    //execute the below code only where we have this table
    if($table.length){
        console.log('Inside the table');
    }
});
