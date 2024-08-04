<script>
    import { goto } from '$app/navigation';
    export let books;

    function navigateToEditBook(id) {
        goto(`/edit/${id}`);
    }

    function navigateToDelBook(id) {
        const confirmed = confirm('Are you sure you want to delete this book?');
        if (confirmed) {
            goto(`/delete/${id}`);
        }
    }

    let showToast = false;
    let toastMessage = "Mostroxd";
    let col = "success";

    function triggerToast() {
      showToast = true;
      setTimeout(() => showToast = false, 3000); // Oculta el toast después de 3 segundos
    }
</script>


<h1 class="text-center my-4">Book List</h1>

<table class="table table-striped table-hover">
    <thead class="table-dark">
        <tr>
            <th scope="col">Id</th>
            <th scope="col">Title</th>
            <th scope="col">Author</th>
            <th scope="col">Edition</th>
            <th scope="col">Pages</th>
            <th scope="col">Actions</th>
        </tr>
    </thead>
    <tbody>
        {#each $books as book}
            <tr>
                <td>{book.id}</td>
                <td>{book.titulo}</td>
                <td>{book.autor}</td>
                <td>{book.edicion}</td>
                <td>{book.numPaginas}</td>
                <td>
                    <button class="btn btn-primary btn-sm me-2" on:click={() => navigateToEditBook(book.id)}>Edit</button>
                    <button class="btn btn-danger btn-sm" on:click={() => navigateToDelBook(book.id)}>Delete</button>
                </td>
            </tr>
        {/each}
    </tbody>
</table>