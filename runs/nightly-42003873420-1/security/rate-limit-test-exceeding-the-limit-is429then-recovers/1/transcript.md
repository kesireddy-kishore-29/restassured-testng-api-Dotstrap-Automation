# Transcript: Past the limit: 429 with Retry-After, then recovery

| | |
|---|---|
| Test | `com.qaautomation.tests.security.RateLimitTest#exceedingTheLimitIs429ThenRecovers` |
| Features | FEAT-RATE-01 |
| Attempt | 1 |
| Status | passed |
| Calls | 83 |

Secrets (tokens, passwords, credential headers) are masked as `****`.

| # | Call | Status | ms | Correlation ID |
|---|---|---|---|---|
| 1 | `POST /v1/accounts` | 201 | 481 | `qa-b3b89911-e63b-4420-bf52-780fdb65baa1` |
| 2 | `POST /v1/auth/token` | 200 | 46 | `qa-0f8fc6a1-7edb-406e-a9c5-79cab25e93c7` |
| 3 | `GET /v1/accounts/me` | 200 | 29 | `qa-4b7884b4-e1fa-4f50-884e-d868e79cffb5` |
| 4 | `GET /v1/accounts/me` | 200 | 8 | `qa-a77d1624-6287-4b66-a758-f18efc43b5d6` |
| 5 | `GET /v1/accounts/me` | 200 | 12 | `qa-08684ce5-96c3-47dd-962d-fd55835aa3ff` |
| 6 | `GET /v1/accounts/me` | 200 | 21 | `qa-f32ae97e-03aa-40bd-a88b-c8cbcae8733e` |
| 7 | `GET /v1/accounts/me` | 200 | 10 | `qa-ddf94aa0-fa2f-457c-9f02-9de535ba2d71` |
| 8 | `GET /v1/accounts/me` | 200 | 10 | `qa-dea476d7-b527-46b8-b6de-e47bc5e3230e` |
| 9 | `GET /v1/accounts/me` | 200 | 14 | `qa-db4a4a0b-e731-46fa-b34a-9c10fa757c25` |
| 10 | `GET /v1/accounts/me` | 200 | 9 | `qa-a9086e31-c394-4ca7-8a0b-f5703942ade4` |
| 11 | `GET /v1/accounts/me` | 200 | 14 | `qa-0e110215-7c4d-4377-9280-f10aed9883d6` |
| 12 | `GET /v1/accounts/me` | 200 | 12 | `qa-52ec1cbe-51e1-41ee-b76a-ee1208214b6b` |
| 13 | `GET /v1/accounts/me` | 200 | 10 | `qa-86730a68-04c8-454c-b054-07bfd6302b7c` |
| 14 | `GET /v1/accounts/me` | 200 | 8 | `qa-23d9a60b-f451-454a-ab89-df6e99f1d838` |
| 15 | `GET /v1/accounts/me` | 200 | 11 | `qa-eac9469b-41d5-4751-ad90-22e99afc85e1` |
| 16 | `GET /v1/accounts/me` | 200 | 10 | `qa-3e0b65e5-5251-4f79-bbbc-16f15572c069` |
| 17 | `GET /v1/accounts/me` | 200 | 8 | `qa-d8636703-c90d-4452-b34c-8e65fdfa6534` |
| 18 | `GET /v1/accounts/me` | 200 | 9 | `qa-41ee2b0e-3a74-4200-b17b-761082f7a0bf` |
| 19 | `GET /v1/accounts/me` | 200 | 7 | `qa-26a0c477-b625-46e9-9d89-64aedec2b755` |
| 20 | `GET /v1/accounts/me` | 200 | 11 | `qa-a496c0bb-7e46-4619-a616-278028f72c73` |
| 21 | `GET /v1/accounts/me` | 200 | 8 | `qa-1f3b286b-175e-4fbb-b4f0-8530ddf7985e` |
| 22 | `GET /v1/accounts/me` | 200 | 8 | `qa-315b0860-ad74-4c1e-a4f2-9eaffb6fd865` |
| 23 | `GET /v1/accounts/me` | 200 | 11 | `qa-1cc31f57-f1a6-40f4-b657-3bc1eb71c802` |
| 24 | `GET /v1/accounts/me` | 200 | 11 | `qa-061d21d3-0237-4fc5-a688-00e59daa91c3` |
| 25 | `GET /v1/accounts/me` | 200 | 7 | `qa-ee5505ef-53ea-4fab-a70a-8248f00cef37` |
| 26 | `GET /v1/accounts/me` | 200 | 6 | `qa-b1539b71-e916-401e-b37a-d74b7923bf57` |
| 27 | `GET /v1/accounts/me` | 200 | 15 | `qa-a558a4d3-53c0-4cf7-8303-ae8932718f6b` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-7a6d7a6e-8d86-40eb-bbee-10499ca1ef31` |
| 29 | `GET /v1/accounts/me` | 200 | 12 | `qa-78493ccd-53d0-4ebd-9e01-9db89d1dcd0c` |
| 30 | `GET /v1/accounts/me` | 200 | 12 | `qa-53dde80c-8507-4589-aa53-db4794ef6001` |
| 31 | `GET /v1/accounts/me` | 200 | 10 | `qa-2f04658b-4ef8-41dc-ad74-649f81832298` |
| 32 | `GET /v1/accounts/me` | 200 | 10 | `qa-9b307fea-05f4-4647-a749-afb4a34aafc5` |
| 33 | `GET /v1/accounts/me` | 200 | 15 | `qa-abc51dfc-8866-47c3-9a9c-ec0a7f492a28` |
| 34 | `GET /v1/accounts/me` | 200 | 6 | `qa-2e3aa484-a486-4ae3-927c-0415311e99c5` |
| 35 | `GET /v1/accounts/me` | 200 | 5 | `qa-ebb8af2c-ac81-4ee9-bc82-88990ef268bf` |
| 36 | `GET /v1/accounts/me` | 200 | 8 | `qa-262ebd6f-a583-4f48-b711-d0caaf9fab5c` |
| 37 | `GET /v1/accounts/me` | 200 | 13 | `qa-75c518a0-373f-40b6-b914-5bdea7174213` |
| 38 | `GET /v1/accounts/me` | 200 | 28 | `qa-1f8cd806-d199-4749-9776-46692b06ab5b` |
| 39 | `GET /v1/accounts/me` | 200 | 6 | `qa-c57fe63f-2b29-4f93-9601-1c67030c025b` |
| 40 | `GET /v1/accounts/me` | 200 | 6 | `qa-939b36fe-ac17-48b6-8b9c-68e3d9d9ecb3` |
| 41 | `GET /v1/accounts/me` | 200 | 5 | `qa-329330b7-5dd7-4ecf-b02b-168634abaf88` |
| 42 | `GET /v1/accounts/me` | 200 | 8 | `qa-327060c8-e334-4a45-88f0-63c8424d96be` |
| 43 | `GET /v1/accounts/me` | 200 | 8 | `qa-79cbc439-95cd-4e2c-9abf-6b096f5aef25` |
| 44 | `GET /v1/accounts/me` | 200 | 11 | `qa-ff1bcac0-1e26-436c-adac-849c60bf9634` |
| 45 | `GET /v1/accounts/me` | 200 | 10 | `qa-a5cab2bb-a069-47c9-a1a7-c16f17586845` |
| 46 | `GET /v1/accounts/me` | 200 | 9 | `qa-2957f3a5-9b22-4ce7-b983-86acf7631e4d` |
| 47 | `GET /v1/accounts/me` | 200 | 10 | `qa-3178d42b-96cc-4df6-8991-307f8de0c415` |
| 48 | `GET /v1/accounts/me` | 200 | 11 | `qa-e4e1b752-eb5a-45f2-ad50-4881a7666d78` |
| 49 | `GET /v1/accounts/me` | 200 | 8 | `qa-c8ddcae3-a78c-46a5-96a8-7e7f28a7224b` |
| 50 | `GET /v1/accounts/me` | 200 | 8 | `qa-47e8c766-6dd3-4a55-a2b6-fce13719aabe` |
| 51 | `GET /v1/accounts/me` | 200 | 10 | `qa-a146e682-b991-4ce1-b7c8-ee63f8dec24c` |
| 52 | `GET /v1/accounts/me` | 200 | 7 | `qa-80f4a8cf-0b45-4629-88e5-3490316f4d18` |
| 53 | `GET /v1/accounts/me` | 200 | 8 | `qa-b2aefb29-49d8-43af-bc6d-9f1d7cca5c57` |
| 54 | `GET /v1/accounts/me` | 200 | 16 | `qa-a1388d2e-e5f1-4d97-b491-f951baf9f35e` |
| 55 | `GET /v1/accounts/me` | 200 | 8 | `qa-7776fe89-115a-4da7-b8e7-1a63abe20888` |
| 56 | `GET /v1/accounts/me` | 200 | 9 | `qa-76e9abd6-bb31-4709-aecb-70a4daf40b07` |
| 57 | `GET /v1/accounts/me` | 200 | 7 | `qa-37e1e966-f58d-4460-a014-c321b7bab972` |
| 58 | `GET /v1/accounts/me` | 200 | 12 | `qa-ee1efdb1-a769-4634-ac96-1389e047a471` |
| 59 | `GET /v1/accounts/me` | 200 | 12 | `qa-4833033b-bda0-4c79-bec6-56af38cf5140` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-03f33b45-fa62-45fe-96f3-5015eabdade6` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-596dfe2d-758c-4994-90fd-edefba93fb3e` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-b7b9c408-18bd-4737-a91a-c15e568049ab` |
| 63 | `GET /v1/accounts/me` | 429 | 7 | `qa-4121cd90-2edf-433f-9fd5-9f0e85d932cc` |
| 64 | `GET /v1/accounts/me` | 429 | 6 | `qa-0d212588-365f-43a1-b633-a155261dcd25` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-c4e6c916-b5f8-4eb1-9a69-5b6b0aad0918` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-6339327e-275c-48ae-965e-12381d5b8104` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-f96584e0-0e03-4e4a-a981-e5b0285bdfea` |
| 68 | `GET /v1/accounts/me` | 429 | 4 | `qa-7b5b089b-a140-42d8-920a-3d43d5176f50` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-86ab4c7f-6e47-49ca-8f7e-ef9572300281` |
| 70 | `GET /v1/accounts/me` | 429 | 5 | `qa-9a55a9a7-e26c-4c78-97a8-8899c151c297` |
| 71 | `GET /v1/accounts/me` | 429 | 5 | `qa-0789b963-ed67-4bc9-92e5-edc01d4d7087` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-a9bf41db-347d-4661-af46-8e3527589ecd` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-35a07ada-0ae6-4244-a1e7-cf05df55896d` |
| 74 | `GET /v1/accounts/me` | 429 | 8 | `qa-42750967-3952-475d-8893-c7dff94a6247` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-de3253b8-4fb8-4835-a9c1-5cb2731c2e5b` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-7bf1c254-b961-4c09-a085-24ad1c7ba994` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-93cd36fa-4732-4b19-ad0a-13c71db42fad` |
| 78 | `GET /v1/accounts/me` | 429 | 5 | `qa-2c0864fb-94c5-400d-a799-5ad1c77dd3b5` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-990860ec-d301-4b3a-8ea4-796e29d41379` |
| 80 | `GET /v1/accounts/me` | 429 | 4 | `qa-6d8235a7-a6ee-427b-ac64-f48130395831` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-cfdad972-2ba7-4e63-9650-a78e6e41692e` |
| 82 | `DELETE /v1/accounts/me` | 204 | 3 | `qa-ca7d40c3-3475-4cc9-86b5-79da539101e7` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-dad9b7b4-1959-4d0b-94f7-aa78f1864765` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b3b89911-e63b-4420-bf52-780fdb65baa1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b3b89911-e63b-4420-bf52-780fdb65baa1
Content-Type: application/json

