# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 82 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 405 | `qa-9e54c733-d6ea-40a1-8aba-b4a8cb88f46b` |
| 2 | `POST /v1/auth/token` | 200 | 209 | `qa-8017c2bb-2406-4ab5-bb18-e912f9aaaac4` |
| 3 | `GET /v1/accounts/me` | 200 | 62 | `qa-2fb87afc-25b4-426b-a385-682c9604444e` |
| 4 | `GET /v1/accounts/me` | 200 | 24 | `qa-c4b19190-8cbb-4b0b-b52f-6bed8c6dd04f` |
| 5 | `GET /v1/accounts/me` | 200 | 32 | `qa-3e926079-e0f5-4e7f-bd32-ad8000835c7e` |
| 6 | `GET /v1/accounts/me` | 200 | 15 | `qa-ff4d5ef3-a971-427b-85cf-b2eeb8c85d6b` |
| 7 | `GET /v1/accounts/me` | 200 | 15 | `qa-50399433-f4b3-4d01-95dd-fe63970522ad` |
| 8 | `GET /v1/accounts/me` | 200 | 17 | `qa-85bbea4a-ce29-4196-916d-a9efbf08ec8e` |
| 9 | `GET /v1/accounts/me` | 200 | 15 | `qa-2d69a2cc-1327-47da-a4a5-84970b49b707` |
| 10 | `GET /v1/accounts/me` | 200 | 18 | `qa-a92ea72c-f007-4a05-bf04-0c807b9017ba` |
| 11 | `GET /v1/accounts/me` | 200 | 14 | `qa-cc167860-934a-47d1-97f4-286d49f8875f` |
| 12 | `GET /v1/accounts/me` | 200 | 19 | `qa-dcb97e49-6fb2-4881-a1d2-76056f326965` |
| 13 | `GET /v1/accounts/me` | 200 | 13 | `qa-848da233-fdae-417d-9495-3b4c289fa61c` |
| 14 | `GET /v1/accounts/me` | 200 | 15 | `qa-dcb6a748-cd85-4ed0-a436-729d768327da` |
| 15 | `GET /v1/accounts/me` | 200 | 17 | `qa-83b0246f-9e7a-4878-a2ba-cba1f162db49` |
| 16 | `GET /v1/accounts/me` | 200 | 9 | `qa-9583cd8a-d8d0-443a-b895-b6959c27818c` |
| 17 | `GET /v1/accounts/me` | 200 | 8 | `qa-7c354db4-18d9-47b0-b319-4607a6507639` |
| 18 | `GET /v1/accounts/me` | 200 | 9 | `qa-2e3716d0-0bc9-4391-8c79-3cbf25813b4d` |
| 19 | `GET /v1/accounts/me` | 200 | 14 | `qa-b39c391b-b2d0-49d1-9ba4-59892a1dd084` |
| 20 | `GET /v1/accounts/me` | 200 | 10 | `qa-de885ddd-875a-48f7-a4d0-82addf8bfa0e` |
| 21 | `GET /v1/accounts/me` | 200 | 11 | `qa-cb507a8a-3be9-45ad-adf7-19d396f668bd` |
| 22 | `GET /v1/accounts/me` | 200 | 21 | `qa-5858d642-a05b-43ec-9919-ec1f055d8fc1` |
| 23 | `GET /v1/accounts/me` | 200 | 15 | `qa-730f7197-9425-40e4-8a31-a8c2edc682b1` |
| 24 | `GET /v1/accounts/me` | 200 | 7 | `qa-8bb18bbd-34a2-4120-81a5-87db8d4deac6` |
| 25 | `GET /v1/accounts/me` | 200 | 7 | `qa-f42be3e8-8231-4602-a6c5-3ae25958826a` |
| 26 | `GET /v1/accounts/me` | 200 | 12 | `qa-37471c36-78ed-41dc-99c8-81464b2c2d7c` |
| 27 | `GET /v1/accounts/me` | 200 | 8 | `qa-3aba1343-bdf5-41be-b309-e7c4275e1c10` |
| 28 | `GET /v1/accounts/me` | 200 | 9 | `qa-856c0949-458a-4754-ac81-117670a4612f` |
| 29 | `GET /v1/accounts/me` | 200 | 9 | `qa-9c2c00ef-e0df-4f25-b11c-bc3ec31dc989` |
| 30 | `GET /v1/accounts/me` | 200 | 10 | `qa-92a6f8c9-7c7c-4fee-a656-371c0d661805` |
| 31 | `GET /v1/accounts/me` | 200 | 12 | `qa-26aad2a6-f116-42c6-8192-987d881ce0ed` |
| 32 | `GET /v1/accounts/me` | 200 | 7 | `qa-3960efaf-2305-4a95-ae18-4b3bb18ca666` |
| 33 | `GET /v1/accounts/me` | 200 | 9 | `qa-f5e30da1-9200-4efb-9ad0-4ec8f8f4f629` |
| 34 | `GET /v1/accounts/me` | 200 | 12 | `qa-fd10d103-f547-4849-b574-7f2e12889099` |
| 35 | `GET /v1/accounts/me` | 200 | 10 | `qa-db21c025-9f47-43d0-a47a-928a685e7b58` |
| 36 | `GET /v1/accounts/me` | 200 | 6 | `qa-29f8ed05-ddd0-4629-9c10-6026b2a9a0e4` |
| 37 | `GET /v1/accounts/me` | 200 | 9 | `qa-9fe5ea88-6466-4085-abad-c40f96451400` |
| 38 | `GET /v1/accounts/me` | 200 | 8 | `qa-4004531c-04ed-41bc-bb00-3dd04e2a9b45` |
| 39 | `GET /v1/accounts/me` | 200 | 7 | `qa-7ef6af81-7e78-4aa0-8226-3d3cc898c0de` |
| 40 | `GET /v1/accounts/me` | 200 | 10 | `qa-26888290-71b8-474a-ae3f-c37ac556bb16` |
| 41 | `GET /v1/accounts/me` | 200 | 7 | `qa-61d60e77-ce89-4428-9977-402b67cb0e92` |
| 42 | `GET /v1/accounts/me` | 200 | 7 | `qa-ddbf8dc1-a0d8-40fa-954d-64f5de3adea8` |
| 43 | `GET /v1/accounts/me` | 200 | 10 | `qa-3be95a2b-3a61-4725-b166-9f4bf77281c7` |
| 44 | `GET /v1/accounts/me` | 200 | 9 | `qa-82c4de16-55b0-4122-9c83-58fefe095dd9` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-91fa9b9d-49bb-43bc-bf6b-7a5b6a82680c` |
| 46 | `GET /v1/accounts/me` | 200 | 10 | `qa-89cda87c-d9dc-4760-aee6-17e80932763d` |
| 47 | `GET /v1/accounts/me` | 200 | 20 | `qa-171761dd-b0fc-4339-b679-f6a0067c57f5` |
| 48 | `GET /v1/accounts/me` | 200 | 25 | `qa-d9d6436d-6471-424d-9c56-d165f6bb14e4` |
| 49 | `GET /v1/accounts/me` | 200 | 9 | `qa-e5a739a5-312f-48fc-a939-4a392538b5bf` |
| 50 | `GET /v1/accounts/me` | 200 | 12 | `qa-a8729839-5277-4ee1-aa11-e1dbcde412f5` |
| 51 | `GET /v1/accounts/me` | 200 | 18 | `qa-ce171aab-1920-421d-b0df-ec58c583f9eb` |
| 52 | `GET /v1/accounts/me` | 200 | 18 | `qa-90737a88-6d8e-4d57-bc46-7c9d02bda0c8` |
| 53 | `GET /v1/accounts/me` | 200 | 9 | `qa-fcfd836e-433c-412a-9b5c-e3ceb68a1b09` |
| 54 | `GET /v1/accounts/me` | 200 | 14 | `qa-b2fba861-137c-453b-bc97-7fc202078aa3` |
| 55 | `GET /v1/accounts/me` | 200 | 8 | `qa-86f63cb0-38a1-4eed-b910-eb04cbb0e980` |
| 56 | `GET /v1/accounts/me` | 200 | 5 | `qa-6e81b777-6068-4724-aba4-ef0884049127` |
| 57 | `GET /v1/accounts/me` | 200 | 7 | `qa-3093ab0d-cfc8-44fc-b555-e14fa0dfc7d3` |
| 58 | `GET /v1/accounts/me` | 200 | 5 | `qa-cd166219-7a5b-4cde-b810-cb9e54439fa4` |
| 59 | `GET /v1/accounts/me` | 200 | 5 | `qa-28b06d22-9f61-4987-9ccb-6e5369b9867f` |
| 60 | `GET /v1/accounts/me` | 200 | 7 | `qa-9237d9e9-8904-4314-83b7-d15ff92f9c2a` |
| 61 | `GET /v1/accounts/me` | 200 | 6 | `qa-5a95c807-a9b7-40af-8926-546470344786` |
| 62 | `GET /v1/accounts/me` | 200 | 5 | `qa-f7aa6912-91fd-4b06-98d4-5a3ae5378d9b` |
| 63 | `GET /v1/accounts/me` | 429 | 5 | `qa-2cebd21e-b048-484c-9562-864b0768ec8f` |
| 64 | `GET /v1/accounts/me` | 429 | 8 | `qa-4d26747f-4a0d-4d34-a7a3-f935e5d09aaa` |
| 65 | `GET /v1/accounts/me` | 429 | 6 | `qa-65243c11-15f1-4719-9b8c-60e0fec46333` |
| 66 | `GET /v1/accounts/me` | 429 | 4 | `qa-8b4a2ae7-484d-4350-bf01-7235c213f3df` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-eb88075d-9050-404b-b5e0-f72caa130eb3` |
| 68 | `GET /v1/accounts/me` | 429 | 5 | `qa-4c4f86d4-5d6e-4eeb-8ec1-201e9717bd11` |
| 69 | `GET /v1/accounts/me` | 429 | 5 | `qa-76b88150-a31b-4b2b-9967-ebdfbf9316a6` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-9e0a93b1-dc79-4460-b191-f42e625b05d8` |
| 71 | `GET /v1/accounts/me` | 429 | 5 | `qa-7cd97299-27b4-490c-82ba-87b4b5afdbeb` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-e1fdaa94-4030-4f11-a501-79625e9b0dcb` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-08623028-8144-4fd3-a1f5-a883e9d9bbf7` |
| 74 | `GET /v1/accounts/me` | 429 | 5 | `qa-d6072672-d71f-475e-b621-594d9abe431a` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-7155ad9a-ca98-4546-bd99-8272eb677d15` |
| 76 | `GET /v1/accounts/me` | 429 | 4 | `qa-9f119913-d4c2-4159-af83-3efc3d42750d` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-5927e267-a78c-4b49-aa76-9bce5a92df0a` |
| 78 | `GET /v1/accounts/me` | 429 | 4 | `qa-3a8d3ead-0795-40aa-a8e2-9a6b67b9eb79` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-51e72ebe-13e3-49e6-98dd-170a2a4f5677` |
| 80 | `GET /v1/accounts/me` | 200 | 4 | `qa-806c6841-499a-4283-8b46-8adf9f98ab98` |
| 81 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-350ec062-de3f-4166-9e0b-e653747e4501` |
| 82 | `POST /v1/auth/token` | 401 | 4 | `qa-8cde52b6-9d17-455e-9a67-3331dc5b2670` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-9e54c733-d6ea-40a1-8aba-b4a8cb88f46b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e54c733-d6ea-40a1-8aba-b4a8cb88f46b
Content-Type: application/json

--- request body ---
{"handle":"qa-9157c233c977","displayName":"QA 9157c233c977","password":"****","region":"eu"}

--- response: 201 in 405 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e54c733-d6ea-40a1-8aba-b4a8cb88f46b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 598
RateLimit-Reset: 10
Location: /v1/accounts/qa-9157c233c977
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-8017c2bb-2406-4ab5-bb18-e912f9aaaac4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8017c2bb-2406-4ab5-bb18-e912f9aaaac4
Content-Type: application/json

--- request body ---
{"handle":"qa-9157c233c977","password":"****"}

--- response: 200 in 209 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-8017c2bb-2406-4ab5-bb18-e912f9aaaac4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 594
RateLimit-Reset: 10
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-2fb87afc-25b4-426b-a385-682c9604444e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2fb87afc-25b4-426b-a385-682c9604444e
Content-Type: application/json

--- response: 200 in 62 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-2fb87afc-25b4-426b-a385-682c9604444e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-c4b19190-8cbb-4b0b-b52f-6bed8c6dd04f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4b19190-8cbb-4b0b-b52f-6bed8c6dd04f
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 06 Nov 2026 09:30:37 GMT
Content-Type: application/json
X-Correlation-Id: qa-c4b19190-8cbb-4b0b-b52f-6bed8c6dd04f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e926079-e0f5-4e7f-bd32-ad8000835c7e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e926079-e0f5-4e7f-bd32-ad8000835c7e
Content-Type: application/json

--- response: 200 in 32 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e926079-e0f5-4e7f-bd32-ad8000835c7e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 57
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff4d5ef3-a971-427b-85cf-b2eeb8c85d6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff4d5ef3-a971-427b-85cf-b2eeb8c85d6b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff4d5ef3-a971-427b-85cf-b2eeb8c85d6b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 56
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-50399433-f4b3-4d01-95dd-fe63970522ad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-50399433-f4b3-4d01-95dd-fe63970522ad
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-50399433-f4b3-4d01-95dd-fe63970522ad
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 55
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-85bbea4a-ce29-4196-916d-a9efbf08ec8e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-85bbea4a-ce29-4196-916d-a9efbf08ec8e
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-85bbea4a-ce29-4196-916d-a9efbf08ec8e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 54
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-2d69a2cc-1327-47da-a4a5-84970b49b707

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2d69a2cc-1327-47da-a4a5-84970b49b707
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2d69a2cc-1327-47da-a4a5-84970b49b707
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 53
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-a92ea72c-f007-4a05-bf04-0c807b9017ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a92ea72c-f007-4a05-bf04-0c807b9017ba
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-a92ea72c-f007-4a05-bf04-0c807b9017ba
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 52
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc167860-934a-47d1-97f4-286d49f8875f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc167860-934a-47d1-97f4-286d49f8875f
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-cc167860-934a-47d1-97f4-286d49f8875f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 51
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-dcb97e49-6fb2-4881-a1d2-76056f326965

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcb97e49-6fb2-4881-a1d2-76056f326965
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcb97e49-6fb2-4881-a1d2-76056f326965
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 50
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-848da233-fdae-417d-9495-3b4c289fa61c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-848da233-fdae-417d-9495-3b4c289fa61c
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-848da233-fdae-417d-9495-3b4c289fa61c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 49
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-dcb6a748-cd85-4ed0-a436-729d768327da

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dcb6a748-cd85-4ed0-a436-729d768327da
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-dcb6a748-cd85-4ed0-a436-729d768327da
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 48
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-83b0246f-9e7a-4878-a2ba-cba1f162db49

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-83b0246f-9e7a-4878-a2ba-cba1f162db49
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-83b0246f-9e7a-4878-a2ba-cba1f162db49
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 47
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-9583cd8a-d8d0-443a-b895-b6959c27818c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9583cd8a-d8d0-443a-b895-b6959c27818c
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9583cd8a-d8d0-443a-b895-b6959c27818c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 46
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-7c354db4-18d9-47b0-b319-4607a6507639

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7c354db4-18d9-47b0-b319-4607a6507639
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-7c354db4-18d9-47b0-b319-4607a6507639
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 45
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e3716d0-0bc9-4391-8c79-3cbf25813b4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e3716d0-0bc9-4391-8c79-3cbf25813b4d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e3716d0-0bc9-4391-8c79-3cbf25813b4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 44
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-b39c391b-b2d0-49d1-9ba4-59892a1dd084

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b39c391b-b2d0-49d1-9ba4-59892a1dd084
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-b39c391b-b2d0-49d1-9ba4-59892a1dd084
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 43
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-de885ddd-875a-48f7-a4d0-82addf8bfa0e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de885ddd-875a-48f7-a4d0-82addf8bfa0e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-de885ddd-875a-48f7-a4d0-82addf8bfa0e
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 42
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb507a8a-3be9-45ad-adf7-19d396f668bd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb507a8a-3be9-45ad-adf7-19d396f668bd
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb507a8a-3be9-45ad-adf7-19d396f668bd
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 41
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-5858d642-a05b-43ec-9919-ec1f055d8fc1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5858d642-a05b-43ec-9919-ec1f055d8fc1
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-5858d642-a05b-43ec-9919-ec1f055d8fc1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 40
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-730f7197-9425-40e4-8a31-a8c2edc682b1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-730f7197-9425-40e4-8a31-a8c2edc682b1
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-730f7197-9425-40e4-8a31-a8c2edc682b1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 39
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-8bb18bbd-34a2-4120-81a5-87db8d4deac6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8bb18bbd-34a2-4120-81a5-87db8d4deac6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-8bb18bbd-34a2-4120-81a5-87db8d4deac6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 38
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-f42be3e8-8231-4602-a6c5-3ae25958826a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f42be3e8-8231-4602-a6c5-3ae25958826a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f42be3e8-8231-4602-a6c5-3ae25958826a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 37
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-37471c36-78ed-41dc-99c8-81464b2c2d7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37471c36-78ed-41dc-99c8-81464b2c2d7c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-37471c36-78ed-41dc-99c8-81464b2c2d7c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 36
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-3aba1343-bdf5-41be-b309-e7c4275e1c10

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3aba1343-bdf5-41be-b309-e7c4275e1c10
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3aba1343-bdf5-41be-b309-e7c4275e1c10
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 35
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-856c0949-458a-4754-ac81-117670a4612f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-856c0949-458a-4754-ac81-117670a4612f
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-856c0949-458a-4754-ac81-117670a4612f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 34
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-9c2c00ef-e0df-4f25-b11c-bc3ec31dc989

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9c2c00ef-e0df-4f25-b11c-bc3ec31dc989
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9c2c00ef-e0df-4f25-b11c-bc3ec31dc989
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 33
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-92a6f8c9-7c7c-4fee-a656-371c0d661805

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-92a6f8c9-7c7c-4fee-a656-371c0d661805
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-92a6f8c9-7c7c-4fee-a656-371c0d661805
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 32
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-26aad2a6-f116-42c6-8192-987d881ce0ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26aad2a6-f116-42c6-8192-987d881ce0ed
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-26aad2a6-f116-42c6-8192-987d881ce0ed
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 31
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-3960efaf-2305-4a95-ae18-4b3bb18ca666

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3960efaf-2305-4a95-ae18-4b3bb18ca666
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3960efaf-2305-4a95-ae18-4b3bb18ca666
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 30
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-f5e30da1-9200-4efb-9ad0-4ec8f8f4f629

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f5e30da1-9200-4efb-9ad0-4ec8f8f4f629
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-f5e30da1-9200-4efb-9ad0-4ec8f8f4f629
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 29
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-fd10d103-f547-4849-b574-7f2e12889099

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fd10d103-f547-4849-b574-7f2e12889099
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-fd10d103-f547-4849-b574-7f2e12889099
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 28
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-db21c025-9f47-43d0-a47a-928a685e7b58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db21c025-9f47-43d0-a47a-928a685e7b58
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-db21c025-9f47-43d0-a47a-928a685e7b58
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 27
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-29f8ed05-ddd0-4629-9c10-6026b2a9a0e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-29f8ed05-ddd0-4629-9c10-6026b2a9a0e4
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-29f8ed05-ddd0-4629-9c10-6026b2a9a0e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 26
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-9fe5ea88-6466-4085-abad-c40f96451400

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9fe5ea88-6466-4085-abad-c40f96451400
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-9fe5ea88-6466-4085-abad-c40f96451400
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 25
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-4004531c-04ed-41bc-bb00-3dd04e2a9b45

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4004531c-04ed-41bc-bb00-3dd04e2a9b45
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-4004531c-04ed-41bc-bb00-3dd04e2a9b45
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 24
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-7ef6af81-7e78-4aa0-8226-3d3cc898c0de

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7ef6af81-7e78-4aa0-8226-3d3cc898c0de
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-7ef6af81-7e78-4aa0-8226-3d3cc898c0de
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 23
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-26888290-71b8-474a-ae3f-c37ac556bb16

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26888290-71b8-474a-ae3f-c37ac556bb16
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-26888290-71b8-474a-ae3f-c37ac556bb16
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 22
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-61d60e77-ce89-4428-9977-402b67cb0e92

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-61d60e77-ce89-4428-9977-402b67cb0e92
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-61d60e77-ce89-4428-9977-402b67cb0e92
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 21
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-ddbf8dc1-a0d8-40fa-954d-64f5de3adea8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddbf8dc1-a0d8-40fa-954d-64f5de3adea8
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddbf8dc1-a0d8-40fa-954d-64f5de3adea8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 20
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-3be95a2b-3a61-4725-b166-9f4bf77281c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3be95a2b-3a61-4725-b166-9f4bf77281c7
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-3be95a2b-3a61-4725-b166-9f4bf77281c7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-82c4de16-55b0-4122-9c83-58fefe095dd9

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-82c4de16-55b0-4122-9c83-58fefe095dd9
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-82c4de16-55b0-4122-9c83-58fefe095dd9
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-91fa9b9d-49bb-43bc-bf6b-7a5b6a82680c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-91fa9b9d-49bb-43bc-bf6b-7a5b6a82680c
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-91fa9b9d-49bb-43bc-bf6b-7a5b6a82680c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-89cda87c-d9dc-4760-aee6-17e80932763d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-89cda87c-d9dc-4760-aee6-17e80932763d
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-89cda87c-d9dc-4760-aee6-17e80932763d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-171761dd-b0fc-4339-b679-f6a0067c57f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-171761dd-b0fc-4339-b679-f6a0067c57f5
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-171761dd-b0fc-4339-b679-f6a0067c57f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-d9d6436d-6471-424d-9c56-d165f6bb14e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d9d6436d-6471-424d-9c56-d165f6bb14e4
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 06 Nov 2026 09:30:38 GMT
Content-Type: application/json
X-Correlation-Id: qa-d9d6436d-6471-424d-9c56-d165f6bb14e4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-e5a739a5-312f-48fc-a939-4a392538b5bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e5a739a5-312f-48fc-a939-4a392538b5bf
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-e5a739a5-312f-48fc-a939-4a392538b5bf
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-a8729839-5277-4ee1-aa11-e1dbcde412f5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a8729839-5277-4ee1-aa11-e1dbcde412f5
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-a8729839-5277-4ee1-aa11-e1dbcde412f5
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce171aab-1920-421d-b0df-ec58c583f9eb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce171aab-1920-421d-b0df-ec58c583f9eb
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-ce171aab-1920-421d-b0df-ec58c583f9eb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-90737a88-6d8e-4d57-bc46-7c9d02bda0c8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-90737a88-6d8e-4d57-bc46-7c9d02bda0c8
Content-Type: application/json

--- response: 200 in 18 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-90737a88-6d8e-4d57-bc46-7c9d02bda0c8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-fcfd836e-433c-412a-9b5c-e3ceb68a1b09

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-fcfd836e-433c-412a-9b5c-e3ceb68a1b09
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-fcfd836e-433c-412a-9b5c-e3ceb68a1b09
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2fba861-137c-453b-bc97-7fc202078aa3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2fba861-137c-453b-bc97-7fc202078aa3
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2fba861-137c-453b-bc97-7fc202078aa3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 8
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-86f63cb0-38a1-4eed-b910-eb04cbb0e980

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86f63cb0-38a1-4eed-b910-eb04cbb0e980
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-86f63cb0-38a1-4eed-b910-eb04cbb0e980
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 7
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e81b777-6068-4724-aba4-ef0884049127

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e81b777-6068-4724-aba4-ef0884049127
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-6e81b777-6068-4724-aba4-ef0884049127
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 6
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-3093ab0d-cfc8-44fc-b555-e14fa0dfc7d3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3093ab0d-cfc8-44fc-b555-e14fa0dfc7d3
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-3093ab0d-cfc8-44fc-b555-e14fa0dfc7d3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 5
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-cd166219-7a5b-4cde-b810-cb9e54439fa4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cd166219-7a5b-4cde-b810-cb9e54439fa4
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-cd166219-7a5b-4cde-b810-cb9e54439fa4
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 4
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-28b06d22-9f61-4987-9ccb-6e5369b9867f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-28b06d22-9f61-4987-9ccb-6e5369b9867f
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-28b06d22-9f61-4987-9ccb-6e5369b9867f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 3
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-9237d9e9-8904-4314-83b7-d15ff92f9c2a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9237d9e9-8904-4314-83b7-d15ff92f9c2a
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-9237d9e9-8904-4314-83b7-d15ff92f9c2a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 2
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-5a95c807-a9b7-40af-8926-546470344786

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5a95c807-a9b7-40af-8926-546470344786
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-5a95c807-a9b7-40af-8926-546470344786
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 1
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-f7aa6912-91fd-4b06-98d4-5a3ae5378d9b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f7aa6912-91fd-4b06-98d4-5a3ae5378d9b
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/json
X-Correlation-Id: qa-f7aa6912-91fd-4b06-98d4-5a3ae5378d9b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-2cebd21e-b048-484c-9562-864b0768ec8f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cebd21e-b048-484c-9562-864b0768ec8f
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2cebd21e-b048-484c-9562-864b0768ec8f
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2cebd21e-b048-484c-9562-864b0768ec8f"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-4d26747f-4a0d-4d34-a7a3-f935e5d09aaa

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4d26747f-4a0d-4d34-a7a3-f935e5d09aaa
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Fri, 06 Nov 2026 09:30:39 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4d26747f-4a0d-4d34-a7a3-f935e5d09aaa
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 9
Retry-After: 9
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4d26747f-4a0d-4d34-a7a3-f935e5d09aaa"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-65243c11-15f1-4719-9b8c-60e0fec46333

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-65243c11-15f1-4719-9b8c-60e0fec46333
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 06 Nov 2026 09:30:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-65243c11-15f1-4719-9b8c-60e0fec46333
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-65243c11-15f1-4719-9b8c-60e0fec46333"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b4a2ae7-484d-4350-bf01-7235c213f3df

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b4a2ae7-484d-4350-bf01-7235c213f3df
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:40 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8b4a2ae7-484d-4350-bf01-7235c213f3df
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 8
Retry-After: 8
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8b4a2ae7-484d-4350-bf01-7235c213f3df"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-eb88075d-9050-404b-b5e0-f72caa130eb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eb88075d-9050-404b-b5e0-f72caa130eb3
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-eb88075d-9050-404b-b5e0-f72caa130eb3
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-eb88075d-9050-404b-b5e0-f72caa130eb3"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-4c4f86d4-5d6e-4eeb-8ec1-201e9717bd11

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4c4f86d4-5d6e-4eeb-8ec1-201e9717bd11
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:41 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4c4f86d4-5d6e-4eeb-8ec1-201e9717bd11
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 7
Retry-After: 7
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4c4f86d4-5d6e-4eeb-8ec1-201e9717bd11"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-76b88150-a31b-4b2b-9967-ebdfbf9316a6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76b88150-a31b-4b2b-9967-ebdfbf9316a6
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-76b88150-a31b-4b2b-9967-ebdfbf9316a6
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-76b88150-a31b-4b2b-9967-ebdfbf9316a6"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e0a93b1-dc79-4460-b191-f42e625b05d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e0a93b1-dc79-4460-b191-f42e625b05d8
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:42 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9e0a93b1-dc79-4460-b191-f42e625b05d8
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 6
Retry-After: 6
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9e0a93b1-dc79-4460-b191-f42e625b05d8"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-7cd97299-27b4-490c-82ba-87b4b5afdbeb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7cd97299-27b4-490c-82ba-87b4b5afdbeb
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7cd97299-27b4-490c-82ba-87b4b5afdbeb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 5
Retry-After: 5
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7cd97299-27b4-490c-82ba-87b4b5afdbeb"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-e1fdaa94-4030-4f11-a501-79625e9b0dcb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e1fdaa94-4030-4f11-a501-79625e9b0dcb
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:43 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-e1fdaa94-4030-4f11-a501-79625e9b0dcb
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-e1fdaa94-4030-4f11-a501-79625e9b0dcb"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-08623028-8144-4fd3-a1f5-a883e9d9bbf7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08623028-8144-4fd3-a1f5-a883e9d9bbf7
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-08623028-8144-4fd3-a1f5-a883e9d9bbf7
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 4
Retry-After: 4
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-08623028-8144-4fd3-a1f5-a883e9d9bbf7"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-d6072672-d71f-475e-b621-594d9abe431a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d6072672-d71f-475e-b621-594d9abe431a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:44 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-d6072672-d71f-475e-b621-594d9abe431a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-d6072672-d71f-475e-b621-594d9abe431a"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-7155ad9a-ca98-4546-bd99-8272eb677d15

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7155ad9a-ca98-4546-bd99-8272eb677d15
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7155ad9a-ca98-4546-bd99-8272eb677d15
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 3
Retry-After: 3
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7155ad9a-ca98-4546-bd99-8272eb677d15"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-9f119913-d4c2-4159-af83-3efc3d42750d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9f119913-d4c2-4159-af83-3efc3d42750d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:45 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9f119913-d4c2-4159-af83-3efc3d42750d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9f119913-d4c2-4159-af83-3efc3d42750d"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-5927e267-a78c-4b49-aa76-9bce5a92df0a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5927e267-a78c-4b49-aa76-9bce5a92df0a
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 06 Nov 2026 09:30:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-5927e267-a78c-4b49-aa76-9bce5a92df0a
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 2
Retry-After: 2
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-5927e267-a78c-4b49-aa76-9bce5a92df0a"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-3a8d3ead-0795-40aa-a8e2-9a6b67b9eb79

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3a8d3ead-0795-40aa-a8e2-9a6b67b9eb79
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:46 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-3a8d3ead-0795-40aa-a8e2-9a6b67b9eb79
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-3a8d3ead-0795-40aa-a8e2-9a6b67b9eb79"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-51e72ebe-13e3-49e6-98dd-170a2a4f5677

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-51e72ebe-13e3-49e6-98dd-170a2a4f5677
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-51e72ebe-13e3-49e6-98dd-170a2a4f5677
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 0
RateLimit-Reset: 1
Retry-After: 1
Content-Length: 241

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-51e72ebe-13e3-49e6-98dd-170a2a4f5677"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-806c6841-499a-4283-8b46-8adf9f98ab98

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-806c6841-499a-4283-8b46-8adf9f98ab98
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:47 GMT
Content-Type: application/json
X-Correlation-Id: qa-806c6841-499a-4283-8b46-8adf9f98ab98
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 59
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_39368e98-e36c-4ef1-9a38-0e1917cb2bea","handle":"qa-9157c233c977","displayName":"QA 9157c233c977","region":"eu","role":"user","createdAt":"2026-11-06T09:30:37.131640994Z"}
```

## 81. DELETE /v1/accounts/me

```text
#81 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-350ec062-de3f-4166-9e0b-e653747e4501

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-350ec062-de3f-4166-9e0b-e653747e4501
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Fri, 06 Nov 2026 09:30:47 GMT
Content-Type: text/plain
X-Correlation-Id: qa-350ec062-de3f-4166-9e0b-e653747e4501
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 58
RateLimit-Reset: 10
X-Served-Region: eu
```

## 82. POST /v1/auth/token

```text
#82 POST http://localhost:7070/v1/auth/token
correlation: qa-8cde52b6-9d17-455e-9a67-3331dc5b2670

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8cde52b6-9d17-455e-9a67-3331dc5b2670
Content-Type: application/json

--- request body ---
{"handle":"qa-9157c233c977","password":"****"}

--- response: 401 in 4 ms ---
Date: Fri, 06 Nov 2026 09:30:47 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8cde52b6-9d17-455e-9a67-3331dc5b2670
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 599
RateLimit-Reset: 10
Content-Length: 242

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-8cde52b6-9d17-455e-9a67-3331dc5b2670"}
```
