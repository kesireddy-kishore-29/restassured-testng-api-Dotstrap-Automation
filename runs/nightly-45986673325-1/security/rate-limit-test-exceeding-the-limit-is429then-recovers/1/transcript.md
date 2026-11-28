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
| 1 | `POST /v1/accounts` | 201 | 399 | `qa-b4f64302-cccc-48a1-a951-0419f7cf4e70` |
| 2 | `POST /v1/auth/token` | 200 | 148 | `qa-55eccb05-a5d0-4886-89ba-c6397cb15cec` |
| 3 | `GET /v1/accounts/me` | 200 | 78 | `qa-0a7a3567-c56a-4355-a395-d56bf96bf253` |
| 4 | `GET /v1/accounts/me` | 200 | 25 | `qa-40079003-b890-4c41-8033-8e933d7dbfbb` |
| 5 | `GET /v1/accounts/me` | 200 | 17 | `qa-0aa410dd-0c65-4577-b7b9-55a0fb3df480` |
| 6 | `GET /v1/accounts/me` | 200 | 17 | `qa-df5b1fd9-a18d-4f35-aa42-1d83faa01597` |
| 7 | `GET /v1/accounts/me` | 200 | 24 | `qa-95045498-559a-4a7a-b834-cd2fa12771e8` |
| 8 | `GET /v1/accounts/me` | 200 | 15 | `qa-10203578-0a66-4f63-b2f9-2d10c60fe14f` |
| 9 | `GET /v1/accounts/me` | 200 | 19 | `qa-8c16b1f0-07cf-42d7-95d1-b2c3625b31c4` |
| 10 | `GET /v1/accounts/me` | 200 | 20 | `qa-d0651dce-13af-4631-a21c-986bd490a415` |
| 11 | `GET /v1/accounts/me` | 200 | 14 | `qa-f620e35a-6890-427a-94ec-aec3e6c1790a` |
| 12 | `GET /v1/accounts/me` | 200 | 16 | `qa-e875d13e-bc02-4b27-b987-23aa71954fa5` |
| 13 | `GET /v1/accounts/me` | 200 | 11 | `qa-cb98bc5c-50b9-4b34-9286-cd5fdf9bdc58` |
| 14 | `GET /v1/accounts/me` | 200 | 13 | `qa-26f6c581-1912-42eb-86dc-309c99dd32e1` |
| 15 | `GET /v1/accounts/me` | 200 | 14 | `qa-2317bf9a-1148-493b-bb77-aed74bf354e4` |
| 16 | `GET /v1/accounts/me` | 200 | 12 | `qa-5d11a669-a082-4f81-9ab6-4df9b52f2251` |
| 17 | `GET /v1/accounts/me` | 200 | 12 | `qa-b2f8e70c-6b32-4211-b31e-f5f671e1df20` |
| 18 | `GET /v1/accounts/me` | 200 | 13 | `qa-6da18585-ccb9-4503-9310-a68057c5027a` |
| 19 | `GET /v1/accounts/me` | 200 | 12 | `qa-f570c71f-4546-49a6-b7d0-b80e8ffab51a` |
| 20 | `GET /v1/accounts/me` | 200 | 11 | `qa-b671ab74-f982-43ca-bf8a-21c5b0d176c6` |
| 21 | `GET /v1/accounts/me` | 200 | 28 | `qa-0b263346-31b9-4039-bbdd-32e709dcf07a` |
| 22 | `GET /v1/accounts/me` | 200 | 19 | `qa-9a6040e4-54e0-4de1-a48b-b274f3d22ee1` |
| 23 | `GET /v1/accounts/me` | 200 | 8 | `qa-42c2c987-1144-4aed-b19b-52f99734efdf` |
| 24 | `GET /v1/accounts/me` | 200 | 8 | `qa-354485d5-623b-45a8-b9da-bbdf90b2a7cc` |
| 25 | `GET /v1/accounts/me` | 200 | 8 | `qa-3f891335-fc30-48d5-88a5-26a5252d02ca` |
| 26 | `GET /v1/accounts/me` | 200 | 9 | `qa-8f23b7ec-0ff0-4ba1-aacd-957d37dce264` |
| 27 | `GET /v1/accounts/me` | 200 | 8 | `qa-9e09229b-d67f-4450-b1d5-82aaa532d81b` |
| 28 | `GET /v1/accounts/me` | 200 | 10 | `qa-4b810226-6d71-4f7c-a642-0ff6fb70e4f8` |
| 29 | `GET /v1/accounts/me` | 200 | 12 | `qa-7b991c2b-0ad4-4111-a66b-71858c6d3068` |
| 30 | `GET /v1/accounts/me` | 200 | 12 | `qa-d5b0fdab-fee4-467a-adbb-564c4ac4f57a` |
| 31 | `GET /v1/accounts/me` | 200 | 16 | `qa-9963e9c3-c62e-465e-aaad-fa81ad271f70` |
| 32 | `GET /v1/accounts/me` | 200 | 8 | `qa-2f339e75-3cc1-45c0-9064-0ae57c3d1c0d` |
| 33 | `GET /v1/accounts/me` | 200 | 13 | `qa-7d8658f6-492d-4d0c-b1fc-2199f21516b7` |
| 34 | `GET /v1/accounts/me` | 200 | 13 | `qa-f055f0b3-c711-4645-a0ec-5ae6e7ad8aec` |
| 35 | `GET /v1/accounts/me` | 200 | 6 | `qa-4bedce84-9a5d-45aa-9206-2c5d4cd33152` |
| 36 | `GET /v1/accounts/me` | 200 | 6 | `qa-6ca3f37f-0bbb-49e5-978c-3728a4493244` |
| 37 | `GET /v1/accounts/me` | 200 | 4 | `qa-d83e2c49-f1e3-47f5-996e-510da4e68dab` |
| 38 | `GET /v1/accounts/me` | 200 | 5 | `qa-dfbb4d94-f137-4561-84ef-2b4a7ad312e3` |
| 39 | `GET /v1/accounts/me` | 200 | 5 | `qa-cf2a2d71-ab6e-4baa-abae-f66cb7860406` |
| 40 | `GET /v1/accounts/me` | 200 | 5 | `qa-896c597c-2399-4895-8f0c-5530bd52d078` |
| 41 | `GET /v1/accounts/me` | 200 | 4 | `qa-8b13f172-2e3f-4368-8060-7ec28aaa077f` |
| 42 | `GET /v1/accounts/me` | 200 | 4 | `qa-1b7261df-d0c2-4844-ad81-5f487da12a77` |
| 43 | `GET /v1/accounts/me` | 200 | 5 | `qa-e8692dde-dcf3-4403-b073-beaec6c30c83` |
| 44 | `GET /v1/accounts/me` | 200 | 4 | `qa-325405da-997f-4eba-8c4e-90ad9b844555` |
| 45 | `GET /v1/accounts/me` | 200 | 6 | `qa-a36385e3-6d5c-4386-8258-c3172af8c901` |
| 46 | `GET /v1/accounts/me` | 200 | 4 | `qa-cefe76a5-a2fa-4cd4-8508-fee3b0c0bcc6` |
| 47 | `GET /v1/accounts/me` | 200 | 7 | `qa-b2d8ab64-e75a-4c73-a696-84962838a2c6` |
| 48 | `GET /v1/accounts/me` | 200 | 12 | `qa-9ecc951a-c9de-4b66-ae8f-42dfe1e433fc` |
| 49 | `GET /v1/accounts/me` | 200 | 7 | `qa-88da14e9-938b-4afc-a4d0-cb794afb1e3d` |
| 50 | `GET /v1/accounts/me` | 200 | 9 | `qa-0210c0b5-aaab-405f-a656-c79577575017` |
| 51 | `GET /v1/accounts/me` | 200 | 6 | `qa-660e6cfa-08a8-458f-afe9-57d9af0fbcd3` |
| 52 | `GET /v1/accounts/me` | 200 | 6 | `qa-0e79a28f-29d2-4f64-a8af-216a26b517ed` |
| 53 | `GET /v1/accounts/me` | 200 | 4 | `qa-8c2b6598-366a-4e28-8101-642b92ab54c6` |
| 54 | `GET /v1/accounts/me` | 200 | 4 | `qa-0c785d5c-2d30-4d74-9f7a-84dabd3fb3c0` |
| 55 | `GET /v1/accounts/me` | 200 | 4 | `qa-ddcf7f6e-9e7c-4718-9315-6daf4077dc1e` |
| 56 | `GET /v1/accounts/me` | 200 | 6 | `qa-0814324f-38b5-4f36-92f0-7e2930121816` |
| 57 | `GET /v1/accounts/me` | 200 | 5 | `qa-8c2ffdcc-8efc-4267-8af5-d65ebe0d0d69` |
| 58 | `GET /v1/accounts/me` | 200 | 4 | `qa-bf5b5784-5b11-46b2-b06d-28b454dd08ba` |
| 59 | `GET /v1/accounts/me` | 200 | 4 | `qa-35bf0c40-1c5c-48ed-9a69-54a3c09e855a` |
| 60 | `GET /v1/accounts/me` | 200 | 5 | `qa-9d54aec3-30dc-4bf1-94ef-303d8231bf18` |
| 61 | `GET /v1/accounts/me` | 200 | 5 | `qa-423c7a06-7b82-444f-b21e-157c4119d938` |
| 62 | `GET /v1/accounts/me` | 200 | 4 | `qa-2c02d024-a1c7-4837-8385-c12989915ce3` |
| 63 | `GET /v1/accounts/me` | 429 | 7 | `qa-b15fe524-ab7c-466a-b5c1-1a31190c00b0` |
| 64 | `GET /v1/accounts/me` | 429 | 5 | `qa-9087f859-5393-49ad-817f-9790523398c3` |
| 65 | `GET /v1/accounts/me` | 429 | 5 | `qa-7a302318-1a1b-4cc4-ad8f-25977521f031` |
| 66 | `GET /v1/accounts/me` | 429 | 5 | `qa-ee98d375-b1e7-49d3-bf56-3daa491e348c` |
| 67 | `GET /v1/accounts/me` | 429 | 4 | `qa-2cc39503-5b0c-4ccf-a197-2be38b4a0c2b` |
| 68 | `GET /v1/accounts/me` | 429 | 6 | `qa-f316d265-a211-47ba-b8bc-d7b7cb095848` |
| 69 | `GET /v1/accounts/me` | 429 | 4 | `qa-18a1c72c-0fc1-49d9-af87-c5437da8e26c` |
| 70 | `GET /v1/accounts/me` | 429 | 4 | `qa-2c02cb6f-84a0-4384-9840-30b41f045490` |
| 71 | `GET /v1/accounts/me` | 429 | 4 | `qa-409628e3-74fa-4516-963c-0f0c5ac6e31d` |
| 72 | `GET /v1/accounts/me` | 429 | 4 | `qa-ce60a7e4-a22c-43b3-903b-4e103d9b552b` |
| 73 | `GET /v1/accounts/me` | 429 | 4 | `qa-95f767ad-22db-4d25-bda9-36706b6b1124` |
| 74 | `GET /v1/accounts/me` | 429 | 4 | `qa-7e56b5f7-a78f-4fa0-9be8-54e1cac76ec0` |
| 75 | `GET /v1/accounts/me` | 429 | 5 | `qa-8084e7c1-c4ee-40e0-8536-1dcc139473d8` |
| 76 | `GET /v1/accounts/me` | 429 | 5 | `qa-4919255e-4ea3-41c6-b00f-eb42d24fa156` |
| 77 | `GET /v1/accounts/me` | 429 | 5 | `qa-c615415d-8f57-4afe-88f5-1c129c0b0eb7` |
| 78 | `GET /v1/accounts/me` | 429 | 5 | `qa-cc12c7b1-87e8-4619-abf1-0495ed25b5cd` |
| 79 | `GET /v1/accounts/me` | 429 | 4 | `qa-6ecf13c4-75a7-417d-9068-6fb0974b870a` |
| 80 | `GET /v1/accounts/me` | 429 | 7 | `qa-6e8897a1-9d0e-4046-b8a9-cf3b566a72cd` |
| 81 | `GET /v1/accounts/me` | 200 | 4 | `qa-32b8267e-2d03-44a1-9976-10deadf78ec3` |
| 82 | `DELETE /v1/accounts/me` | 204 | 2 | `qa-2ef56fa0-8945-460e-beb7-09c49b5e5d7b` |
| 83 | `POST /v1/auth/token` | 401 | 3 | `qa-23e63d68-c689-4f1a-bd07-95c493cc34ff` |