--- request body ---
{"handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","password":"****","region":"eu"}

--- response: 201 in 481 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-b3b89911-e63b-4420-bf52-780fdb65baa1
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 600
RateLimit-Remaining: 597
RateLimit-Reset: 10
Location: /v1/accounts/qa-16a74e56e9e7
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-0f8fc6a1-7edb-406e-a9c5-79cab25e93c7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0f8fc6a1-7edb-406e-a9c5-79cab25e93c7
Content-Type: application/json

--- request body ---
{"handle":"qa-16a74e56e9e7","password":"****"}

--- response: 200 in 46 ms ---
Date: Thu, 05 Nov 2026 09:37:51 GMT
Content-Type: application/json
X-Correlation-Id: qa-0f8fc6a1-7edb-406e-a9c5-79cab25e93c7
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

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b7884b4-e1fa-4f50-884e-d868e79cffb5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b7884b4-e1fa-4f50-884e-d868e79cffb5
Content-Type: application/json

--- response: 200 in 29 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b7884b4-e1fa-4f50-884e-d868e79cffb5
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-a77d1624-6287-4b66-a758-f18efc43b5d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a77d1624-6287-4b66-a758-f18efc43b5d6
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a77d1624-6287-4b66-a758-f18efc43b5d6
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-08684ce5-96c3-47dd-962d-fd55835aa3ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-08684ce5-96c3-47dd-962d-fd55835aa3ff
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-08684ce5-96c3-47dd-962d-fd55835aa3ff
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-f32ae97e-03aa-40bd-a88b-c8cbcae8733e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f32ae97e-03aa-40bd-a88b-c8cbcae8733e
Content-Type: application/json

