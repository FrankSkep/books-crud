<script>
    export let data, action;
    const isEditing = data.id !== undefined;
</script>

<!-- Formulario para agregar/editar -->
<form on:submit|preventDefault={action}>
    <div class="form-group">
        {#if isEditing}
            <label for="id">Id</label>
            <input type="text" id="id" bind:value={data.id} class="form-control" readonly />
        {/if}
        <div class="mb-3">
            <label for="title">Title</label>
            <input type="text" id="title" bind:value={data.titulo} class="form-control" required />
        </div>
        <div class="mb-3">
            <label for="author">Author</label>
            <input type="text" id="author" bind:value={data.autor} class="form-control" required />
        </div>
        <div class="mb-3">
            <label for="edition">Edition</label>
            <input type="text" id="edition" bind:value={data.edicion} class="form-control" required />
        </div>
        <div class="mb-3">
            <label for="pages">Pages</label>
            <input type="number" id="pages" bind:value={data.numPaginas} class="form-control" required />
        </div>
    </div>
    <button type="submit" class="btn btn-primary">{isEditing ? 'Update' : 'Save'}</button>
</form>