## 1. POST /v1/accounts

```text
#1 POST http://localhost:7070/v1/accounts
correlation: qa-b4f64302-cccc-48a1-a951-0419f7cf4e70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b4f64302-cccc-48a1-a951-0419f7cf4e70
Content-Type: application/json

--- request body ---
{"handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","password":"****","region":"eu"}

--- response: 201 in 399 ms ---
Date: Fri, 27 Nov 2026 10:59:56 GMT
Content-Type: application/json
X-Correlation-Id: qa-b4f64302-cccc-48a1-a951-0419f7cf4e70
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
Location: /v1/accounts/qa-2c47e79d9d86
X-Served-Region: eu
Content-Length: 181

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 2. POST /v1/auth/token

```text
#2 POST http://localhost:7070/v1/auth/token
correlation: qa-55eccb05-a5d0-4886-89ba-c6397cb15cec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-55eccb05-a5d0-4886-89ba-c6397cb15cec
Content-Type: application/json

--- request body ---
{"handle":"qa-2c47e79d9d86","password":"****"}

--- response: 200 in 148 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-55eccb05-a5d0-4886-89ba-c6397cb15cec
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
Content-Length: 153

{"accessToken":"****","tokenType":"Bearer","expiresIn":900,"accountId":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b"}
```

## 3. GET /v1/accounts/me

```text
#3 GET http://localhost:7070/v1/accounts/me
correlation: qa-0a7a3567-c56a-4355-a395-d56bf96bf253

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0a7a3567-c56a-4355-a395-d56bf96bf253
Content-Type: application/json

--- response: 200 in 78 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0a7a3567-c56a-4355-a395-d56bf96bf253
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 4. GET /v1/accounts/me

```text
#4 GET http://localhost:7070/v1/accounts/me
correlation: qa-40079003-b890-4c41-8033-8e933d7dbfbb

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-40079003-b890-4c41-8033-8e933d7dbfbb
Content-Type: application/json

--- response: 200 in 25 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-40079003-b890-4c41-8033-8e933d7dbfbb
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 5. GET /v1/accounts/me

```text
#5 GET http://localhost:7070/v1/accounts/me
correlation: qa-0aa410dd-0c65-4577-b7b9-55a0fb3df480

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0aa410dd-0c65-4577-b7b9-55a0fb3df480
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0aa410dd-0c65-4577-b7b9-55a0fb3df480
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 6. GET /v1/accounts/me

```text
#6 GET http://localhost:7070/v1/accounts/me
correlation: qa-df5b1fd9-a18d-4f35-aa42-1d83faa01597

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-df5b1fd9-a18d-4f35-aa42-1d83faa01597
Content-Type: application/json

--- response: 200 in 17 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-df5b1fd9-a18d-4f35-aa42-1d83faa01597
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 7. GET /v1/accounts/me

```text
#7 GET http://localhost:7070/v1/accounts/me
correlation: qa-95045498-559a-4a7a-b834-cd2fa12771e8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95045498-559a-4a7a-b834-cd2fa12771e8
Content-Type: application/json

--- response: 200 in 24 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-95045498-559a-4a7a-b834-cd2fa12771e8
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 8. GET /v1/accounts/me

```text
#8 GET http://localhost:7070/v1/accounts/me
correlation: qa-10203578-0a66-4f63-b2f9-2d10c60fe14f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-10203578-0a66-4f63-b2f9-2d10c60fe14f
Content-Type: application/json

--- response: 200 in 15 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-10203578-0a66-4f63-b2f9-2d10c60fe14f
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 9. GET /v1/accounts/me

```text
#9 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c16b1f0-07cf-42d7-95d1-b2c3625b31c4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c16b1f0-07cf-42d7-95d1-b2c3625b31c4
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c16b1f0-07cf-42d7-95d1-b2c3625b31c4
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 10. GET /v1/accounts/me

```text
#10 GET http://localhost:7070/v1/accounts/me
correlation: qa-d0651dce-13af-4631-a21c-986bd490a415

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d0651dce-13af-4631-a21c-986bd490a415
Content-Type: application/json

--- response: 200 in 20 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-d0651dce-13af-4631-a21c-986bd490a415
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 11. GET /v1/accounts/me

```text
#11 GET http://localhost:7070/v1/accounts/me
correlation: qa-f620e35a-6890-427a-94ec-aec3e6c1790a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f620e35a-6890-427a-94ec-aec3e6c1790a
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f620e35a-6890-427a-94ec-aec3e6c1790a
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 12. GET /v1/accounts/me

```text
#12 GET http://localhost:7070/v1/accounts/me
correlation: qa-e875d13e-bc02-4b27-b987-23aa71954fa5

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e875d13e-bc02-4b27-b987-23aa71954fa5
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-e875d13e-bc02-4b27-b987-23aa71954fa5
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 13. GET /v1/accounts/me

```text
#13 GET http://localhost:7070/v1/accounts/me
correlation: qa-cb98bc5c-50b9-4b34-9286-cd5fdf9bdc58

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cb98bc5c-50b9-4b34-9286-cd5fdf9bdc58
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-cb98bc5c-50b9-4b34-9286-cd5fdf9bdc58
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 14. GET /v1/accounts/me

```text
#14 GET http://localhost:7070/v1/accounts/me
correlation: qa-26f6c581-1912-42eb-86dc-309c99dd32e1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-26f6c581-1912-42eb-86dc-309c99dd32e1
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-26f6c581-1912-42eb-86dc-309c99dd32e1
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 15. GET /v1/accounts/me

```text
#15 GET http://localhost:7070/v1/accounts/me
correlation: qa-2317bf9a-1148-493b-bb77-aed74bf354e4

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2317bf9a-1148-493b-bb77-aed74bf354e4
Content-Type: application/json

--- response: 200 in 14 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-2317bf9a-1148-493b-bb77-aed74bf354e4
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 16. GET /v1/accounts/me

```text
#16 GET http://localhost:7070/v1/accounts/me
correlation: qa-5d11a669-a082-4f81-9ab6-4df9b52f2251

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-5d11a669-a082-4f81-9ab6-4df9b52f2251
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-5d11a669-a082-4f81-9ab6-4df9b52f2251
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 17. GET /v1/accounts/me

```text
#17 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2f8e70c-6b32-4211-b31e-f5f671e1df20

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2f8e70c-6b32-4211-b31e-f5f671e1df20
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2f8e70c-6b32-4211-b31e-f5f671e1df20
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 18. GET /v1/accounts/me

```text
#18 GET http://localhost:7070/v1/accounts/me
correlation: qa-6da18585-ccb9-4503-9310-a68057c5027a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6da18585-ccb9-4503-9310-a68057c5027a
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-6da18585-ccb9-4503-9310-a68057c5027a
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 19. GET /v1/accounts/me

```text
#19 GET http://localhost:7070/v1/accounts/me
correlation: qa-f570c71f-4546-49a6-b7d0-b80e8ffab51a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f570c71f-4546-49a6-b7d0-b80e8ffab51a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-f570c71f-4546-49a6-b7d0-b80e8ffab51a
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 20. GET /v1/accounts/me

```text
#20 GET http://localhost:7070/v1/accounts/me
correlation: qa-b671ab74-f982-43ca-bf8a-21c5b0d176c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b671ab74-f982-43ca-bf8a-21c5b0d176c6
Content-Type: application/json

--- response: 200 in 11 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-b671ab74-f982-43ca-bf8a-21c5b0d176c6
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 21. GET /v1/accounts/me

```text
#21 GET http://localhost:7070/v1/accounts/me
correlation: qa-0b263346-31b9-4039-bbdd-32e709dcf07a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0b263346-31b9-4039-bbdd-32e709dcf07a
Content-Type: application/json

--- response: 200 in 28 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-0b263346-31b9-4039-bbdd-32e709dcf07a
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 22. GET /v1/accounts/me

```text
#22 GET http://localhost:7070/v1/accounts/me
correlation: qa-9a6040e4-54e0-4de1-a48b-b274f3d22ee1

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9a6040e4-54e0-4de1-a48b-b274f3d22ee1
Content-Type: application/json

--- response: 200 in 19 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-9a6040e4-54e0-4de1-a48b-b274f3d22ee1
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 23. GET /v1/accounts/me

```text
#23 GET http://localhost:7070/v1/accounts/me
correlation: qa-42c2c987-1144-4aed-b19b-52f99734efdf

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-42c2c987-1144-4aed-b19b-52f99734efdf
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-42c2c987-1144-4aed-b19b-52f99734efdf
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 24. GET /v1/accounts/me

```text
#24 GET http://localhost:7070/v1/accounts/me
correlation: qa-354485d5-623b-45a8-b9da-bbdf90b2a7cc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-354485d5-623b-45a8-b9da-bbdf90b2a7cc
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-354485d5-623b-45a8-b9da-bbdf90b2a7cc
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 25. GET /v1/accounts/me

```text
#25 GET http://localhost:7070/v1/accounts/me
correlation: qa-3f891335-fc30-48d5-88a5-26a5252d02ca

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-3f891335-fc30-48d5-88a5-26a5252d02ca
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:57 GMT
Content-Type: application/json
X-Correlation-Id: qa-3f891335-fc30-48d5-88a5-26a5252d02ca
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 26. GET /v1/accounts/me

```text
#26 GET http://localhost:7070/v1/accounts/me
correlation: qa-8f23b7ec-0ff0-4ba1-aacd-957d37dce264

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8f23b7ec-0ff0-4ba1-aacd-957d37dce264
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8f23b7ec-0ff0-4ba1-aacd-957d37dce264
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 27. GET /v1/accounts/me

```text
#27 GET http://localhost:7070/v1/accounts/me
correlation: qa-9e09229b-d67f-4450-b1d5-82aaa532d81b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9e09229b-d67f-4450-b1d5-82aaa532d81b
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9e09229b-d67f-4450-b1d5-82aaa532d81b
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 28. GET /v1/accounts/me

```text
#28 GET http://localhost:7070/v1/accounts/me
correlation: qa-4b810226-6d71-4f7c-a642-0ff6fb70e4f8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4b810226-6d71-4f7c-a642-0ff6fb70e4f8
Content-Type: application/json

--- response: 200 in 10 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4b810226-6d71-4f7c-a642-0ff6fb70e4f8
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 29. GET /v1/accounts/me

```text
#29 GET http://localhost:7070/v1/accounts/me
correlation: qa-7b991c2b-0ad4-4111-a66b-71858c6d3068

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7b991c2b-0ad4-4111-a66b-71858c6d3068
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7b991c2b-0ad4-4111-a66b-71858c6d3068
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 30. GET /v1/accounts/me

```text
#30 GET http://localhost:7070/v1/accounts/me
correlation: qa-d5b0fdab-fee4-467a-adbb-564c4ac4f57a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d5b0fdab-fee4-467a-adbb-564c4ac4f57a
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d5b0fdab-fee4-467a-adbb-564c4ac4f57a
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 31. GET /v1/accounts/me

```text
#31 GET http://localhost:7070/v1/accounts/me
correlation: qa-9963e9c3-c62e-465e-aaad-fa81ad271f70

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9963e9c3-c62e-465e-aaad-fa81ad271f70
Content-Type: application/json

--- response: 200 in 16 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9963e9c3-c62e-465e-aaad-fa81ad271f70
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 32. GET /v1/accounts/me

```text
#32 GET http://localhost:7070/v1/accounts/me
correlation: qa-2f339e75-3cc1-45c0-9064-0ae57c3d1c0d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2f339e75-3cc1-45c0-9064-0ae57c3d1c0d
Content-Type: application/json

--- response: 200 in 8 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2f339e75-3cc1-45c0-9064-0ae57c3d1c0d
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 33. GET /v1/accounts/me

```text
#33 GET http://localhost:7070/v1/accounts/me
correlation: qa-7d8658f6-492d-4d0c-b1fc-2199f21516b7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7d8658f6-492d-4d0c-b1fc-2199f21516b7
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-7d8658f6-492d-4d0c-b1fc-2199f21516b7
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 34. GET /v1/accounts/me

```text
#34 GET http://localhost:7070/v1/accounts/me
correlation: qa-f055f0b3-c711-4645-a0ec-5ae6e7ad8aec

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f055f0b3-c711-4645-a0ec-5ae6e7ad8aec
Content-Type: application/json

--- response: 200 in 13 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-f055f0b3-c711-4645-a0ec-5ae6e7ad8aec
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 35. GET /v1/accounts/me

```text
#35 GET http://localhost:7070/v1/accounts/me
correlation: qa-4bedce84-9a5d-45aa-9206-2c5d4cd33152

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4bedce84-9a5d-45aa-9206-2c5d4cd33152
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-4bedce84-9a5d-45aa-9206-2c5d4cd33152
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 36. GET /v1/accounts/me

```text
#36 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ca3f37f-0bbb-49e5-978c-3728a4493244

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ca3f37f-0bbb-49e5-978c-3728a4493244
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-6ca3f37f-0bbb-49e5-978c-3728a4493244
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 37. GET /v1/accounts/me

```text
#37 GET http://localhost:7070/v1/accounts/me
correlation: qa-d83e2c49-f1e3-47f5-996e-510da4e68dab

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-d83e2c49-f1e3-47f5-996e-510da4e68dab
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-d83e2c49-f1e3-47f5-996e-510da4e68dab
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 38. GET /v1/accounts/me

```text
#38 GET http://localhost:7070/v1/accounts/me
correlation: qa-dfbb4d94-f137-4561-84ef-2b4a7ad312e3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-dfbb4d94-f137-4561-84ef-2b4a7ad312e3
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-dfbb4d94-f137-4561-84ef-2b4a7ad312e3
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 39. GET /v1/accounts/me

```text
#39 GET http://localhost:7070/v1/accounts/me
correlation: qa-cf2a2d71-ab6e-4baa-abae-f66cb7860406

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cf2a2d71-ab6e-4baa-abae-f66cb7860406
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cf2a2d71-ab6e-4baa-abae-f66cb7860406
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 40. GET /v1/accounts/me

```text
#40 GET http://localhost:7070/v1/accounts/me
correlation: qa-896c597c-2399-4895-8f0c-5530bd52d078

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-896c597c-2399-4895-8f0c-5530bd52d078
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-896c597c-2399-4895-8f0c-5530bd52d078
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 41. GET /v1/accounts/me

```text
#41 GET http://localhost:7070/v1/accounts/me
correlation: qa-8b13f172-2e3f-4368-8060-7ec28aaa077f

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8b13f172-2e3f-4368-8060-7ec28aaa077f
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8b13f172-2e3f-4368-8060-7ec28aaa077f
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 42. GET /v1/accounts/me

```text
#42 GET http://localhost:7070/v1/accounts/me
correlation: qa-1b7261df-d0c2-4844-ad81-5f487da12a77

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-1b7261df-d0c2-4844-ad81-5f487da12a77
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-1b7261df-d0c2-4844-ad81-5f487da12a77
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 43. GET /v1/accounts/me

```text
#43 GET http://localhost:7070/v1/accounts/me
correlation: qa-e8692dde-dcf3-4403-b073-beaec6c30c83

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-e8692dde-dcf3-4403-b073-beaec6c30c83
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-e8692dde-dcf3-4403-b073-beaec6c30c83
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 44. GET /v1/accounts/me

```text
#44 GET http://localhost:7070/v1/accounts/me
correlation: qa-325405da-997f-4eba-8c4e-90ad9b844555

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-325405da-997f-4eba-8c4e-90ad9b844555
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-325405da-997f-4eba-8c4e-90ad9b844555
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 45. GET /v1/accounts/me

```text
#45 GET http://localhost:7070/v1/accounts/me
correlation: qa-a36385e3-6d5c-4386-8258-c3172af8c901

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-a36385e3-6d5c-4386-8258-c3172af8c901
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-a36385e3-6d5c-4386-8258-c3172af8c901
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 46. GET /v1/accounts/me

```text
#46 GET http://localhost:7070/v1/accounts/me
correlation: qa-cefe76a5-a2fa-4cd4-8508-fee3b0c0bcc6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cefe76a5-a2fa-4cd4-8508-fee3b0c0bcc6
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-cefe76a5-a2fa-4cd4-8508-fee3b0c0bcc6
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 47. GET /v1/accounts/me

```text
#47 GET http://localhost:7070/v1/accounts/me
correlation: qa-b2d8ab64-e75a-4c73-a696-84962838a2c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b2d8ab64-e75a-4c73-a696-84962838a2c6
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-b2d8ab64-e75a-4c73-a696-84962838a2c6
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 48. GET /v1/accounts/me

```text
#48 GET http://localhost:7070/v1/accounts/me
correlation: qa-9ecc951a-c9de-4b66-ae8f-42dfe1e433fc

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9ecc951a-c9de-4b66-ae8f-42dfe1e433fc
Content-Type: application/json

--- response: 200 in 12 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9ecc951a-c9de-4b66-ae8f-42dfe1e433fc
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 49. GET /v1/accounts/me

```text
#49 GET http://localhost:7070/v1/accounts/me
correlation: qa-88da14e9-938b-4afc-a4d0-cb794afb1e3d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-88da14e9-938b-4afc-a4d0-cb794afb1e3d
Content-Type: application/json

--- response: 200 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-88da14e9-938b-4afc-a4d0-cb794afb1e3d
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 50. GET /v1/accounts/me

```text
#50 GET http://localhost:7070/v1/accounts/me
correlation: qa-0210c0b5-aaab-405f-a656-c79577575017

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0210c0b5-aaab-405f-a656-c79577575017
Content-Type: application/json

--- response: 200 in 9 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0210c0b5-aaab-405f-a656-c79577575017
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 51. GET /v1/accounts/me

```text
#51 GET http://localhost:7070/v1/accounts/me
correlation: qa-660e6cfa-08a8-458f-afe9-57d9af0fbcd3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-660e6cfa-08a8-458f-afe9-57d9af0fbcd3
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-660e6cfa-08a8-458f-afe9-57d9af0fbcd3
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 52. GET /v1/accounts/me

```text
#52 GET http://localhost:7070/v1/accounts/me
correlation: qa-0e79a28f-29d2-4f64-a8af-216a26b517ed

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0e79a28f-29d2-4f64-a8af-216a26b517ed
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0e79a28f-29d2-4f64-a8af-216a26b517ed
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 53. GET /v1/accounts/me

```text
#53 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c2b6598-366a-4e28-8101-642b92ab54c6

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2b6598-366a-4e28-8101-642b92ab54c6
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c2b6598-366a-4e28-8101-642b92ab54c6
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 54. GET /v1/accounts/me

```text
#54 GET http://localhost:7070/v1/accounts/me
correlation: qa-0c785d5c-2d30-4d74-9f7a-84dabd3fb3c0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0c785d5c-2d30-4d74-9f7a-84dabd3fb3c0
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0c785d5c-2d30-4d74-9f7a-84dabd3fb3c0
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 55. GET /v1/accounts/me

```text
#55 GET http://localhost:7070/v1/accounts/me
correlation: qa-ddcf7f6e-9e7c-4718-9315-6daf4077dc1e

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ddcf7f6e-9e7c-4718-9315-6daf4077dc1e
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-ddcf7f6e-9e7c-4718-9315-6daf4077dc1e
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 56. GET /v1/accounts/me

```text
#56 GET http://localhost:7070/v1/accounts/me
correlation: qa-0814324f-38b5-4f36-92f0-7e2930121816

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-0814324f-38b5-4f36-92f0-7e2930121816
Content-Type: application/json

--- response: 200 in 6 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-0814324f-38b5-4f36-92f0-7e2930121816
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 57. GET /v1/accounts/me

```text
#57 GET http://localhost:7070/v1/accounts/me
correlation: qa-8c2ffdcc-8efc-4267-8af5-d65ebe0d0d69

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8c2ffdcc-8efc-4267-8af5-d65ebe0d0d69
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-8c2ffdcc-8efc-4267-8af5-d65ebe0d0d69
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 58. GET /v1/accounts/me

```text
#58 GET http://localhost:7070/v1/accounts/me
correlation: qa-bf5b5784-5b11-46b2-b06d-28b454dd08ba

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-bf5b5784-5b11-46b2-b06d-28b454dd08ba
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-bf5b5784-5b11-46b2-b06d-28b454dd08ba
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 59. GET /v1/accounts/me

```text
#59 GET http://localhost:7070/v1/accounts/me
correlation: qa-35bf0c40-1c5c-48ed-9a69-54a3c09e855a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-35bf0c40-1c5c-48ed-9a69-54a3c09e855a
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-35bf0c40-1c5c-48ed-9a69-54a3c09e855a
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 60. GET /v1/accounts/me

```text
#60 GET http://localhost:7070/v1/accounts/me
correlation: qa-9d54aec3-30dc-4bf1-94ef-303d8231bf18

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9d54aec3-30dc-4bf1-94ef-303d8231bf18
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-9d54aec3-30dc-4bf1-94ef-303d8231bf18
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 61. GET /v1/accounts/me

```text
#61 GET http://localhost:7070/v1/accounts/me
correlation: qa-423c7a06-7b82-444f-b21e-157c4119d938

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-423c7a06-7b82-444f-b21e-157c4119d938
Content-Type: application/json

--- response: 200 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-423c7a06-7b82-444f-b21e-157c4119d938
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 62. GET /v1/accounts/me

```text
#62 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c02d024-a1c7-4837-8385-c12989915ce3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c02d024-a1c7-4837-8385-c12989915ce3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/json
X-Correlation-Id: qa-2c02d024-a1c7-4837-8385-c12989915ce3
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 63. GET /v1/accounts/me

```text
#63 GET http://localhost:7070/v1/accounts/me
correlation: qa-b15fe524-ab7c-466a-b5c1-1a31190c00b0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-b15fe524-ab7c-466a-b5c1-1a31190c00b0
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Fri, 27 Nov 2026 10:59:58 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-b15fe524-ab7c-466a-b5c1-1a31190c00b0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-b15fe524-ab7c-466a-b5c1-1a31190c00b0"}
```

## 64. GET /v1/accounts/me

```text
#64 GET http://localhost:7070/v1/accounts/me
correlation: qa-9087f859-5393-49ad-817f-9790523398c3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-9087f859-5393-49ad-817f-9790523398c3
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-9087f859-5393-49ad-817f-9790523398c3
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 9 second(s).","instance":"/v1/accounts/me","correlationId":"qa-9087f859-5393-49ad-817f-9790523398c3"}
```

## 65. GET /v1/accounts/me

```text
#65 GET http://localhost:7070/v1/accounts/me
correlation: qa-7a302318-1a1b-4cc4-ad8f-25977521f031

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7a302318-1a1b-4cc4-ad8f-25977521f031
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 10:59:59 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7a302318-1a1b-4cc4-ad8f-25977521f031
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7a302318-1a1b-4cc4-ad8f-25977521f031"}
```

## 66. GET /v1/accounts/me

```text
#66 GET http://localhost:7070/v1/accounts/me
correlation: qa-ee98d375-b1e7-49d3-bf56-3daa491e348c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ee98d375-b1e7-49d3-bf56-3daa491e348c
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ee98d375-b1e7-49d3-bf56-3daa491e348c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 8 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ee98d375-b1e7-49d3-bf56-3daa491e348c"}
```

## 67. GET /v1/accounts/me

```text
#67 GET http://localhost:7070/v1/accounts/me
correlation: qa-2cc39503-5b0c-4ccf-a197-2be38b4a0c2b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2cc39503-5b0c-4ccf-a197-2be38b4a0c2b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:00 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2cc39503-5b0c-4ccf-a197-2be38b4a0c2b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2cc39503-5b0c-4ccf-a197-2be38b4a0c2b"}
```

## 68. GET /v1/accounts/me

```text
#68 GET http://localhost:7070/v1/accounts/me
correlation: qa-f316d265-a211-47ba-b8bc-d7b7cb095848

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-f316d265-a211-47ba-b8bc-d7b7cb095848
Content-Type: application/json

--- response: 429 in 6 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-f316d265-a211-47ba-b8bc-d7b7cb095848
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 7 second(s).","instance":"/v1/accounts/me","correlationId":"qa-f316d265-a211-47ba-b8bc-d7b7cb095848"}
```

## 69. GET /v1/accounts/me

```text
#69 GET http://localhost:7070/v1/accounts/me
correlation: qa-18a1c72c-0fc1-49d9-af87-c5437da8e26c

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-18a1c72c-0fc1-49d9-af87-c5437da8e26c
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:01 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-18a1c72c-0fc1-49d9-af87-c5437da8e26c
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-18a1c72c-0fc1-49d9-af87-c5437da8e26c"}
```

## 70. GET /v1/accounts/me

```text
#70 GET http://localhost:7070/v1/accounts/me
correlation: qa-2c02cb6f-84a0-4384-9840-30b41f045490

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2c02cb6f-84a0-4384-9840-30b41f045490
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-2c02cb6f-84a0-4384-9840-30b41f045490
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 6 second(s).","instance":"/v1/accounts/me","correlationId":"qa-2c02cb6f-84a0-4384-9840-30b41f045490"}
```

## 71. GET /v1/accounts/me

```text
#71 GET http://localhost:7070/v1/accounts/me
correlation: qa-409628e3-74fa-4516-963c-0f0c5ac6e31d

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-409628e3-74fa-4516-963c-0f0c5ac6e31d
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:02 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-409628e3-74fa-4516-963c-0f0c5ac6e31d
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-409628e3-74fa-4516-963c-0f0c5ac6e31d"}
```

## 72. GET /v1/accounts/me

```text
#72 GET http://localhost:7070/v1/accounts/me
correlation: qa-ce60a7e4-a22c-43b3-903b-4e103d9b552b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-ce60a7e4-a22c-43b3-903b-4e103d9b552b
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-ce60a7e4-a22c-43b3-903b-4e103d9b552b
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 5 second(s).","instance":"/v1/accounts/me","correlationId":"qa-ce60a7e4-a22c-43b3-903b-4e103d9b552b"}
```

## 73. GET /v1/accounts/me

```text
#73 GET http://localhost:7070/v1/accounts/me
correlation: qa-95f767ad-22db-4d25-bda9-36706b6b1124

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-95f767ad-22db-4d25-bda9-36706b6b1124
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:03 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-95f767ad-22db-4d25-bda9-36706b6b1124
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-95f767ad-22db-4d25-bda9-36706b6b1124"}
```

## 74. GET /v1/accounts/me

```text
#74 GET http://localhost:7070/v1/accounts/me
correlation: qa-7e56b5f7-a78f-4fa0-9be8-54e1cac76ec0

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-7e56b5f7-a78f-4fa0-9be8-54e1cac76ec0
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-7e56b5f7-a78f-4fa0-9be8-54e1cac76ec0
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 4 second(s).","instance":"/v1/accounts/me","correlationId":"qa-7e56b5f7-a78f-4fa0-9be8-54e1cac76ec0"}
```

## 75. GET /v1/accounts/me

```text
#75 GET http://localhost:7070/v1/accounts/me
correlation: qa-8084e7c1-c4ee-40e0-8536-1dcc139473d8

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-8084e7c1-c4ee-40e0-8536-1dcc139473d8
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:04 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-8084e7c1-c4ee-40e0-8536-1dcc139473d8
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-8084e7c1-c4ee-40e0-8536-1dcc139473d8"}
```

## 76. GET /v1/accounts/me

```text
#76 GET http://localhost:7070/v1/accounts/me
correlation: qa-4919255e-4ea3-41c6-b00f-eb42d24fa156

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-4919255e-4ea3-41c6-b00f-eb42d24fa156
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-4919255e-4ea3-41c6-b00f-eb42d24fa156
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 3 second(s).","instance":"/v1/accounts/me","correlationId":"qa-4919255e-4ea3-41c6-b00f-eb42d24fa156"}
```

## 77. GET /v1/accounts/me

```text
#77 GET http://localhost:7070/v1/accounts/me
correlation: qa-c615415d-8f57-4afe-88f5-1c129c0b0eb7

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-c615415d-8f57-4afe-88f5-1c129c0b0eb7
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:05 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-c615415d-8f57-4afe-88f5-1c129c0b0eb7
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-c615415d-8f57-4afe-88f5-1c129c0b0eb7"}
```

## 78. GET /v1/accounts/me

```text
#78 GET http://localhost:7070/v1/accounts/me
correlation: qa-cc12c7b1-87e8-4619-abf1-0495ed25b5cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-cc12c7b1-87e8-4619-abf1-0495ed25b5cd
Content-Type: application/json

--- response: 429 in 5 ms ---
Date: Fri, 27 Nov 2026 11:00:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-cc12c7b1-87e8-4619-abf1-0495ed25b5cd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 2 second(s).","instance":"/v1/accounts/me","correlationId":"qa-cc12c7b1-87e8-4619-abf1-0495ed25b5cd"}
```

## 79. GET /v1/accounts/me

```text
#79 GET http://localhost:7070/v1/accounts/me
correlation: qa-6ecf13c4-75a7-417d-9068-6fb0974b870a

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6ecf13c4-75a7-417d-9068-6fb0974b870a
Content-Type: application/json

--- response: 429 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:06 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6ecf13c4-75a7-417d-9068-6fb0974b870a
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6ecf13c4-75a7-417d-9068-6fb0974b870a"}
```

## 80. GET /v1/accounts/me

```text
#80 GET http://localhost:7070/v1/accounts/me
correlation: qa-6e8897a1-9d0e-4046-b8a9-cf3b566a72cd

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-6e8897a1-9d0e-4046-b8a9-cf3b566a72cd
Content-Type: application/json

--- response: 429 in 7 ms ---
Date: Fri, 27 Nov 2026 11:00:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-6e8897a1-9d0e-4046-b8a9-cf3b566a72cd
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

{"type":"https://reference-service.example/problems/rate-limited","title":"Too many requests","status":429,"detail":"Slow down; retry after 1 second(s).","instance":"/v1/accounts/me","correlationId":"qa-6e8897a1-9d0e-4046-b8a9-cf3b566a72cd"}
```

## 81. GET /v1/accounts/me

```text
#81 GET http://localhost:7070/v1/accounts/me
correlation: qa-32b8267e-2d03-44a1-9976-10deadf78ec3

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-32b8267e-2d03-44a1-9976-10deadf78ec3
Content-Type: application/json

--- response: 200 in 4 ms ---
Date: Fri, 27 Nov 2026 11:00:07 GMT
Content-Type: application/json
X-Correlation-Id: qa-32b8267e-2d03-44a1-9976-10deadf78ec3
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

{"id":"acc_c0c42cab-29fb-4fab-89f5-4e2c534ae04b","handle":"qa-2c47e79d9d86","displayName":"QA 2c47e79d9d86","region":"eu","role":"user","createdAt":"2026-11-27T10:59:56.460439079Z"}
```

## 82. DELETE /v1/accounts/me

```text
#82 DELETE http://localhost:7070/v1/accounts/me
correlation: qa-2ef56fa0-8945-460e-beb7-09c49b5e5d7b

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-2ef56fa0-8945-460e-beb7-09c49b5e5d7b
Content-Type: application/json

--- response: 204 in 2 ms ---
Date: Fri, 27 Nov 2026 11:00:07 GMT
Content-Type: text/plain
X-Correlation-Id: qa-2ef56fa0-8945-460e-beb7-09c49b5e5d7b
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
correlation: qa-23e63d68-c689-4f1a-bd07-95c493cc34ff

--- request headers ---
Accept: application/json
X-Correlation-Id: qa-23e63d68-c689-4f1a-bd07-95c493cc34ff
Content-Type: application/json

--- request body ---
{"handle":"qa-2c47e79d9d86","password":"****"}

--- response: 401 in 3 ms ---
Date: Fri, 27 Nov 2026 11:00:07 GMT
Content-Type: application/problem+json
X-Correlation-Id: qa-23e63d68-c689-4f1a-bd07-95c493cc34ff
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

{"type":"https://reference-service.example/problems/invalid-credentials","title":"Invalid credentials","status":401,"detail":"Handle or password is wrong.","instance":"/v1/auth/token","correlationId":"qa-23e63d68-c689-4f1a-bd07-95c493cc34ff"}
```