--- response: 200 in 21 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-f32ae97e-03aa-40bd-a88b-c8cbcae8733e
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-ddf94aa0-fa2f-457c-9f02-9de535ba2d71

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddf94aa0-fa2f-457c-9f02-9de535ba2d71
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddf94aa0-fa2f-457c-9f02-9de535ba2d71
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-dea476d7-b527-46b8-b6de-e47bc5e3230e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dea476d7-b527-46b8-b6de-e47bc5e3230e
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-dea476d7-b527-46b8-b6de-e47bc5e3230e
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-db4a4a0b-e731-46fa-b34a-9c10fa757c25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-db4a4a0b-e731-46fa-b34a-9c10fa757c25
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-db4a4a0b-e731-46fa-b34a-9c10fa757c25
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9086e31-c394-4ca7-8a0b-f5703942ade4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9086e31-c394-4ca7-8a0b-f5703942ade4
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a9086e31-c394-4ca7-8a0b-f5703942ade4
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e110215-7c4d-4377-9280-f10aed9883d6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e110215-7c4d-4377-9280-f10aed9883d6
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e110215-7c4d-4377-9280-f10aed9883d6
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-52ec1cbe-51e1-41ee-b76a-ee1208214b6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-52ec1cbe-51e1-41ee-b76a-ee1208214b6b
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-52ec1cbe-51e1-41ee-b76a-ee1208214b6b
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-86730a68-04c8-454c-b054-07bfd6302b7c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86730a68-04c8-454c-b054-07bfd6302b7c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-86730a68-04c8-454c-b054-07bfd6302b7c
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-23d9a60b-f451-454a-ab89-df6e99f1d838

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23d9a60b-f451-454a-ab89-df6e99f1d838
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-23d9a60b-f451-454a-ab89-df6e99f1d838
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-eac9469b-41d5-4751-ad90-22e99afc85e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-eac9469b-41d5-4751-ad90-22e99afc85e1
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-eac9469b-41d5-4751-ad90-22e99afc85e1
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-3e0b65e5-5251-4f79-bbbc-16f15572c069

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3e0b65e5-5251-4f79-bbbc-16f15572c069
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3e0b65e5-5251-4f79-bbbc-16f15572c069
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-d8636703-c90d-4452-b34c-8e65fdfa6534

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d8636703-c90d-4452-b34c-8e65fdfa6534
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-d8636703-c90d-4452-b34c-8e65fdfa6534
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-41ee2b0e-3a74-4200-b17b-761082f7a0bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-41ee2b0e-3a74-4200-b17b-761082f7a0bf
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-41ee2b0e-3a74-4200-b17b-761082f7a0bf
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-26a0c477-b625-46e9-9d89-64aedec2b755

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26a0c477-b625-46e9-9d89-64aedec2b755
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-26a0c477-b625-46e9-9d89-64aedec2b755
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-a496c0bb-7e46-4619-a616-278028f72c73

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a496c0bb-7e46-4619-a616-278028f72c73
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a496c0bb-7e46-4619-a616-278028f72c73
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f3b286b-175e-4fbb-b4f0-8530ddf7985e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f3b286b-175e-4fbb-b4f0-8530ddf7985e
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f3b286b-175e-4fbb-b4f0-8530ddf7985e
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-315b0860-ad74-4c1e-a4f2-9eaffb6fd865

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-315b0860-ad74-4c1e-a4f2-9eaffb6fd865
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-315b0860-ad74-4c1e-a4f2-9eaffb6fd865
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-1cc31f57-f1a6-40f4-b657-3bc1eb71c802

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1cc31f57-f1a6-40f4-b657-3bc1eb71c802
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1cc31f57-f1a6-40f4-b657-3bc1eb71c802
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-061d21d3-0237-4fc5-a688-00e59daa91c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-061d21d3-0237-4fc5-a688-00e59daa91c3
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-061d21d3-0237-4fc5-a688-00e59daa91c3
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee5505ef-53ea-4fab-a70a-8248f00cef37

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee5505ef-53ea-4fab-a70a-8248f00cef37
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee5505ef-53ea-4fab-a70a-8248f00cef37
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-b1539b71-e916-401e-b37a-d74b7923bf57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b1539b71-e916-401e-b37a-d74b7923bf57
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-b1539b71-e916-401e-b37a-d74b7923bf57
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-a558a4d3-53c0-4cf7-8303-ae8932718f6b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a558a4d3-53c0-4cf7-8303-ae8932718f6b
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a558a4d3-53c0-4cf7-8303-ae8932718f6b
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a6d7a6e-8d86-40eb-bbee-10499ca1ef31

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a6d7a6e-8d86-40eb-bbee-10499ca1ef31
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-7a6d7a6e-8d86-40eb-bbee-10499ca1ef31
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-78493ccd-53d0-4ebd-9e01-9db89d1dcd0c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-78493ccd-53d0-4ebd-9e01-9db89d1dcd0c
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-78493ccd-53d0-4ebd-9e01-9db89d1dcd0c
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-53dde80c-8507-4589-aa53-db4794ef6001

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-53dde80c-8507-4589-aa53-db4794ef6001
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-53dde80c-8507-4589-aa53-db4794ef6001
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f04658b-4ef8-41dc-ad74-649f81832298

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f04658b-4ef8-41dc-ad74-649f81832298
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f04658b-4ef8-41dc-ad74-649f81832298
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-9b307fea-05f4-4647-a749-afb4a34aafc5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9b307fea-05f4-4647-a749-afb4a34aafc5
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-9b307fea-05f4-4647-a749-afb4a34aafc5
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-abc51dfc-8866-47c3-9a9c-ec0a7f492a28

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-abc51dfc-8866-47c3-9a9c-ec0a7f492a28
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-abc51dfc-8866-47c3-9a9c-ec0a7f492a28
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-2e3aa484-a486-4ae3-927c-0415311e99c5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2e3aa484-a486-4ae3-927c-0415311e99c5
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2e3aa484-a486-4ae3-927c-0415311e99c5
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-ebb8af2c-ac81-4ee9-bc82-88990ef268bf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ebb8af2c-ac81-4ee9-bc82-88990ef268bf
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ebb8af2c-ac81-4ee9-bc82-88990ef268bf
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-262ebd6f-a583-4f48-b711-d0caaf9fab5c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-262ebd6f-a583-4f48-b711-d0caaf9fab5c
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-262ebd6f-a583-4f48-b711-d0caaf9fab5c
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-75c518a0-373f-40b6-b914-5bdea7174213

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-75c518a0-373f-40b6-b914-5bdea7174213
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-75c518a0-373f-40b6-b914-5bdea7174213
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-1f8cd806-d199-4749-9776-46692b06ab5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1f8cd806-d199-4749-9776-46692b06ab5b
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-1f8cd806-d199-4749-9776-46692b06ab5b
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-c57fe63f-2b29-4f93-9601-1c67030c025b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c57fe63f-2b29-4f93-9601-1c67030c025b
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c57fe63f-2b29-4f93-9601-1c67030c025b
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-939b36fe-ac17-48b6-8b9c-68e3d9d9ecb3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-939b36fe-ac17-48b6-8b9c-68e3d9d9ecb3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-939b36fe-ac17-48b6-8b9c-68e3d9d9ecb3
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-329330b7-5dd7-4ecf-b02b-168634abaf88

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-329330b7-5dd7-4ecf-b02b-168634abaf88
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-329330b7-5dd7-4ecf-b02b-168634abaf88
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-327060c8-e334-4a45-88f0-63c8424d96be

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-327060c8-e334-4a45-88f0-63c8424d96be
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-327060c8-e334-4a45-88f0-63c8424d96be
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-79cbc439-95cd-4e2c-9abf-6b096f5aef25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-79cbc439-95cd-4e2c-9abf-6b096f5aef25
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-79cbc439-95cd-4e2c-9abf-6b096f5aef25
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 19
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-ff1bcac0-1e26-436c-adac-849c60bf9634

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ff1bcac0-1e26-436c-adac-849c60bf9634
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-ff1bcac0-1e26-436c-adac-849c60bf9634
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 18
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-a5cab2bb-a069-47c9-a1a7-c16f17586845

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a5cab2bb-a069-47c9-a1a7-c16f17586845
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a5cab2bb-a069-47c9-a1a7-c16f17586845
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 17
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-2957f3a5-9b22-4ce7-b983-86acf7631e4d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2957f3a5-9b22-4ce7-b983-86acf7631e4d
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-2957f3a5-9b22-4ce7-b983-86acf7631e4d
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 16
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-3178d42b-96cc-4df6-8991-307f8de0c415

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3178d42b-96cc-4df6-8991-307f8de0c415
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-3178d42b-96cc-4df6-8991-307f8de0c415
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 15
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-e4e1b752-eb5a-45f2-ad50-4881a7666d78

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e4e1b752-eb5a-45f2-ad50-4881a7666d78
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-e4e1b752-eb5a-45f2-ad50-4881a7666d78
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 14
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-c8ddcae3-a78c-46a5-96a8-7e7f28a7224b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c8ddcae3-a78c-46a5-96a8-7e7f28a7224b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-c8ddcae3-a78c-46a5-96a8-7e7f28a7224b
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 13
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-47e8c766-6dd3-4a55-a2b6-fce13719aabe

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-47e8c766-6dd3-4a55-a2b6-fce13719aabe
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-47e8c766-6dd3-4a55-a2b6-fce13719aabe
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 12
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-a146e682-b991-4ce1-b7c8-ee63f8dec24c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a146e682-b991-4ce1-b7c8-ee63f8dec24c
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Thu, 05 Nov 2026 09:37:52 GMT
Content-Type: application/json
X-Correlation-Id: qa-a146e682-b991-4ce1-b7c8-ee63f8dec24c
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 11
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-80f4a8cf-0b45-4629-88e5-3490316f4d18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-80f4a8cf-0b45-4629-88e5-3490316f4d18
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-80f4a8cf-0b45-4629-88e5-3490316f4d18
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 10
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2aefb29-49d8-43af-bc6d-9f1d7cca5c57

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2aefb29-49d8-43af-bc6d-9f1d7cca5c57
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2aefb29-49d8-43af-bc6d-9f1d7cca5c57
X-Content-Type-Options: nosniff
X-Frame-Options: DENY
Content-Security-Policy: default-src 'none'; frame-ancestors 'none'
Referrer-Policy: no-referrer
Strict-Transport-Security: max-age=31536000; includeSubDomains
Cache-Control: no-store
Vary: Origin
RateLimit-Limit: 60
RateLimit-Remaining: 9
RateLimit-Reset: 10
X-Served-Region: eu
Content-Length: 181

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-a1388d2e-e5f1-4d97-b491-f951baf9f35e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a1388d2e-e5f1-4d97-b491-f951baf9f35e
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-a1388d2e-e5f1-4d97-b491-f951baf9f35e
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-7776fe89-115a-4da7-b8e7-1a63abe20888

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7776fe89-115a-4da7-b8e7-1a63abe20888
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-7776fe89-115a-4da7-b8e7-1a63abe20888
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-76e9abd6-bb31-4709-aecb-70a4daf40b07

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-76e9abd6-bb31-4709-aecb-70a4daf40b07
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-76e9abd6-bb31-4709-aecb-70a4daf40b07
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-37e1e966-f58d-4460-a014-c321b7bab972

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-37e1e966-f58d-4460-a014-c321b7bab972
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-37e1e966-f58d-4460-a014-c321b7bab972
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee1efdb1-a769-4634-ac96-1389e047a471

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee1efdb1-a769-4634-ac96-1389e047a471
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-ee1efdb1-a769-4634-ac96-1389e047a471
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-4833033b-bda0-4c79-bec6-56af38cf5140

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4833033b-bda0-4c79-bec6-56af38cf5140
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-4833033b-bda0-4c79-bec6-56af38cf5140
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-03f33b45-fa62-45fe-96f3-5015eabdade6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-03f33b45-fa62-45fe-96f3-5015eabdade6
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-03f33b45-fa62-45fe-96f3-5015eabdade6
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-596dfe2d-758c-4994-90fd-edefba93fb3e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-596dfe2d-758c-4994-90fd-edefba93fb3e
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-596dfe2d-758c-4994-90fd-edefba93fb3e
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-b7b9c408-18bd-4737-a91a-c15e568049ab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b7b9c408-18bd-4737-a91a-c15e568049ab
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/json
X-Correlation-Id: qa-b7b9c408-18bd-4737-a91a-c15e568049ab
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-4121cd90-2edf-433f-9fd5-9f0e85d932cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4121cd90-2edf-433f-9fd5-9f0e85d932cc
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4121cd90-2edf-433f-9fd5-9f0e85d932cc
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4121cd90-2edf-433f-9fd5-9f0e85d932cc"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-0d212588-365f-43a1-b633-a155261dcd25

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0d212588-365f-43a1-b633-a155261dcd25
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Thu, 05 Nov 2026 09:37:53 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0d212588-365f-43a1-b633-a155261dcd25
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0d212588-365f-43a1-b633-a155261dcd25"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-c4e6c916-b5f8-4eb1-9a69-5b6b0aad0918

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c4e6c916-b5f8-4eb1-9a69-5b6b0aad0918
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c4e6c916-b5f8-4eb1-9a69-5b6b0aad0918
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c4e6c916-b5f8-4eb1-9a69-5b6b0aad0918"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-6339327e-275c-48ae-965e-12381d5b8104

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6339327e-275c-48ae-965e-12381d5b8104
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:54 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6339327e-275c-48ae-965e-12381d5b8104
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6339327e-275c-48ae-965e-12381d5b8104"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-f96584e0-0e03-4e4a-a981-e5b0285bdfea

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f96584e0-0e03-4e4a-a981-e5b0285bdfea
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f96584e0-0e03-4e4a-a981-e5b0285bdfea
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f96584e0-0e03-4e4a-a981-e5b0285bdfea"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b5b089b-a140-42d8-920a-3d43d5176f50

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b5b089b-a140-42d8-920a-3d43d5176f50
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:55 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7b5b089b-a140-42d8-920a-3d43d5176f50
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7b5b089b-a140-42d8-920a-3d43d5176f50"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-86ab4c7f-6e47-49ca-8f7e-ef9572300281

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-86ab4c7f-6e47-49ca-8f7e-ef9572300281
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-86ab4c7f-6e47-49ca-8f7e-ef9572300281
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-86ab4c7f-6e47-49ca-8f7e-ef9572300281"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a55a9a7-e26c-4c78-97a8-8899c151c297

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a55a9a7-e26c-4c78-97a8-8899c151c297
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:56 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9a55a9a7-e26c-4c78-97a8-8899c151c297
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9a55a9a7-e26c-4c78-97a8-8899c151c297"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-0789b963-ed67-4bc9-92e5-edc01d4d7087

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0789b963-ed67-4bc9-92e5-edc01d4d7087
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-0789b963-ed67-4bc9-92e5-edc01d4d7087
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-0789b963-ed67-4bc9-92e5-edc01d4d7087"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-a9bf41db-347d-4661-af46-8e3527589ecd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a9bf41db-347d-4661-af46-8e3527589ecd
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:57 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-a9bf41db-347d-4661-af46-8e3527589ecd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-a9bf41db-347d-4661-af46-8e3527589ecd"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-35a07ada-0ae6-4244-a1e7-cf05df55896d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35a07ada-0ae6-4244-a1e7-cf05df55896d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-35a07ada-0ae6-4244-a1e7-cf05df55896d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-35a07ada-0ae6-4244-a1e7-cf05df55896d"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-42750967-3952-475d-8893-c7dff94a6247

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42750967-3952-475d-8893-c7dff94a6247
Content-Type: application/json

