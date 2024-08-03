<script>
    import Wrapper from '../../../lib/Wrapper.svelte';
    import Form from '../../../lib/Form.svelte';
    import { goto } from '$app/navigation';

    export let data; // Obtencion del libro a editar

    async function updateBook(event) {
        event.preventDefault();

        // Obtencion datos del formulario
        const book = {
            titulo: data.titulo,
            autor: data.autor,
            edicion: data.edicion,
            numPaginas: data.numPaginas
        };

        try {
            const response = await fetch(`http://localhost:8000/book/${data.id}`, {
                method: 'PUT',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(book)
            });

            if (response.ok) {
                alert('Book updated successfully');
                goto('/');
            } else {
                const error = await response.json();
                alert(`Failed to update book: ${error.message}`);
            }
        } catch (error) {
            alert(`Error: ${error.message}`);
        }
    }

</script>

<Wrapper>
    <h1>Editing book</h1>
    <Form {data} action={updateBook} />
</Wrapper>
