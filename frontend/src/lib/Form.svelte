<script>
    export let data, action;
    const isEditing = data.id !== undefined;
</script>

<!-- Formulario para agregar/editar -->
 <div class="container-sm">
    <!-- Formulario para agregar/editar -->
    <form on:submit|preventDefault={action}>
        {#if isEditing}
            <div class="mb-3">
                <label for="id" class="form-label">Id</label>
                <input type="text" id="id" class="form-control" bind:value={data.id} readonly />
            </div>
        {/if}
        <div class="mb-3">
            <label for="title" class="form-label">Title</label>
            <input type="text" id="title" class="form-control" bind:value={data.titulo} required />
        </div>
        <div class="mb-3">
            <label for="author" class="form-label">Author</label>
            <input type="text" id="author" class="form-control" bind:value={data.autor} required />
        </div>
        <div class="mb-3">
            <label for="edition" class="form-label">Edition</label>
            <input type="text" id="edition" class="form-control" bind:value={data.edicion} required />
        </div>
        <div class="mb-3">
            <label for="pages" class="form-label">Pages</label>
            <input type="number" id="pages" class="form-control" bind:value={data.numPaginas} required />
        </div>
        <button type="submit" class="btn btn-primary">{isEditing ? 'Update' : 'Save'}</button>
    </form>
</div>

<!-- <form on:submit|preventDefault={action}>
    {#if isEditing}
        <label for="id">Id</label>
        <input type="text" id="id" bind:value={data.id} readonly />
    {/if}
    <label for="title">Title</label>
    <input type="text" id="title" bind:value={data.titulo} required />
    <label for="author">Author</label>
    <input type="text" id="author" bind:value={data.autor} required />
    <label for="edition">Edition</label>
    <input type="text" id="edition" bind:value={data.edicion} required />
    <label for="pages">Pages</label>
    <input type="number" id="pages" bind:value={data.numPaginas} required />
    <button type="submit">{isEditing ? 'Update' : 'Save'}</button>
</form> -->