--- response: 429 in 8 ms ---
Date: Thu, 05 Nov 2026 09:37:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-42750967-3952-475d-8893-c7dff94a6247
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-42750967-3952-475d-8893-c7dff94a6247"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-de3253b8-4fb8-4835-a9c1-5cb2731c2e5b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-de3253b8-4fb8-4835-a9c1-5cb2731c2e5b
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-de3253b8-4fb8-4835-a9c1-5cb2731c2e5b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-de3253b8-4fb8-4835-a9c1-5cb2731c2e5b"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-7bf1c254-b961-4c09-a085-24ad1c7ba994

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7bf1c254-b961-4c09-a085-24ad1c7ba994
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:37:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7bf1c254-b961-4c09-a085-24ad1c7ba994
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7bf1c254-b961-4c09-a085-24ad1c7ba994"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-93cd36fa-4732-4b19-ad0a-13c71db42fad

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-93cd36fa-4732-4b19-ad0a-13c71db42fad
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-93cd36fa-4732-4b19-ad0a-13c71db42fad
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-93cd36fa-4732-4b19-ad0a-13c71db42fad"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c0864fb-94c5-400d-a799-5ad1c77dd3b5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c0864fb-94c5-400d-a799-5ad1c77dd3b5
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Thu, 05 Nov 2026 09:38:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c0864fb-94c5-400d-a799-5ad1c77dd3b5
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2c0864fb-94c5-400d-a799-5ad1c77dd3b5"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-990860ec-d301-4b3a-8ea4-796e29d41379

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-990860ec-d301-4b3a-8ea4-796e29d41379
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:38:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-990860ec-d301-4b3a-8ea4-796e29d41379
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-990860ec-d301-4b3a-8ea4-796e29d41379"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-6d8235a7-a6ee-427b-ac64-f48130395831

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6d8235a7-a6ee-427b-ac64-f48130395831
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Thu, 05 Nov 2026 09:38:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6d8235a7-a6ee-427b-ac64-f48130395831
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6d8235a7-a6ee-427b-ac64-f48130395831"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-cfdad972-2ba7-4e63-9650-a78e6e41692e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cfdad972-2ba7-4e63-9650-a78e6e41692e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Thu, 05 Nov 2026 09:38:02 GMT
Content-Type: application/json
X-Correlation-Id: qa-cfdad972-2ba7-4e63-9650-a78e6e41692e
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

