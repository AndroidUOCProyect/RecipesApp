package com.example.recipe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView myrecyclerView;
    RecyclerViewAdapter myAdapter;

    List<Recipes> recipes1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipes1 = new ArrayList<>();
        recipes1.add(new Recipes("Chicken Roll","200 gr de pollo picado en cubos" +
                "1 tomate picado mediano" +
                "1/2 pizca de chile rojo en polvo" +
                "2 cucharadas de aceite vegetal" +
                "1/2 cut into strips cucumber" +
                "1/2 cucharada de hojas de cilantro picadas" +
                "1 cebolla grande en rodajas finas" +
                "2 chiles verdes medianos picados" +
                "2 pizcas de garam masala en polvo" +
                "1 gajos de limón" +
                "1 teaspoon tomato ketchup" +
                "1 cucharadita de salsa de tomate","Method",
                "Chicken Roll es una deliciosa receta del norte de la India hecha con harina para todo uso, pollo salteado, yogur y una variedad de vegetales enrollados en paranthas. En los días que no quieras preparar una comida elaborada, este delicioso plato puede ser un salvador. Los rollos son bastante populares en toda la India y, a menudo, son el refrigerio favorito de la noche. El rollo de huevo, el rollo de kebab Kathi, el rollo de cordero, el rollo de paneer, el rollo de patata e incluso el rollo de pescado se encuentran entre sus muchas variaciones. Esta receta fácil de panecillos está hecha con pollo y tiene el inolvidable aroma de las especias indias. También puede utilizar sus parathas y chapatis sobrantes para hacer esta receta. Si no te gusta usar harina para todo uso o maida, también puedes hacerlo con harina integral. De hecho, se puede hacer incluso con restos de pollo. Lo único que tienes que asegurarte es que utilizas la cantidad adecuada de especias para que no se pierda el sabor. Fácil de empacar y transportar, también puede llevarlo a la oficina o prepararlo para picnics y excursiones de un día. ¡Una receta de rollo que debes probar para todos los amantes del pollo!\n",R.drawable.chicken_roll));

        recipes1.add(new Recipes("Donut","1 c. whole milk" +
                "1/4 taza más 1 cucharadita azúcar granulada, dividida" +
                "1 paquete (o 2 1/4 cucharaditas) de levadura seca activa" +
                "4 c. harina para todo uso, y más si es necesario" +
                "1/2 cucharadita sal kosher" +
                "6 cucharada mantequilla derretida" +
                "2 huevos grandes" +
                "1/2 cucharadita extracto puro de vainilla" +
                "Aceite de canola o vegetal, para freír","Method","\n" +
                "Engrase un tazón grande con aceite en aerosol y reserve. En un tazón pequeño apto para microondas o una taza medidora de vidrio, agregue la leche. Microondas hasta que esté tibio, 40 segundos. Agregue una cucharadita de azúcar y revuelva para disolver, luego espolvoree sobre la levadura y deje reposar hasta que esté espumoso, aproximadamente 8 minutos.\n" +
                "Hacer glaseado: en un tazón grande, mezcle la leche, el azúcar en polvo y la vainilla hasta que quede suave. Dejar de lado.\n" +
                "Cubra una bandeja para hornear grande con toallas de papel. En un horno holandés grande a fuego medio, caliente 2'' de aceite a 350°. Cocine las donas, en lotes, hasta que estén profundamente doradas por ambos lados, aproximadamente 1 minuto por lado. ¡Los agujeros se cocinarán aún más rápido!\n" +
                "Transfiera las donas a una bandeja para hornear forrada con toallas de papel para que se escurran y se enfríen un poco. Sumerja en el glaseado, luego colóquelo en una rejilla para enfriar. (¡o come inmediatamente!)",R.drawable.donut1));
        recipes1.add(new Recipes("Dosa","3 tazas de arroz" +
                "1 taza de urad daal (gramo negro partido, sin piel)"+
                "3/4 cucharadita de semillas de fenogreco" +
                "Sal (al gusto)" +
                "Aceite de cocina vegetal / canola / girasol","Method",
                "Lava bien el arroz y el urad daal. Agregue las semillas de fenogreco a la mezcla y llene suficiente agua en el tazón de arroz daal para cubrirlas aproximadamente 2 pulgadas de profundidad. Remoja durante la noche.\n" +
                "Ponga un poco de aceite de cocina en un tazón pequeño y manténgalo listo. También necesitará un recipiente con agua helada, una sartén antiadherente grande y plana, 2 hojas de papel toalla, un cucharón, una espátula y una brocha para rociar.\n" +
                "Cuando la superficie superior comience a verse cocida (ya no se verá blanda ni líquida), voltee la dosa. En este momento, idealmente, la superficie que estaba debajo debería tener un color dorado claro. Cocine por 1 minuto después de voltear.\n" +
                "La dosa está casi lista. Dóblelo por la mitad y deje cocinar por 30 segundos más.",R.drawable.dosa1));
        recipes1.add(new Recipes("Pancake","1 1/4 cups milk" +
                "1 huevo" +
                "3 cucharadas de mantequilla derretida" +
                "1 1/2 tazas de harina para todo uso" +
                "3 1/2 cucharaditas de polvo de hornear" +
                "1 cucharadita de sal" +
                "1 cucharada de azúcar blanca","Method",
                "En un tazón grande, tamice la harina, el polvo de hornear, la sal y el azúcar. Haz un hueco en el centro y vierte la leche, el huevo y la mantequilla derretida; mezcle hasta que quede suave" +
                "Caliente una plancha o sartén ligeramente engrasada a fuego medio alto. Vierta o saque la masa en la plancha, usando aproximadamente 1/4 de taza para cada panqueque. Dorar por ambos lados y servir caliente.",R.drawable.pancakes));
        recipes1.add(new Recipes("Pasta","1 tsp oil" +
                "1 cucharadita de mantequilla" +
                "2 diente de ajo, finamente picado" +
                "1 pulgada de jengibre, finamente picado" +
                "½ cebolla, finamente picada" +
                "1 taza de pulpa de tomate" +
                "¼ cucharadita de cúrcuma / haldi" +
                "½ cucharadita de polvo de chile rojo de Cachemira" +
                "2 cucharada de salsa de tomate" +
                "½ cucharadita de garam masala","Method",
                "En primer lugar, saltee 1 pulgada de jengibre y 2 dientes de ajo en 1 cucharadita de aceite y 1 cucharadita de mantequilla." +
                "saltee más ½ cebolla hasta que se ablanden." +
                "agregue adicionalmente 1 taza de pulpa de tomate y saltee bien." +
                "siga revolviendo hasta que la pulpa de tomate espese." +
                "ahora agregue ¼ de cucharadita de cúrcuma, ½ cucharadita de chile en polvo, ½ cucharadita de garam masala y ½ cucharadita de sal." +
                "saltee hasta que las especias se cocinen por completo." +
                "ahora agregue 2 cucharadas de maíz, ¼ de pimiento, ¼ de zanahoria, 2 cucharadas de guisantes y 7 floretes de brócoli. saltear por un minuto." +
                "agregue 3 cucharadas de agua y mezcle bien." +
                "cubra y cocine a fuego lento durante 5 minutos." +
                "ahora agregue 2 cucharadas de salsa de tomate y ½ cucharadita de hierbas mixtas. mezclar bien." +
                "agregue la pasta cocida y mezcle suavemente hasta que la salsa se cubra bien." +
                "finalmente, sirva pasta masala al estilo indio caliente cubierta con queso si es necesario.",R.drawable.pasta1));



        myrecyclerView = (RecyclerView)findViewById(R.id.recyclerView_id);

        myAdapter = new RecyclerViewAdapter(this,recipes1);

        myrecyclerView.setLayoutManager(new GridLayoutManager(this,1));

        myrecyclerView.setAdapter(myAdapter);



    }

}
