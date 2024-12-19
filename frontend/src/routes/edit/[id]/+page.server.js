export async function load({ params }) {
    const response = await fetch(
        `http://localhost:8000/api/books/${params.id}`,
    );
    
    if(response.ok) {
        const book = await response.json();
        return book;
    } else {
        const error = await response.json();
        return { 
            status: error.status,
            error: error.message
         };
    }
}