{"id":"acc_9a4a0bbc-cbb1-4b03-8a02-6576c62cb607","handle":"qa-16a74e56e9e7","displayName":"QA 16a74e56e9e7","region":"eu","role":"user","createdAt":"2026-11-05T09:37:51.520049334Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-ca7d40c3-3475-4cc9-86b5-79da539101e7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ca7d40c3-3475-4cc9-86b5-79da539101e7
Content-Type: application/json

--- response: 204 in 3 ms ---
Date: Thu, 05 Nov 2026 09:38:02 GMT
Content-Type: text/plain
X-Correlation-Id: qa-ca7d40c3-3475-4cc9-86b5-79da539101e7
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

## 83. POST /v1/auth/token

```text
#83 POST http://localhost:7070/v1/auth/token
correlation: qa-dad9b7b4-1959-4d0b-94f7-aa78f1864765

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dad9b7b4-1959-4d0b-94f7-aa78f1864765
Content-Type: application/json

--- request body ---
{"handle":"qa-16a74e56e9e7","password":"****"}

--- response: 401 in 3 ms ---
Date: Thu, 05 Nov 2026 09:38:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-dad9b7b4-1959-4d0b-94f7-aa78f1864765
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-dad9b7b4-1959-4d0b-94f7-aa78f1864765"}
```
