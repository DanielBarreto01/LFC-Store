import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.example.composedices.model.Product
import com.example.composedices.ui.theme.BackgroundColor
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ProductItem(product: Product,navController: NavController) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(350.dp)
            .shadow(
                4.dp,
                RectangleShape,
                clip = false,
                ambientColor = Color.Gray,
                spotColor = Color.Gray
            )
            .background(BackgroundColor)
            .clickable { navController.navigate("productDetail/${product.id}") }, // Navegar a la pantalla de detalles

        elevation = CardDefaults.cardElevation(4.dp),

        shape = RectangleShape // Sin esquinas curvas
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxWidth()
                .background(BackgroundColor)

        ) {
            val (image, name, price, discount) = createRefs()

            // Imagen del producto
            Image(
                painter = painterResource(id = product.image),
                contentDescription = "Producto",
                contentScale = ContentScale.Crop, // Ajusta la imagen para llenar el espacio
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Red)
                    .constrainAs(image) {
                        top.linkTo(parent.top)
                        start.linkTo(parent.start)
                        end.linkTo(parent.end)
                        height = Dimension.percent(0.7f) // 70% de la altura de la Card
                    }
            )

            // Nombre del producto
            Text(
                fontSize = 12.sp,
                text = product.name,
                color = Color.Black,
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                modifier = Modifier
                    .constrainAs(name) {
                        top.linkTo(image.bottom, margin = 8.dp)
                        start.linkTo(parent.start)
                    }
                    .wrapContentSize()
            )

        // Precio con descuento
            Text(
                fontSize = 12.sp,
                text = product.discountPrice,
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                color = Color.Red,
                modifier = Modifier
                    .constrainAs(price) {
                        top.linkTo(name.bottom, margin = 4.dp)
                        start.linkTo(parent.start)
                    }
                    .wrapContentSize()
            )

            // Precio original tachado
            Text(
                fontSize = 12.sp,
                text = product.originalPrice,
                style = MaterialTheme.typography.titleLarge.copy(fontWeight = FontWeight.Bold),
                color = Color.Gray,
                modifier = Modifier
                    .constrainAs(discount) {
                        top.linkTo(price.bottom, margin = 4.dp)
                        start.linkTo(parent.start)
                    }
                    .wrapContentSize()
            )
        }
    }
}