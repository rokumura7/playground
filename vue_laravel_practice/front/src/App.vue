<template>
  <Nav />
  <div class="h-full">
    <router-view />
  </div>
</template>

<script lang="ts">
import { defineComponent } from 'vue'
import Nav from '@/components/Nav.vue'

export default defineComponent({
  name: 'App',
  components: { Nav },
})
</script>
