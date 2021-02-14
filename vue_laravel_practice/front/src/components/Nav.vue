<template>
  <div class="flex">
    <h1 class="ml-5">Vue Laravel Practice</h1>
    <div class="m-auto">
      <router-link to="/">Home</router-link> |
      <router-link to="/about">About</router-link> |
      <router-link to="/signup">Signup</router-link>
    </div>
    <span class="mr-5">User Name</span>
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'

export default defineComponent({
  name: 'Nav',
})
</script>
